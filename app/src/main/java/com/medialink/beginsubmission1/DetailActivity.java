package com.medialink.beginsubmission1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.medialink.beginsubmission1.adapter.IngredientAdapter;
import com.medialink.beginsubmission1.model.ExtendedIngredientsItem;
import com.medialink.beginsubmission1.model.RecipesItem;

public class DetailActivity extends AppCompatActivity
implements IngredientAdapter.IngredientCallback{
    private static final String TAG = "DetailActivity";
    private RecipesItem item;
    private TextView tvTitle, tvInstruction;
    private ImageView imgRecipe;
    private IngredientAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        initWidget();


        if (savedInstanceState == null) {
            item = this.getIntent().getParcelableExtra("EXTRA_DATA");
            Log.d(TAG, "onCreate: "+item.getExtendedIngredients().size());
        } else {
            item = savedInstanceState.getParcelable("DATA");
        }

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(getResources().getString(R.string.recipe_detail));
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        setWidget(item);
        mAdapter.setData(item.getExtendedIngredients());
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelable("DATA", item);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    private void initWidget() {
        tvTitle = findViewById(R.id.tv_title_detail);
        tvInstruction = findViewById(R.id.tv_instruction_detail);
        imgRecipe = findViewById(R.id.img_recipe_detail);
        mAdapter = new IngredientAdapter(this, this);
        RecyclerView rvIngredient = findViewById(R.id.rv_detail);
        rvIngredient.setAdapter(mAdapter);
    }

    private void setWidget(RecipesItem item) {
        tvTitle.setText(item.getTitle());
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            tvInstruction.setText(Html.fromHtml(item.getInstructions(), Html.FROM_HTML_MODE_COMPACT));
        } else {
            tvInstruction.setText(Html.fromHtml(item.getInstructions()));
        }

        Glide.with(this)
                .load(item.getImage())
                .centerCrop()
                .into(imgRecipe);
    }

    @Override
    public void onItemClick(ExtendedIngredientsItem ingredient) {
        Log.d(TAG, "onItemClick: "+item.getTitle());
    }
}
