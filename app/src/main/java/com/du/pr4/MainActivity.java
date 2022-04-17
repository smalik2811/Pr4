package com.du.pr4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        imageView = findViewById(R.id.imageView);

        Resources res = getResources();
        String animals[] = res.getStringArray(R.array.animals);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line,animals);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        imageView.setImageResource(R.drawable.cat);
                        break;
                    case 1:
                        imageView.setImageResource(R.drawable.dog);
                        break;
                    case 2:
                        imageView.setImageResource(R.drawable.cattle);
                        break;
                    case 3:
                        imageView.setImageResource(R.drawable.tiger);
                        break;
                    case 4:
                        imageView.setImageResource(R.drawable.horse);
                        break;
                    case 5:
                        imageView.setImageResource(R.drawable.goat);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                imageView.setImageResource(R.drawable.cat);
            }
        });
    }
}