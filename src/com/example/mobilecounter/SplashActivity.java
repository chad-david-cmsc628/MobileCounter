package com.example.mobilecounter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
	
		Thread myThread = new Thread() {
			public void run () 
			{
				try {
					Thread.sleep(5000);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					Intent myIntent = new Intent(SplashActivity.this, MainActivity.class);
					//Intent myIntent = new Intent("com.example.mobilecountry.MAINACTIVITY");
					myIntent.putExtra("Name", "Chad");
					startActivity(myIntent);
				}
			}
		};
		
		myThread.start();
	}
	
	protected void onPause() {
		super.onPause();
		finish();
	}
	
}
