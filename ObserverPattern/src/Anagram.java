import java.util.Random;

import events.Event;
import events.IEventListener;


public class Anagram implements IEventListener {

	@Override
	public void executeEvent(Event event) {
		String text = event.getText();
		Random rnd = new Random(System.currentTimeMillis());
		
		//rnd.nextDouble
	}
}

