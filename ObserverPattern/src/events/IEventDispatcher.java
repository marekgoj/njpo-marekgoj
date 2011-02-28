package events;


public interface IEventDispatcher {
	public void addEventListener(IEventListener eventListener);
	public void removeEventListener(IEventListener eventListener);
	public void dispatchEvent(Event event);

}
