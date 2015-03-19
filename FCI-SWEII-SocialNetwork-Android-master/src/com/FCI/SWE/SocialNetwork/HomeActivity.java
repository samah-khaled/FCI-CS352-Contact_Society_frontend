package com.FCI.SWE.SocialNetwork;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends Activity implements OnClickListener {

	TextView helloTextView;
	Button signoutButton;	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		signoutButton = (Button) findViewById(R.id.signOutButton);
		signoutButton.setOnClickListener(this);	
		Bundle extras = getIntent().getExtras();
		String status = extras.getString("status");
		String name = "",welcome="Hello";
		
		if(extras.containsKey("name")){
			name = extras.getString("name");
			welcome = "Welcome " + name;
		}
		helloTextView = (TextView) findViewById(R.id.helloText);
		String text = status + " ... " + welcome;
		helloTextView.setText(text);
		
     }
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent signoutIntent = new Intent(getApplicationContext(),MainActivity.class);
		startActivity(signoutIntent);
		
	}

}
