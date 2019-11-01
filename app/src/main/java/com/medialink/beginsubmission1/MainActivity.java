package com.medialink.beginsubmission1;

import android.os.Bundle;
import android.util.Log;
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
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity
        implements RecipeAdapter.RecipeCallback {
    private static final String TAG = "MainActivity";
    private RecyclerView rvMain;
    private RecipeAdapter mAdapter;
    private ArrayList<RecipesItem> listData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdapter = new RecipeAdapter(this, this);

        rvMain = findViewById(R.id.rv_main);
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
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelableArrayList("DATA", listData);
    }

    @Override
    public void onItemClick(RecipesItem item) {
        Log.d(TAG, "onItemClick: " + item.getTitle());
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
