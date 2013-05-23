package controllers;

import models.*;

public class Security extends Secure.Security {

  static boolean authentify(String username, String password) {
  
		if(username.equals("aa") && password.equals("aa")){
			return true;
		}
		else{
			Admin.index();
			return false;
		}
    }
	
	static void onDisconnected() {
		Application.index();
	}
	
	static void onAuthenticated() {
		Admin.index();
	}
}

