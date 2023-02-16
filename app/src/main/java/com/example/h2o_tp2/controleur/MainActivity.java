package com.example.h2o_tp2.controleur;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.h2o_tp2.R;


public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
				
		Button btnSaisieReleve = (Button) findViewById(R.id.btnSaisieReleve);
		btnSaisieReleve.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(v.getContext(), SaisieReleveActivity.class);
				startActivity(intent);
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
		Intent intent;
		switch (item.getItemId()){
		case R.id.afficherCriteres :
			intent = new Intent(this, CritereActivity.class);
			startActivity(intent);
			break;
		case R.id.synchronisationBase :
			intent = new Intent(this, SynchroActivity.class);
			startActivity(intent);
			break;
		}
		return true;
	}
	
}
