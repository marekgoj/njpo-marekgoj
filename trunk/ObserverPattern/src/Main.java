import java.util.Scanner;

import events.Event;
import events.EventDispatcher;
import events.IEventListener;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EventDispatcher eventDispatcher = new EventDispatcher();
		
		IEventListener textDisplay = new TextDisplay();
	    eventDispatcher.addEventListener(textDisplay);
	    
	    IEventListener characterCounter = new CharacterCounter();
	    eventDispatcher.addEventListener(characterCounter);
	    
	    IEventListener textAnagram = new TextAnagram();
	    eventDispatcher.addEventListener(textAnagram);
		
	    System.out.println("Podaj tekst:");
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			String text = input.nextLine();
			
			if (text.equals("--count-off")){
				eventDispatcher.removeEventListener(characterCounter);
				System.out.println("Character counter disabled");
				continue;
			}
			
			if (text.equals("--count-on")){
				eventDispatcher.addEventListener(characterCounter);
				System.out.println("Character counter enabled");
				continue;
			}
			
			if (text.equals("--exit")){
				System.out.println("Exiting...");
				break;
			}
						
			eventDispatcher.dispatchEvent(new Event(text));
			
			System.out.println("Podaj nastepny tekst:");
		}

	}

}
