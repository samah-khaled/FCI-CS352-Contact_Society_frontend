package com.FCI.SWE.SocialNetwork;

import java.util.ArrayList;


public abstract class Mssage {
	String content ;
	public  ArrayList<UserObserver> users = new ArrayList<UserObserver> ();
	
	public Mssage(String content, ArrayList<UserObserver> users) {
		super();
		this.content = content;
		this.users = users;
	}

	public void attach(UserObserver new_user){
		users.add(new_user);
	}
	
	public void notify_(){
		for(UserObserver user :users){
			user.updata(user.userName  ,content  , "0");
		}
		
		
	}

	public abstract void updata() ;
}