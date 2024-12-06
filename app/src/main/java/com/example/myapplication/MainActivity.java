package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button btnMainCourse = findViewById(R.id.btn_main_course);
//        Button btnSideDish = findViewById(R.id.btn_side_dish);
//        Button btnDrinks = findViewById(R.id.btn_drinks);

//        btnMainCourse.setOnClickListener(v -> navigateToItems("Main Course"));
//        btnSideDish.setOnClickListener(v -> navigateToItems("Side Dish"));
//        btnDrinks.setOnClickListener(v -> navigateToItems("Drinks"));
    }

    private void navigateToItems(String dishType) {
        Intent intent = new Intent(MainActivity.this, ItemsActivity.class);
        intent.putExtra("dishType", dishType);
        startActivity(intent);
    }
}
