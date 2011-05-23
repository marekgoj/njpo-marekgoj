package stringChanger;

public class StringChanger {
	public String firstLetterUppCase(String s){
		if (s.length() == 0)
			return "";
		else 
		return String.valueOf(s.charAt(0)).toUpperCase() + s.substring(1);	
	}

	public String leetIt(String s) {
		String text = s;
		text = text.replace('a', '4');
		text = text.replace('A', '4');
		text = text.replace('e', '3');
		text = text.replace('E', '3');
		text = text.replace("K", "|<");
		text = text.replace("k", "|<");
		return text;
	}
}
