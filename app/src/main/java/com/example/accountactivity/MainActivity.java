package com.example.accountactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // inflate to all items
        ImageView leftIcon=findViewById(R.id.left_icon);
        ImageView rightIcon=findViewById(R.id.right_icon);
        TextView title=findViewById(R.id.toolbar_title);

        // by click on arrow
        leftIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "move to home activity", Toast.LENGTH_SHORT).show();

            }
        });
        // by click in shopping cart
        rightIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "move to cart activity", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
