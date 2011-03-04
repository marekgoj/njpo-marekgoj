import java.util.Random;

import events.Event;
import events.IEventListener;


public class TextAnagram implements IEventListener {

	@Override
	public void executeEvent(Event event) {
		String text = event.getText();
		Random rnd = new Random(System.currentTimeMillis());
		
		char tText[] = new char[text.length()]; 
		text.getChars(0, text.length(), tText, 0);
		
		int textLength = text.length();
		
		int counter = 0; 	//licznik petli
		int iRandom;		//zmienna pamietajaca wylosowana liczbe
		int counterRandom = 0;	//licznik wykonan losowania 
		
		System.out.print("[TextAnagram] ");
		
		while(counter < textLength){
			do{
				iRandom = rnd.nextInt(textLength);
				counterRandom++;
			}while(tText[iRandom] == (char) -1);
			
			System.out.print(tText[iRandom]);
			tText[iRandom] = (char) -1;
			counter++;
		}
		
		System.out.println(" | draw times: " + counterRandom);
	}
}