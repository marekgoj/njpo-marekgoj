package wordChecking;

import wordChecking.wordCheckers.IWordChecker;

public interface IWordDispatcher {
	public void addWordChecker(IWordChecker wordChecker);
	public void removeWordChecker(IWordChecker wordChecker);
	public void dispatchWord(String prev, String next);
}
