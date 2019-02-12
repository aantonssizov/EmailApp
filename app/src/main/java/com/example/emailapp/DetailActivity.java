package com.example.emailapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Restore email item
        EmailItem emailItem = getIntent().getParcelableExtra("email item");

        // Extract data
        String userImg = emailItem.getUserImg();
        String userName = emailItem.getUserName();
        String emailSubject = emailItem.getEmailSubject();
        String emailCompose = emailItem.getEmailCompose();
        String emailDate = emailItem.getEmailDate();

        // Find needed views
        ImageView userImgIv = findViewById(R.id.user_image_detail);
        TextView userNameTv = findViewById(R.id.user_name_detail);
        TextView emailSubjectTv = findViewById(R.id.email_subject_detail);
        TextView emailComposeTv = findViewById(R.id.email_compose_detail);
        TextView emailDateTv = findViewById(R.id.email_date_detail);

        // Place data into views
        // Using Glide for load images
        if (userImg != null && !userImg.isEmpty()) {
            Glide.with(this) // our context variable where we will draw our items
                    .load(userImg)
                    .into(userImgIv);
        } else {
            String userImgDefault = "http://simpleicon.com/wp-content/uploads/user1.png";
            Glide.with(this)
                    .load(userImgDefault)
                    .into(userImgIv);
        }

        // load other data
        if (userName != null && !userName.isEmpty()) {
            userNameTv.setText(userName);
        } else {
            userNameTv.setText(R.string.user_name);
        }

        if (emailSubject != null && !emailSubject.isEmpty()) {
            emailSubjectTv.setText(emailSubject);
        } else {
            emailSubjectTv.setText(R.string.email_subject);
        }

        if (emailCompose != null && !emailCompose.isEmpty()) {
            emailComposeTv.setText(emailCompose);
        } else {
            emailComposeTv.setText(R.string.email_compose);
        }

        if (emailDate != null && !emailDate.isEmpty()) {
            emailDateTv.setText(emailDate);
        } else {
            emailDateTv.setText(R.string.email_date);
        }
    }
}
