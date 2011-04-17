package display;

import java.util.ArrayList;

import player.Player;

public interface IDisplay
{
	public void showScore(ArrayList<Player> playerList);
	public void showPrompt(Player player, String prev);
	public void showEnteredWord(Player player, String word);
	public void showOKMessage(Player player, boolean isOK);
}
