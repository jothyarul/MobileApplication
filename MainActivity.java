package com.example.medicalapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.app.Activity;
import android.content.Intent;


public class MainActivity extends Activity {
	ImageView imv;
	Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        imv=(ImageView) findViewById(R.id.imageView1);
        imv.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(v.getContext(), ListViewImage.class);
	            startActivityForResult(intent,0);
	            		
			}
		}
        );    
        
    }


    
    
}
