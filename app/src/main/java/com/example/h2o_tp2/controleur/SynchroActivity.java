package com.example.h2o_tp2.controleur;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.h2o_tp2.R;

public class SynchroActivity extends AppCompatActivity {
	private Button btnSyncDesc;
	private Button btnSyncAsc;
	private TextView tvLogSyncAsc;
	private TextView tvLogSyncDesc;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_synchro);
		this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		//getActionBar().setDisplayHomeAsUpEnabled(true);
		
		btnSyncDesc = (Button) findViewById(R.id.btnSyncDesc);
		btnSyncAsc = (Button) findViewById(R.id.btnSyncAsc);
		tvLogSyncAsc = (TextView) findViewById(R.id.tvLogSyncAsc);
		tvLogSyncDesc = (TextView) findViewById(R.id.tvLogSyncDesc);
		
		btnSyncDesc.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Effectuer la synchronisation descendante puis indiquer a l'utilisateur l'etat d'avancement
				
			}
		});
		
		btnSyncAsc.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Effectuer la synchronisation montante puis indiquer a l'utilisateur l'etat d'avancement
				
			}
		});
	}


	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    switch (item.getItemId()) {
	    // Respond to the action bar's Up/Home button
	    case android.R.id.home:
	        finish();
	        break;
	    }
	    return super.onOptionsItemSelected(item);
	}

	
}
