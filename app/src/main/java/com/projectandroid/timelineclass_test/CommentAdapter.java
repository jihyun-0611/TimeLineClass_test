package com.projectandroid.timelineclass_test;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.ViewHolder>{
    ArrayList<Comment> items = new ArrayList<Comment>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.comment_layout, viewGroup, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Comment item = items.get(position);
        viewHolder.setItem(item);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void addItem(Comment item){
        items.add(item);
    }
    public void setItems(ArrayList<Comment> items){
        this.items = items;
    }

    public Comment getItem(int position){
        return items.get(position);
    }

    public void setItem(int position, Comment item){
        items.set(position, item);
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvName;
        TextView tvVideoTime;
        TextView tvComment;

        public ViewHolder(View itemView){
            super(itemView);

            tvName = itemView.findViewById(R.id.studentName);
            tvVideoTime = itemView.findViewById(R.id.videoTime);
            tvComment = itemView.findViewById(R.id.commentContent);
        }

        public void setItem(Comment item){
            tvName.setText(item.getName());
            tvVideoTime.setText(item.getVideoTime());
            tvComment.setText(item.getContent());
        }
    }


}