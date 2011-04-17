package wordChecking;

import java.util.ArrayList;

import wordChecking.wordCheckers.IWordChecker;


public class WordDispatcher implements IWordDispatcher {
	
	private ArrayList<IWordChecker> list = new ArrayList<IWordChecker>();
	private boolean isWordOK = true; 
	
	public boolean isWordOK()
	{
		return isWordOK;
	}
	
	public void resetWordOK(){
		this.isWordOK = true;
	}
	
	@Override
	public void addWordChecker(IWordChecker wordChecker) {
		if(!list.contains(wordChecker)){
			list.add(wordChecker);
	}

	}

	@Override
	public void removeWordChecker(IWordChecker wordChecker) {
		if(!list.contains(wordChecker))
			list.remove(wordChecker);
	}

	@Override
	public void dispatchWord(String prev, String next) {
		for(IWordChecker wordChecker : list){
			isWordOK = isWordOK && wordChecker.isCorrect(prev, next);
		}
	}
}
