package events;

import java.util.ArrayList;

public class EventDispatcher implements IEventDispatcher {

	private ArrayList<IEventListener> list = new ArrayList<IEventListener>();
	
	@Override
	public void addEventListener(IEventListener eventListener) {
		
		if(!list.contains(eventListener)){
				list.add(eventListener);
		}
	}
	
	@Override
	public void removeEventListener(IEventListener eventListener){
		list.remove(eventListener);
	}
	
	@Override
	public void dispatchEvent(Event event){
		for(IEventListener eventListener : list){
			eventListener.executeEvent(event);
		}
	}
	

}
