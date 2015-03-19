package com.FCI.SWE.SocialNetwork;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.FCI.SWE.Controllers.Application;
import com.FCI.SWE.Controllers.UserController;
public class sendFriendRequestActivity  extends Activity implements OnClickListener {

	
	EditText friendNameEditText;
	Button sendfriendrequestButton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sendfriendrequest);
		friendNameEditText = (EditText) findViewById(R.id.friendMail);
		sendfriendrequestButton = (Button) findViewById(R.id.send_friend_request);
		sendfriendrequestButton.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		UserController controller = Application.getUserController();
		controller.sendfriendrequest (friendNameEditText.getText().toString());

	}

}


