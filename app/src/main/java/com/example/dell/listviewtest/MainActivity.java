package com.example.dell.listviewtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    /*String[] dist = {"Dhaka", "Chattagram", "Khulna", "Barisal", "Noakhali", "Comilla", "Chadpur", "Feni", "Gazipur", "Rajshahi"};*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.lvId);
       final String[] dist = getResources().getStringArray(R.array.dist);

        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.sample_layout, R.id.tvItemId, dist);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selected = dist [position];

                //Toast.makeText(MainActivity.this, "" + selected, Toast.LENGTH_SHORT).show();


                //go details
                Intent intent = new Intent(MainActivity. this, DetailsActivity.class);
                intent.putExtra("dist", selected);
                startActivity(intent);


            }
        });
    }
}
