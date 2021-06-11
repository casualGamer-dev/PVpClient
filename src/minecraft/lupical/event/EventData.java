package lupical.event;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class EventData {
public final Object source;
public final Method target;
public final byte priority;
public EventData(Object source,Method target,byte priority) {
	this.source= source;
	this.target=target;
	this.priority=priority;
}
}
