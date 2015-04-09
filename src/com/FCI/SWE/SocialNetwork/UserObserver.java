package com.FCI.SWE.SocialNetwork;

import com.FCI.SWE.Controllers.UserController;

public class UserObserver extends User {
 public  String userName ;
 @Override
	public  void updata(String friend, String message , String type ) {

		new UserController.Connection().execute(
				"http://dotted-marking-88320.appspot.com/sendSingleMsg", friend,
				message, type , "sendSingleMsg");
	}
	
	
}
