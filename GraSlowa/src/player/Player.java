package player;

import wordGenerating.IWordGenerator;

public abstract class Player {
	protected String name = "unknown";
	protected int id;
	protected int points;
	protected static int nextId = 0;
	protected IWordGenerator wordGenerator;

	public Player(String name){
		this.name = name;
		this.id = nextId;
		nextId++;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	
	public IWordGenerator getWordGenerator() {
		return wordGenerator;
	}

	public void setWordGenerator(IWordGenerator wordGenerator) {
		this.wordGenerator = wordGenerator;
	}
	
	public String createWord(String prev){
		String word = wordGenerator.generateWord(prev);
		return word;
	}
	
	public void addPoints(int points){
		this.points += points;
	}
	
}
