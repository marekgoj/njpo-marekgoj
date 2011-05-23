package pl.shop;

import pl.shop.db.IDBAccess;

public class LoginService {
	
	private IDBAccess db = null;
	
	public void setDBAccess(IDBAccess db) {
	    this.db = db;
	  }
	
	public boolean login(String user, String password){
		return db.validateUser(user, password);
	}
}
