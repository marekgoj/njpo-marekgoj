import player.Computer;
import player.Human;
import wordGenerating.DictionaryGenerator;
import wordGenerating.InputGenerator;
import wordGenerating.RandomGenerator;
import game.Game;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		RandomGenerator wg = new RandomGenerator();
//		System.out.println(wg.generateWord());
//		
//		InputGenerator ig = new InputGenerator();
//		System.out.println(ig.generateWord());
	
	Game game = new Game();
	game.addPlayer(new Human("Marek"));
	game.addPlayer(new Computer("Computer", new DictionaryGenerator()));
	game.runGame();
	
	
	
	}
}
