package com.example.trackmyvehichle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class AdapterChat extends RecyclerView.Adapter<HolderChat> {

    private List<ModelChat> dataChat;
    String user;

    public AdapterChat(List<ModelChat> dataChat, String user) {
        this.dataChat = dataChat;
        this.user = user;
    }

    @Override
    public HolderChat onCreateViewHolder(ViewGroup parent, int viewType) {
        View v  = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_chat , parent , false);
        return new HolderChat(v);
    }

    @Override
    public void onBindViewHolder(HolderChat holder, int position) {
        holder.setContent(dataChat.get(position),user);
    }

    @Override
    public int getItemCount() {
        return dataChat.size();
    }
}
