package wordGenerating;

import java.util.Random;

public class RandomGenerator implements IWordGenerator{
	char[] tchar = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', '³', 'm', 'n', 'o',
			'p', 'r', 's', 't', 'u', 'w', 'y', 'z'};
	
	@Override
	public String generateWord(String prev) {
		String word = new String();
		Random rnd = new Random(System.currentTimeMillis());
		
		int wordLength = rnd.nextInt(5) + 5;
		
		//testing
		//System.out.println(wordLength);
		
		for (int i = 0; i < wordLength; i++){
			word += tchar[rnd.nextInt(tchar.length)];	
		}
		return word;
	}
}
