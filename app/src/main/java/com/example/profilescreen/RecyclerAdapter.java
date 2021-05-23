package com.example.profilescreen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private Context context;
    private String[] list;
    private int[] img_list;

    public RecyclerAdapter(Context context, String[] list, int[] img_list) {
        this.context = context;
        this.list = list;
        this.img_list = img_list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_list,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txt_live_stream.setText(list[position]);
        holder.img.setImageResource(img_list[position]);

    }

    @Override
    public int getItemCount() {
        return list.length;

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView txt_live_stream;
        ImageView img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_live_stream = itemView.findViewById(R.id.txt_live_stream);
            img=itemView.findViewById(R.id.imgSource);
        }
    }
}
