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
    private EmailItemClicked callback;

    EmailAdapter(Context context, List<EmailItem> emailItems, EmailItemClicked callback) {
        this.context = context;
        this.emailItems = emailItems;
        this.callback = callback;
    }

    // We use ribbon of emails layout for draw our items
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.ribbon_of_emails_item, parent, false);
        final ViewHolder holder = new ViewHolder(view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int adapterPosition = holder.getAdapterPosition();

                if (adapterPosition != RecyclerView.NO_POSITION && callback != null) {
                    callback.ItemClickedCallback(adapterPosition);
                }
            }
        });
        return holder;
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

        if (item.getEmailSubject() != null && !item.getEmailSubject().isEmpty()) {
            holder.emailSubjectTv.setText(item.getEmailSubject());
        } else {
            holder.emailSubjectTv.setText(R.string.email_subject);
        }

        if (item.getEmailCompose() != null && !item.getEmailCompose().isEmpty()) {
            holder.emailComposeTv.setText(item.getEmailCompose());
        } else {
            holder.emailComposeTv.setText(R.string.email_compose);
        }

        if (item.getEmailDate() != null && !item.getEmailDate().isEmpty()) {
            holder.emailDateTv.setText(item.getEmailDate());
        } else {
            holder.emailDateTv.setText(R.string.email_date);
        }
    }

    @Override
    public int getItemCount() {
        return (emailItems == null) ? 0 : emailItems.size();
    }

    interface EmailItemClicked {
        void ItemClickedCallback(int itemPosition);
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView userImg;
        TextView userNameTv, emailSubjectTv, emailComposeTv, emailDateTv;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            userImg = itemView.findViewById(R.id.user_image_view);
            userNameTv = itemView.findViewById(R.id.user_text_view);
            emailSubjectTv = itemView.findViewById(R.id.email_subject_text_view);
            emailComposeTv = itemView.findViewById(R.id.email_compose_text_view);
            emailDateTv = itemView.findViewById(R.id.email_date_text_view);
        }
    }
}
