package com.FCI.SWE.SocialNetwork;

import com.FCI.SWE.Controllers.UserController;

public class GroupObserver extends User{

	@Override
	public  void updata(String friends, String message , String type ) {

		new UserController.Connection().execute(
				"http://dotted-marking-88320.appspot.com/chatMessage", friends,
				message,type ,  "chatMessage");
	}
	
	
}
