package player;

import wordGenerating.InputGenerator;

public class Human extends Player{
	
	public Human(String name) {
		super(name);
		this.wordGenerator = new InputGenerator();
	}	
}
