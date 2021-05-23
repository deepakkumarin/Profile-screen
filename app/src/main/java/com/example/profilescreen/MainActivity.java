package com.example.profilescreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler_view;
    private RecyclerAdapter recyclerAdapter;
    private String[] list= {"My Live Stream","Messages","Top Gifters","My Wallet","My Subscriptions","Find Friends","Redeem Cash $","Settings"};
    int[] img={R.drawable.ic_live,R.drawable.ic_baseline_email_24,R.drawable.ic_baseline_people_24,R.drawable.ic_baseline_account_balance_wallet_24,R.drawable.ic_rss,
            R.drawable.ic_baseline_manage_accounts_24,R.drawable.ic_baseline_view_agenda_24,R.drawable.ic_baseline_settings_24};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler_view = findViewById(R.id.recycler_view);
        recyclerAdapter = new RecyclerAdapter(MainActivity.this,list,img);
        recycler_view.setAdapter(recyclerAdapter);

    }
}