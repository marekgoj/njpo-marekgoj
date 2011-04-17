package wordGenerating;

import java.util.ArrayList;
import java.util.Random;

import wordChecking.wordCheckers.DictionaryChecker;

public class DictionaryGenerator implements IWordGenerator
{
	private ArrayList<String> wordList;
	
	public DictionaryGenerator(){
		wordList = DictionaryChecker.getWordList();
	}
	
	@Override
	public String generateWord(String prev)
	{
		String found = "";
		Random rnd = new Random(System.currentTimeMillis());
		boolean isNotFound = true;
		while(isNotFound){
			found = wordList.get(rnd.nextInt(wordList.size()));
			if (prev.endsWith(String.valueOf(found.charAt(0))))
				isNotFound = false;
		}
		return found;
	}

}
