package com.example.medicalapplication;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class ListViewImage extends Activity {
	
	SQLiteDatabase db;
	EditText t1;
	EditText t2;
	EditText t3;
	EditText t4;
	EditText t5;
	EditText t6;
	EditText t7;
	 protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.create);
	         t1=(EditText) findViewById(R.id.editText1);
	         t2=(EditText) findViewById(R.id.editText2);
	         t3=(EditText) findViewById(R.id.editText3);
	         t4=(EditText) findViewById(R.id.editText4);
	         t5=(EditText) findViewById(R.id.editText5);
	         t6=(EditText) findViewById(R.id.editText6);
	         t7=(EditText) findViewById(R.id.editText7);
	        Button b2=(Button) findViewById(R.id.button1);
	         db= openOrCreateDatabase("medical", Context.MODE_PRIVATE, null);
	        b2.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					if(t1.getText().toString().trim().length()!=0 &&
							t2.getText().toString().trim().length()!=0 &&
							t3.getText().toString().trim().length()!=0 &&
							t4.getText().toString().trim().length()!=0 &&
							t5.getText().toString().trim().length()!=0 &&
							t6.getText().toString().trim().length()!=0 &&
							t7.getText().toString().trim().length()!=0 )
					{
						
				        db.execSQL("CREATE TABLE IF NOT EXISTS medicalx(name VARCHAR,age VARCHAR,gender VARCHAR,address VARCHAR,phno VARCHAR,doctor VARCHAR, problem VARCHAR);");
				        
						db.execSQL("INSERT INTO medicalx VALUES('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"','"+t6.getText()+"','"+t7.getText()+"');");
			            showMessage("Registered", "Your appointment is recorded");
			            
			            t1.setText("");
			            t2.setText("");
			            t3.setText("");
			            t4.setText("");
			            t5.setText("");
			            t6.setText("");
			            t7.setText("");
			            
			            
					}
					else{
						Toast.makeText(getApplicationContext(), "Please Fill All Fields",Toast.LENGTH_SHORT).show();
					}
					
				}
			});        
	        
	             
	        
            

	    }
	 public void showMessage(String title,String message)
	    {
	        AlertDialog.Builder builder=new AlertDialog.Builder(this);
	        builder.setCancelable(true);
	        builder.setTitle(title);
	        builder.setMessage(message);
	        builder.show();
	    }


	
		
	}

