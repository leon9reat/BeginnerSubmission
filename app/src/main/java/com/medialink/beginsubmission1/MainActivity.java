package com.medialink.beginsubmission1;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import com.medialink.beginsubmission1.adapter.RecipeAdapter;
import com.medialink.beginsubmission1.model.ReceipeRespon;
import com.medialink.beginsubmission1.model.RecipesItem;
import com.medialink.beginsubmission1.network.ApiInterface;
import com.medialink.beginsubmission1.network.RetrofitClient;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity
        implements RecipeAdapter.RecipeCallback {
    private static final String TAG = "MainActivity";
    private RecipeAdapter mAdapter;
    private ArrayList<RecipesItem> listData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdapter = new RecipeAdapter(this, this);

        RecyclerView rvMain = findViewById(R.id.rv_main);
        rvMain.setHasFixedSize(true);
        rvMain.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        rvMain.setAdapter(mAdapter);

        if (savedInstanceState == null) {
            getData();
        } else {
            listData = savedInstanceState.getParcelableArrayList("DATA");
            mAdapter.setData(listData);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.profile_menu_main) {
            Intent profileIntent = new Intent(this, ProfileActivity.class);
            startActivity(profileIntent);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelableArrayList("DATA", listData);
    }

    @Override
    public void onItemClick(RecipesItem item) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("EXTRA_DATA", item);
        startActivity(intent);
    }

    private void getData() {
        ApiInterface service = RetrofitClient.getRetrofit().create(ApiInterface.class);
        service.getRandom(BuildConfig.ApiKey, true, null, 15)
                .enqueue(new Callback<ReceipeRespon>() {
                    @Override
                    public void onResponse(Call<ReceipeRespon> call, Response<ReceipeRespon> response) {
                        if (response.isSuccessful()) {
                            if (response.body().getRecipes() != null) {
                                listData.addAll(response.body().getRecipes());
                                mAdapter.setData(listData);
                            }
                        } else {
                            Toast.makeText(MainActivity.this, response.message(), Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<ReceipeRespon> call, Throwable t) {
                        Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });
    }
}
