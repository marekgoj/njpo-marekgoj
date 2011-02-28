import events.Event;
import events.IEventListener;

public class TextDisplay implements IEventListener {

  @Override
  public void executeEvent(Event event) {
    System.out.println("[TextDisplay] " +
        event.getText());
  }
}

