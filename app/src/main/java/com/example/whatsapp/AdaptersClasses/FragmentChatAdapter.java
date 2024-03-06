package com.example.whatsapp.AdaptersClasses;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.whatsapp.ModelClasses.FragmentChatModel;
import com.example.whatsapp.R;

import java.util.ArrayList;

public class FragmentChatAdapter extends RecyclerView.Adapter<FragmentChatAdapter.ViewHolder>{

    public FragmentChatAdapter(Context context, ArrayList<FragmentChatModel> list) {
        this.context = context;
        this.list = list;
    }

    Context context;
    ArrayList<FragmentChatModel> list;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(context).inflate(R.layout.fragment_chats_sample_recyclerviw,parent,false);
        return new ViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        FragmentChatModel model = list.get(position);
        holder.tvName.setText(model.getName());
        holder.tvMessage.setText(model.getMessage());
        holder.tvTime.setText(model.getTime());
        holder.imageView.setImageResource(model.getImage());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView tvName,tvMessage,tvTime;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.iv_chat);
            tvName = itemView.findViewById(R.id.tv_chat_name);
            tvMessage = itemView.findViewById(R.id.tv_Chat_message);
            tvTime = itemView.findViewById(R.id.tv_Chat_time);
        }
    }
}
