package com.example.pihome;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// Custom Button
		
				final Button outlet1 = (Button)findViewById(R.id.outlet1);
				outlet1.setOnClickListener(new View.OnClickListener() {
					private boolean on = true;
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						if(on && v == outlet1) {
							outlet1.setBackgroundResource(R.drawable.outlet_red);
							on = false;
						} else if(v == outlet1) {
							outlet1.setBackgroundResource(R.drawable.outlet_green);
							on = true;
						}
					}
				});
				final Button outlet2 = (Button)findViewById(R.id.outlet2);
				outlet2.setOnClickListener(new View.OnClickListener() {
					private boolean on = true;
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						if(on && v == outlet2) {
							outlet2.setBackgroundResource(R.drawable.outlet_red);
							on = false;
						} else if(v == outlet2) {
							outlet2.setBackgroundResource(R.drawable.outlet_green);
							on = true;
						}
					}
				});
				final Button outlet3 = (Button)findViewById(R.id.outlet3);
				outlet3.setOnClickListener(new View.OnClickListener() {
					private boolean on = true;
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						if(on && v == outlet3) {
							outlet3.setBackgroundResource(R.drawable.outlet_red);
							on = false;
						} else if(v == outlet3) {
							outlet3.setBackgroundResource(R.drawable.outlet_green);
							on = true;
						}
					}
				});
				final Button outlet4 = (Button)findViewById(R.id.outlet4);
				outlet4.setOnClickListener(new View.OnClickListener() {
					private boolean on = true;
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						if(on && v == outlet4) {
							outlet4.setBackgroundResource(R.drawable.outlet_red);
							on = false;
						} else if(v == outlet4) {
							outlet4.setBackgroundResource(R.drawable.outlet_green);
							on = true;
						}
					}
				});
			
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.summary) {
			summaryChange();
			return true;
		}
		if (id == R.id.schedule) {
			scheduleChange();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	
	
	
	/** Called when the user clicks the summary icon */
	public void summaryChange() {
	    Intent intent = new Intent(this, Summary.class);
	    startActivity(intent);
	}
	
	public void scheduleChange() {
	    Intent intent = new Intent(this, Schedule.class);
	    startActivity(intent);
	}
}
