package com.example.bil21402advancedrecyle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class showdetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showdetails);
        TextView t1=findViewById(R.id.textView3);
        TextView t2=findViewById(R.id.textView2);
        TextView t3=findViewById(R.id.textView);
        Intent action2=getIntent();
        VolumeInfo v= (VolumeInfo) action2.getSerializableExtra("volinfoobject");
       t1.setText(v.getTitle());
       t2.setText(v.getAuthors());
       t3.setText(v.getLanguage());
    }
}
