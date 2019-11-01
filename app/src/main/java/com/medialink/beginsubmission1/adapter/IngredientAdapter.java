package com.medialink.beginsubmission1.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.medialink.beginsubmission1.R;
import com.medialink.beginsubmission1.model.ExtendedIngredientsItem;

import java.util.ArrayList;
import java.util.List;

public class IngredientAdapter extends RecyclerView.Adapter<IngredientAdapter.MyViewHolder> {
    private static final String TAG = "IngredientAdapter";

    private List<ExtendedIngredientsItem> listItem = new ArrayList<>();
    private IngredientCallback callback;
    private Context context;

    public IngredientAdapter(Context context, IngredientCallback callback) {
        this.callback = callback;
        this.context = context;
    }

    public void setData(List<ExtendedIngredientsItem> items) {
        this.listItem.clear();
        this.listItem.addAll(items);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.extend_ingredient_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final ExtendedIngredientsItem item = listItem.get(position);
        holder.tvName.setText(item.getName());

        Glide.with(context)
                .load("https://spoonacular.com/cdn/ingredients_100x100/"+item.getImage())
                .centerCrop()
                .override(100, 100)
                .into(holder.imgIngredient);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callback.onItemClick(item);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listItem.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imgIngredient;
        TextView tvName;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgIngredient = itemView.findViewById(R.id.img_extend_ingredient);
            tvName = itemView.findViewById(R.id.tv_name_ingredient);
        }
    }

    public interface IngredientCallback {
        void onItemClick(ExtendedIngredientsItem ingredient);
    }
}
