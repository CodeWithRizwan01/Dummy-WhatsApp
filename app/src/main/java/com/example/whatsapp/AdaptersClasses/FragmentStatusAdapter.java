package com.example.whatsapp.AdaptersClasses;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.whatsapp.ModelClasses.FragmentStatusModel;
import com.example.whatsapp.R;

import java.util.ArrayList;

public class FragmentStatusAdapter extends RecyclerView.Adapter<FragmentStatusAdapter.ViewHolder> {

    Context context;
    ArrayList<FragmentStatusModel> list;
    public FragmentStatusAdapter(Context context, ArrayList<FragmentStatusModel> list) {
        this.context = context;
        this.list = list;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View rootView = LayoutInflater.from(context).inflate(R.layout.fragment_status_sample,parent,false);

        return new ViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    FragmentStatusModel model = list.get(position);
    holder.ivStatus.setImageResource(model.getImage());
    holder.tvName.setText(model.getName());
    holder.tvTime.setText(model.getTime());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivStatus;
        TextView tvName,tvTime;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivStatus = itemView.findViewById(R.id.iv_status_fragment);
            tvName = itemView.findViewById(R.id.tv_name1_status);
            tvTime = itemView.findViewById(R.id.tv_time1_status);
        }
    }

}
