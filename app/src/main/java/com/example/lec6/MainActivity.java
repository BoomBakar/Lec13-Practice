package com.example.lec6;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn.findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                viewLayoutInflater layoutInflater = getLayoutInflater();
//                View myLayout = layoutInflater.inflate(R.layout.activity_main,null);
//                Toast myToast = new Toast(getApplicationContext());
//                myToast.setDuration(Toast.LENGTH_LONG);
//                myToast.setView(myLayout);
//                myToast.setGravity(Gravity.CENTER,0,0);
//                myToast.show();
                AlertDialog.Builder build = new AlertDialog.Builder(MainActivity.this);
                build.setCancelable(true);
                build.setTitle("Title");
                build.setMessage("Are you Sure??!?!");
                //build.setPositiveButton()
            }
        });
    }
}