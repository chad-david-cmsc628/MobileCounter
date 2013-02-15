package com.example.mobilecounter;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	private Button myButton, myButton2, activityButton;
	private TextView myTextView;
	private int count = 0;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Displays UI from XML
        setContentView(R.layout.activity_main);
        
        Bundle extras = getIntent().getExtras();
        String value_ = (String) extras.get("Name");
        
        activityButton = (Button) findViewById(R.id.startActivity);
        activityButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Uri webpage = Uri.parse("http://www.google.com");
				Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
				startActivity(webIntent);
			}
        	
        });
        
        myButton = (Button)findViewById(R.id.buttonadd);
        //myButton2 = (Button)findViewById(R.id.buttonadd2);
        myTextView = (TextView)findViewById(R.id.counter);
        
        myTextView.setText(value_);
        
        MyOnClickListener listener1 = new MyOnClickListener(count, myTextView);
        myButton.setOnClickListener(listener1);
        //myButton2.setOnClickListener(this);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		myTextView.setText("Counter: " + (++count));
	}
}
