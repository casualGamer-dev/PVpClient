package lupical.event;

import java.util.ArrayList;

import lupical.gui.SplashProgress;

public class Event {

	public Event call() {
		
		final ArrayList<EventData> dataList = EventManager.get(this.getClass())	;
				if(dataList !=null) {
					for(EventData data: dataList) {
						try {
							data.target.invoke(data.source, this);
							SplashProgress.setProgress(1, "starting event manager");
						}
				catch(Exception e){
							e.printStackTrace();
						}
					}
				}
		return this;
	}
}