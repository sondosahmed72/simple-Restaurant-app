package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class OrderSummaryActivity extends AppCompatActivity {

    private TextView orderSummaryTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_summary);

        orderSummaryTextView = findViewById(R.id.orderSummaryTextView);

        // Get the order summary from the intent
        String orderSummary = getIntent().getStringExtra("orderSummary");

        // Display the order summary
        orderSummaryTextView.setText(orderSummary);
    }
}
