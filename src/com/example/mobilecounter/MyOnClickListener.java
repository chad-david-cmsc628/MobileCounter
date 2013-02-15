package com.example.mobilecounter;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MyOnClickListener implements OnClickListener {

	private int count;
	private TextView myTextView;
	
	public MyOnClickListener (int count_, TextView view_) {
		count = count_;
		myTextView = view_;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		myTextView.setText("Counter: " + (++count));
	}
}
