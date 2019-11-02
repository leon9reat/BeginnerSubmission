package com.medialink.beginsubmission1.adapter;

import android.content.Context;
import android.os.Build;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.medialink.beginsubmission1.R;
import com.medialink.beginsubmission1.model.RecipesItem;

import java.util.ArrayList;
import java.util.List;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.MyViewHolder> {
    private final List<RecipesItem> listRecipe = new ArrayList<>();
    private final RecipeCallback callback;
    private final Context context;

    public RecipeAdapter(Context context, RecipeCallback callback) {
        this.context = context;
        this.callback = callback;
    }

    public void setData(List<RecipesItem> list) {
        this.listRecipe.clear();
        this.listRecipe.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recipe_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final RecipesItem item = listRecipe.get(position);
        holder.tvTitle.setText(item.getTitle());
        holder.tvHealthScore.setText(String.format("Health Score: %1$,.2f", item.getHealthScore()));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            holder.tvInstruction.setText(Html.fromHtml(item.getInstructions(), Html.FROM_HTML_MODE_COMPACT));
        } else {
            holder.tvInstruction.setText(Html.fromHtml(item.getInstructions()));
        }


        Glide.with(context)
                .load(item.getImage())
                .centerCrop()
                .override(100, 100)
                .into(holder.imgRecipe);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callback.onItemClick(item);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listRecipe.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        final TextView tvTitle;
        final TextView tvHealthScore;
        final TextView tvInstruction;
        final ImageView imgRecipe;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvTitle = itemView.findViewById(R.id.tv_title);
            tvHealthScore = itemView.findViewById(R.id.tv_health_score);
            tvInstruction = itemView.findViewById(R.id.tv_instruction);
            imgRecipe = itemView.findViewById(R.id.img_recipe_detail);
        }
    }

    public interface RecipeCallback {
        void onItemClick(RecipesItem item);
    }
}
