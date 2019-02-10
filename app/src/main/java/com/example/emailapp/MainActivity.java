package com.example.emailapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView ribbonOfEmails;
    private RecyclerView.Adapter ribbonOfEmailsAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ribbonOfEmails = (RecyclerView) findViewById(R.id.ribbon_of_emails);


    }
}
