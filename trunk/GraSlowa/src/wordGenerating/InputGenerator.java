package wordGenerating;

import java.util.Scanner;

public class InputGenerator implements IWordGenerator{

	@Override
	public String generateWord(String prev) {
		
		Scanner input = new Scanner(System.in);
		String word = input.nextLine();
		
		return word;
	}

}
