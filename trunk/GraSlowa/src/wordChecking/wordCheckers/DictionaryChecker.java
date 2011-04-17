package wordChecking.wordCheckers;

import java.io.*;
import java.util.*;

public class DictionaryChecker implements IWordChecker
{
	protected static ArrayList<String> wordList = new ArrayList<String>();

	public DictionaryChecker(){
		ReadFile r = new ReadFile();
		r.openFile();
		r.readFile();
		r.closeFile();
	}
	
	public static ArrayList<String> getWordList()
	{
		return wordList;
	}

	@Override
	public boolean isCorrect(String prev, String next){
		if(wordList.contains(next.toLowerCase()))
			return true;
		else
			return false;
	}

	class ReadFile{
		private Scanner s;
		File f = new File("slowa-win.txt");
		
		public void openFile(){
			try{
				s = new Scanner(f);
			} catch (Exception e) {
				System.out.println("Could not find file");
			}
		}

		public void readFile(){
			int i = 1;
			int progress = 0;
			long fileSize = f.length();
			int jump = 33;
			long divider = fileSize / jump;
			System.out.println("Rozmiar pliku: " + f.length() + " bajtów");
			System.out.println("| Progres ³adowanie zasobu s³ów |");
			while (s.hasNext()){
				String word = s.next().toLowerCase();
				wordList.add(word);
				progress += word.length() + 2;
				if ((progress) > (i * divider)){
					i++;
					//System.out.println((int)(((double)progress/(double)fileSize)*100));
					System.out.print("|");
				}		
			}
			System.out.println();
			System.out.println();
		}

		public void closeFile(){
			s.close();
		}
	}
}
