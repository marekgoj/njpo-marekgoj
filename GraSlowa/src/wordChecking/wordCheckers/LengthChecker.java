package wordChecking.wordCheckers;


public class LengthChecker implements IWordChecker{

	public boolean isCorrect(String prev, String next) {
		if (next.length() >= 5)
			return true;
		else
			return false;
	}

}
