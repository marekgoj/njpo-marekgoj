import events.Event;
import events.IEventListener;


public class CharacterCounter implements IEventListener {

	int totalCount = 0;
	@Override
	public void executeEvent(Event event) {
		int charCount = event.getText().length();
		totalCount += charCount;
		System.out.println("[CharacterCounter] character length: " + charCount
				+ " | total character length " + totalCount);
	}

}
