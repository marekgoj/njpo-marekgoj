package display;

import java.util.ArrayList;

import player.Player;


public class ConsoleDisplay implements IDisplay
{

	@Override
	public void showScore(ArrayList<Player> playerList)
	{
		System.out.println("Wyniki:");
		for (Player player : playerList){
			System.out.println(player.getName() + " " + player.getPoints());
		}
	}

	@Override
	public void showPrompt(Player player, String prev)
	{
		System.out.println(player.getName() + " podaj s³owo na literê " + String.valueOf(prev.charAt(prev.length() - 1)).toUpperCase());
	}

	@Override
	public void showEnteredWord(Player player, String word)
	{
		System.out.println(player.getName() + " wpisa³eœ " + word);
		
	}

	@Override
	public void showOKMessage(Player player, boolean isOK)
	{
		if (isOK)
			System.out.println(player.getName() + " poda³eœ dobre s³owo");
		else
			System.out.println(player.getName() + " poda³eœ z³e s³owo");
	}
	
	

}
