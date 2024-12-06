package com.example.Test;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class ItemsActivity extends AppCompatActivity implements ItemsAdapter.OnItemClickListener {

    private RecyclerView itemsRecyclerView;
    private ItemsAdapter adapter;
    private List<MenuItem> menuItems;
    private TextView totalPriceText;
    private double totalPrice = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);

        // Initialize UI components
        itemsRecyclerView = findViewById(R.id.itemsRecyclerView);
        totalPriceText = findViewById(R.id.totalPriceText);
        Button checkoutButton = findViewById(R.id.checkoutButton);

        // Create sample menu items
        menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Pizza", 10.0));
        menuItems.add(new MenuItem("Burger", 5.0));
        menuItems.add(new MenuItem("Pasta", 7.0));

        // Set up RecyclerView
        itemsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ItemsAdapter(menuItems, this);
        itemsRecyclerView.setAdapter(adapter);

        // Checkout button functionality
        checkoutButton.setOnClickListener(v -> {
            // Handle checkout action
            // Navigate to summary page
        });
    }

    @Override
    public void onAddToCart(MenuItem menuItem) {
        // Update total price and display it
        totalPrice += menuItem.getTotalPrice();
        totalPriceText.setText("Total Price: $" + totalPrice);
    }
}