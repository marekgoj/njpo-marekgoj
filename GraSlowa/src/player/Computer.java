package player;

import wordGenerating.IWordGenerator;
import wordGenerating.RandomGenerator;

public class Computer extends Player {

	public Computer(String name) {
		super(name);
		this.wordGenerator = new RandomGenerator();
	}
	
	public Computer(String name, IWordGenerator wordGenerator) {
		super(name);
		this.wordGenerator = wordGenerator;
	}
}
