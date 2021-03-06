package com.example.project2;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import java.util.List;

public class SliderAdapter extends RecyclerView.Adapter<SliderAdapter.MyViewHolder> {


    List<Data> list;

    public SliderAdapter(List<Data> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_items,parent,false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.title.setText(list.get(position).getTitle());
        holder.description.setText(list.get(position).getDescription());
        holder.imageView.setImageResource(list.get(position).getImages());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView title,description;
        ImageView imageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.textView);
            description = itemView.findViewById(R.id.text2);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
