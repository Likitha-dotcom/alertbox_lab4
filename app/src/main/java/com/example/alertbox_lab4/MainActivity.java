package com.example.alertbox_lab4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View v){
        AlertDialog.Builder alertdialoguebuilder = new AlertDialog.Builder(this);
        alertdialoguebuilder.setTitle("Are you sure ?");
        alertdialoguebuilder.setMessage("Are you sure you want to exit?");
        alertdialoguebuilder.setCancelable(false);

        alertdialoguebuilder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"You clocked yes",Toast.LENGTH_LONG).show();
            }
        });
        alertdialoguebuilder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"you clicked no",Toast.LENGTH_LONG).show();
            }
        });
        alertdialoguebuilder.setNeutralButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"you clicked cancel",Toast.LENGTH_LONG).show();
            }
        });
        alertdialoguebuilder.create();
        alertdialoguebuilder.show();
    }
}