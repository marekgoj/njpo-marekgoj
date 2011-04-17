package wordChecking.wordCheckers;


public class FirstLastChecker implements IWordChecker{

	public boolean isCorrect(String prev, String next) {
		if(prev.charAt(prev.length()-1) == next.charAt(0))
			return true;
		else
			return false;
	}

}
