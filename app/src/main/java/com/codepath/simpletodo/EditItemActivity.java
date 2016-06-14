package com.codepath.simpletodo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        int pos = getIntent().getIntExtra("pos", -1);
        String text = getIntent().getStringExtra("text");
        EditText etEditItem = (EditText) findViewById(R.id.etEditItem);
        etEditItem.setText(text);
        etEditItem.setSelection(text.length());
    }

    public void onSave(View v) {
        EditText etEditItem = (EditText) findViewById(R.id.etEditItem);
        Intent data = new Intent();
        data.putExtra("text", etEditItem.getText().toString());
        data.putExtra("pos", getIntent().getIntExtra("pos", -1));
        setResult(RESULT_OK, data);
        finish();
    }
}
