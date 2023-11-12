package com.example.andriodjava;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.widget.Button;

import androidx.annotation.Nullable;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_list);
        Button btn = findViewById(R.id.add_product_button);
        btn.setOnClickListener(view -> onButtonClick());
    }

    public void onButtonClick() {
        TextInputEditText editText = (TextInputEditText) findViewById(R.id.product_id);
        String productId = "N/A";
        Editable val = editText.getText();
        if (val != null && val.length() > 0) {
            productId = val.toString();
        }
        String logMsg = String.format("Print the first input field value %s", productId);
        Log.e("btnCLick", logMsg);
    }
}
