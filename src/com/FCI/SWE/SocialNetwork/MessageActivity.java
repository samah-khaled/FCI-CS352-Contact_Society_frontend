package com.FCI.SWE.SocialNetwork;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.FCI.SWE.Controllers.Application;
import com.FCI.SWE.Controllers.UserController;

public class MessageActivity extends Activity implements OnClickListener {

	EditText messageEditText;
	EditText friendEditText;
	Button sendButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_search);
		messageEditText = (EditText) findViewById(R.id.message);
		friendEditText = (EditText) findViewById(R.id.friend);
		sendButton = (Button) findViewById(R.id.sendButton);
		sendButton.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		UserController controller = Application.getUserController();
		controller.sendSingleMsg(messageEditText.getText().toString(), friendEditText
						.getText().toString());

	}

}
