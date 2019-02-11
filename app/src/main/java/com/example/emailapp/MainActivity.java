package com.example.emailapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<EmailItem> data = generateData();
    private RecyclerView ribbonOfEmails;
    private RecyclerView.Adapter ribbonOfEmailsAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Load our Recycler View
        ribbonOfEmails = (RecyclerView) findViewById(R.id.ribbon_of_emails);

        layoutManager = new LinearLayoutManager(this);
        ribbonOfEmails.setLayoutManager(layoutManager);

        ribbonOfEmailsAdapter = new EmailAdapter(this, data);
        ribbonOfEmails.setAdapter(ribbonOfEmailsAdapter);
    }

    private List<EmailItem> generateData() {
        List<EmailItem> list = new ArrayList<>();
        list.add(new EmailItem("https://diylogodesigns.com/wp-content/uploads/2016/04/Microsoft-Logo-icon-png-Transparent-Background-768x768.png", "Microsoft", "Your free trial has ended", "Your free trial has ended! You must to buy pro version.", "1d"));
        list.add(new EmailItem("https://images.vexels.com/media/users/3/129234/isolated/preview/73970c892d748c7507db8e10d71535b0-apple-logo-icon-by-vexels.png", "Apple", "You need to upgrade your iphone", "You need to upgrade your iphone, just install new ios 12.1.8", "3d"));
        list.add(new EmailItem("http://www.stickpng.com/assets/images/5847f9cbcef1014c0b5e48c8.png", "Google", "Do you want to watch your usage statics?", "Do you want to watch your usage statics? We was collected your usage statics for last month.", "4h"));
        list.add(new EmailItem("https://www.morphosys.com/sites/default/files/images/teaser/twitter-front-new.png", "Twitter", "New post in \"Cooking masters\".", "New post in \"Cooking masters\". How to cook an apple pie.", "3s"));
        list.add(new EmailItem("https://image.spreadshirtmedia.com/image-server/v1/mp/products/T812A231MPA3140PT17X98Y45D1011817582S20/views/1,width=800,height=800,appearanceId=39,backgroundColor=F2F2F2,modelId=115,crop=detail,version=1543820067/white-logo-transparent-background-men-s-premium-t-shirt.jpg", "Joe Smith", "Meeting", "Hi. Can we meet in saturday?", "5h"));
        list.add(new EmailItem("https://nalacat.com/wp-content/uploads/2016/03/cat.png", "Cat store", "Sale of feed", "Tomorrow, we started sale of feed. So lets quickly to buy ou feed.", "2d"));
        list.add(new EmailItem("https://cdn.pixabay.com/photo/2012/04/23/16/18/maple-leaf-38777_960_720.png", "Canada", "Salaries", "Today we was improve salaries for all by 200 canadian dollars.", "1d"));
        list.add(new EmailItem("http://logok.org/wp-content/uploads/2014/10/Expedia-logo-340x214.png", "Travel company", "You was won the travel to Spain.", "You was won the travel to Spain. Tell us about details", "2d"));
        list.add(new EmailItem("http://www.stickpng.com/assets/images/580b57fcd9996e24bc43c468.png", "Car", "Update your auto system!", "Update your auto system! We was published new auto version 2.6.4!", "1d"));
        return list;
    }
}
