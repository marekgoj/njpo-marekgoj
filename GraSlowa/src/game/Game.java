package game;

import java.util.*;

import player.Player;
import wordChecking.*;
import wordChecking.wordCheckers.*;


import display.ConsoleDisplay;
import display.IDisplay;


public class Game {
	private ArrayList<Player> playerList = new ArrayList<Player>();
	private ArrayList<String> enteredWords = new ArrayList<String>();
	private IDisplay display = new ConsoleDisplay();
	String prev = generateFirstLetter();
	
	//Options
	int rounds = 5;
	
	public void addPlayer(Player player){
		if(!playerList.contains(player))
			playerList.add(player);
	}
	
	private String generateFirstLetter(){
		char[] tchar = {'a', 'b', 'c', 'æ', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', '³', 'm', 'n', 'o',
				'p', 'r', 's', 't', 'u', 'w', 'z', '¿', 'Ÿ'};
		Random rnd = new Random(System.currentTimeMillis());
		return String.valueOf(tchar[rnd.nextInt(tchar.length)]);
	}
	
	public void runGame()
	{
		WordDispatcher wordDispatcher = new WordDispatcher();
		
		//IWordChecker lengthChecker = new LengthChecker();
		wordDispatcher.addWordChecker(new LengthChecker());
		
		//IWordChecker firstLastChecker = new FirstLastChecker();
		wordDispatcher.addWordChecker(new FirstLastChecker());
		
		wordDispatcher.addWordChecker(new DictionaryChecker());
		
		for (int i = 1; i <= rounds; i++){
			for(Player player : playerList){
				
				if(prev.endsWith("y"))
					prev = generateFirstLetter();
				
				display.showPrompt(player, prev);
				
				String next = player.createWord(prev);
				String word = next;
				
				display.showEnteredWord(player, word);
				
				wordDispatcher.dispatchWord(prev, next);
				
				display.showOKMessage(player, wordDispatcher.isWordOK());
				System.out.println();
				
				if (wordDispatcher.isWordOK()){
					player.addPoints(1);
					enteredWords.add(word);
					prev = next;
				}
				
				wordDispatcher.resetWordOK();
			}
		}
		
		display.showScore(playerList);	
	}
	
}
