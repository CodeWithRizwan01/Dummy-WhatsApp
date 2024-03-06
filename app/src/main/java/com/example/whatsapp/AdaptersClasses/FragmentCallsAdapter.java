package com.example.whatsapp.AdaptersClasses;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.whatsapp.ModelClasses.CallsModel;
import com.example.whatsapp.R;

import java.util.ArrayList;

public class FragmentCallsAdapter extends RecyclerView.Adapter<FragmentCallsAdapter.ViewHolder>{

Context context;
ArrayList<CallsModel> list;

    public FragmentCallsAdapter(Context context, ArrayList<CallsModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(context).inflate(R.layout.fragment_call_sample,parent,false);
        return new  ViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        CallsModel model = list.get(position);
        holder.ivPerson.setImageResource(model.getIvImage());

        holder.tvName.setText(model.getTvName());
        holder.tvCallTime.setText(model.getTvCallTime());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivPerson;
        TextView tvName,tvCallTime;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivPerson = itemView.findViewById(R.id.iv_Person);

            tvName = itemView.findViewById(R.id.tv_Calls_name);
            tvCallTime = itemView.findViewById(R.id.tv_Calls_time);
        }
    }
}
