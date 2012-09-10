package com.kailesh.witwatersrand.rmbcanteen;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button button = (Button) findViewById(R.id.clickMeButton);
		button.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Toast.makeText(MainActivity.this, "Button Clicked!", Toast.LENGTH_SHORT).show();
			}
		});   
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
}
