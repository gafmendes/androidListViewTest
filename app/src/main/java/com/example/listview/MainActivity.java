package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<Candies> supplierNames = Arrays.asList(
                new Candies(R.drawable.donut_circle, "Donuts are glazed and sprinkled with candy"),
                new Candies(R.drawable.donut_circle, "Donuts are glazed and sprinkled with candy"),
                new Candies(R.drawable.icecream_circle, "FroYo is premium self-serve frozen yogurt"),
                new Candies(R.drawable.froyo_circle,"Ice cream sandwiches have chocolate wafers and vanilla filling"),
                new Candies(R.drawable.froyo_circle,"Ice cream sandwiches have chocolate wafers and vanilla filling"),
                new Candies(R.drawable.donut_circle, "Donuts are glazed and sprinkled with candy"),
                new Candies(R.drawable.icecream_circle, "FroYo is premium self-serve frozen yogurt"));


        // ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, R.layout.activity_dois, lista);

        DessertsAdapter adapter = new DessertsAdapter(MainActivity.this, R.layout.activity_dois, supplierNames);


        ListView lv = findViewById(R.id.lvLista);

        lv.setAdapter(adapter);

    }
}