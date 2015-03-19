package com.FCI.SWE.SocialNetwork;
import com.FCI.SWE.Controllers.Application;
import com.FCI.SWE.Controllers.UserController;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
public class SearchActivity extends Activity implements OnClickListener{
	
	EditText searchEditText;
	Button searchButton;

	@SuppressLint("CutPasteId")
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_search);
		searchEditText = (EditText) findViewById(R.id.search);
		searchButton = (Button) findViewById(R.id.searchButton );
		searchButton.setOnClickListener(this);

	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		UserController controller = Application.getUserController();
		controller.search(searchEditText.getText().toString() );

	}

}
