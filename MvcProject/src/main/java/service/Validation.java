package service;
//Model Layer
public class Validation {
public boolean validation(String username, String password) {
	if(username.equals("admin") && password.equals("123")) {
		return true;
	}else {
		return false;
	}
}
}
