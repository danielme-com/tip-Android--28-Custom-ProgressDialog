package com.danielme.tipsandroid.progressdialog;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;

import com.danieme.tipsandroid.progressdialog.R;


/**
 * 
 * @author danielme.com
 *
 */
public class MainActivity extends Activity
{	
	ProgressDialog progressDialog = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{		
		super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); 
        
		progressDialog = new ProgressDialog(this);
        progressDialog.show();        
        progressDialog.setContentView(R.layout.custom_progressdialog);
        //se ppdrá cerrar simplemente pulsando back
		progressDialog.setCancelable(true);
		
		//no olvidar invocar dismiss 
	}	
	
}