package com.example.toastmessage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);

        // Default Toast
        //Toast.makeText(this, "Vishal Pandey", Toast.LENGTH_SHORT).show();

        // Custome Toast

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast = new Toast(getApplicationContext());
                View view1 = getLayoutInflater().inflate(R.layout.custome_toast, findViewById(R.id.custome1));
                toast.setView(view1);
                TextView txt1 = view1.findViewById(R.id.txt1);
                txt1.setText("Vishal Pandeyyyy");
                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }
}