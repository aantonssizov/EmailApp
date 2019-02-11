package com.example.emailapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class EmailAdapter extends RecyclerView.Adapter<EmailAdapter.ViewHolder> {
    private Context context; // our Activity
    private List<EmailItem> emailItems; // Data for list items

    public EmailAdapter(Context context, List<EmailItem> emailItems) {
        this.context = context;
        this.emailItems = emailItems;
    }

    // We use ribbon of emails layout for draw our items
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.ribbon_of_emails_item, parent, false);
        return new ViewHolder(view);
    }

    // give data for items
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final EmailItem item = emailItems.get(position); // get current item

        // Using Glide for load images
        if (item.getUserImg() != null && !item.getUserImg().isEmpty()) {
            Glide.with(context) // our context variable where we will draw our items
                    .load(item.getUserImg())
                    .into(holder.userImg);
        } else {
            String userImgDefault = "http://simpleicon.com/wp-content/uploads/user1.png";
            Glide.with(context)
                    .load(userImgDefault)
                    .into(holder.userImg);
        }

        // load other data
        if (item.getUserName() != null && !item.getUserName().isEmpty()) {
            holder.userNameTv.setText(item.getUserName());
        } else {
            holder.userNameTv.setText(R.string.user_name);
        }

        if (item.getEmailHeader() != null && !item.getEmailHeader().isEmpty()) {
            holder.emailHeaderTv.setText(item.getEmailHeader());
        } else {
            holder.emailHeaderTv.setText(R.string.email_header);
        }

        if (item.getEmailText() != null && !item.getEmailText().isEmpty()) {
            holder.emailTextTv.setText(item.getEmailText());
        } else {
            holder.emailTextTv.setText(R.string.email_text);
        }

        if (item.getEmailTimePassed() != null && !item.getEmailTimePassed().isEmpty()) {
            holder.emailTimePassedTv.setText(item.getEmailTimePassed());
        } else {
            holder.emailTimePassedTv.setText(R.string.time_passed);
        }
    }

    @Override
    public int getItemCount() {
        return (emailItems == null) ? 0 : emailItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView userImg;
        TextView userNameTv, emailHeaderTv, emailTextTv, emailTimePassedTv;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            userImg = itemView.findViewById(R.id.user_image_view);
            userNameTv = itemView.findViewById(R.id.user_text_view);
            emailHeaderTv = itemView.findViewById(R.id.email_header_text_view);
            emailTextTv = itemView.findViewById(R.id.email_text_text_view);
            emailTimePassedTv = itemView.findViewById(R.id.email_time_passed_text_view);
        }
    }
}
