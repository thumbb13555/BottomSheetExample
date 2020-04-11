package com.jetec.bottomsheetexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        View view = LayoutInflater.from(this).inflate(R.layout.bottom_sheet,null);
        Button btCancel = view.findViewById(R.id.button_cancel);
        Button bt01 = view.findViewById(R.id.button_01);
        Button bt02 = view.findViewById(R.id.button_02);
        bottomSheetDialog.setContentView(view);
        ViewGroup parent = (ViewGroup) view.getParent();
        parent.setBackgroundResource(android.R.color.transparent);

        bt01.setOnClickListener((v)->{
            Toast.makeText(this, "01", Toast.LENGTH_SHORT).show();
            bottomSheetDialog.dismiss();
        });
        bt02.setOnClickListener((v)->{
            Toast.makeText(this, "02", Toast.LENGTH_SHORT).show();
        });
        btCancel.setOnClickListener((v)->{
            bottomSheetDialog.dismiss();
        });

        findViewById(R.id.button).setOnClickListener((v)->{
            bottomSheetDialog.show();
        });

    }
}
