package com.example.h2o_tp2.controleur;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.h2o_tp2.R;
import com.example.h2o_tp2.modele.Critere;
import com.example.h2o_tp2.modele.CritereDAO;

public class SaisieReleveActivity extends AppCompatActivity {
	private Spinner spinCriteres;
	private Button btnEnregistrerReleve;
	private ArrayList<Critere> listeCriteres;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_saisie_releve);
		this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		//getActionBar().setDisplayHomeAsUpEnabled(true);
		
		spinCriteres = (Spinner) findViewById(R.id.spinCritere);
		btnEnregistrerReleve = (Button) findViewById(R.id.btnEnregistrerReleve);
		
		CritereDAO criteresAcces = new CritereDAO(this);
		listeCriteres = criteresAcces.getCriteres();
		ArrayAdapter<String> spinCriteresAdapter = new ArrayAdapter<String>(this.getBaseContext(),android.R.layout.simple_spinner_item);
						
		for(int i=0;i<listeCriteres.size();i++){
			spinCriteresAdapter.add(listeCriteres.get(i).getLibelleC());
		}
		spinCriteres.setAdapter(spinCriteresAdapter);
		Log.d("log","test");
		
		spinCriteres.setOnItemSelectedListener(new OnItemSelectedListener(){
			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				Log.d("log",Integer.toString(arg2)+" "+listeCriteres.get(arg2).toString());
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		btnEnregistrerReleve.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Log.d("log",Integer.toString(spinCriteres.getSelectedItemPosition()));
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
