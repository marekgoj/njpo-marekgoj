package pl.shop;

import static org.junit.Assert.*;

import org.easymock.EasyMock;
import org.junit.*;

import pl.shop.db.IDBAccess;


public class LoginServiceTest {
	
	private LoginService ls;
	
	@Before
	public void setUp() {
	    ls = new LoginService();
	}
	
	@Test
	public void testLoginService_ValidPass() {
	    //-----------------------
	    IDBAccess mockDB = EasyMock.createMock(IDBAccess.class);
	    
	    EasyMock.expect(mockDB.validateUser("user", "validPass"))
	      .andReturn(true);
	    
	    EasyMock.replay(mockDB);
	    //------------------------
	    
	    ls.setDBAccess(mockDB);

	    assertEquals(true, ls.login("user", "validPass"));
	}
	
	@Test
	public void testLoginService_InvalidPass() {
	    //-----------------------
	    IDBAccess mockDB = EasyMock.createMock(IDBAccess.class);
	    
	    EasyMock.expect(mockDB.validateUser("user", "invalidPass"))
	      .andReturn(false);
	    
	    EasyMock.replay(mockDB);
	    //------------------------
	    
	    ls.setDBAccess(mockDB);

	    assertEquals(false, ls.login("user", "invalidPass"));
	}
}
