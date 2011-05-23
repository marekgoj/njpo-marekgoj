package stringChanger;

import static org.junit.Assert.*;

import org.junit.*;

public class testStringChanger {
	private StringChanger s;
	
	@Before
	public void StartUp() {
		s = new StringChanger();
	}
	
	@Test
	public void testNotNull(){
		assertNotNull(s);
	}
	
	@Test
	public void testFirstLetterUppCase(){
		assertEquals("I", s.firstLetterUppCase("i"));
		assertEquals("K", s.firstLetterUppCase("k"));
		assertEquals("Zdanie", s.firstLetterUppCase("zdanie"));
		assertEquals("MAREK", s.firstLetterUppCase("MAREK"));
		assertEquals("0909", s.firstLetterUppCase("0909"));
		assertEquals("K asdf", s.firstLetterUppCase("k asdf"));
		assertEquals("¥¹¹", s.firstLetterUppCase("¹¹¹"));	
	}
	
	@Test
	public void testLength0FirstLetterUppCase(){
		assertEquals("", s.firstLetterUppCase(""));
	}
	
	@Test
	public void testLeetIt(){
		assertEquals("M4r3|<", s.leetIt("Marek"));
	}
}
