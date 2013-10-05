package com.bookfork.Providers;

import java.util.*;

import com.bookfork.Entities.Coefficient;
import com.bookfork.Entities.Event;

public class LeonBetFootballLiveEventProvider implements IEventProvider {

	@Override
	public List<Event> GetEvents() {
		List<Event> result = new ArrayList<Event>();
		Event ev = new Event("Real -- Inter");
		ev.addCoefficient(new Coefficient("P1", 1.25));
		ev.addCoefficient(new Coefficient("P2", 6));
		result.add(ev);
		return result;
	}

}
