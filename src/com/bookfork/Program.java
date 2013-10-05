package com.bookfork;

import com.bookfork.Entities.*;
import com.bookfork.Providers.*;

public class Program {

	public static void main(String[] args) {
		IEventProvider provider = new LeonBetFootballLiveEventProvider();
		
		System.out.println(provider.GetEvents().get(0).getName());
		

	}

}
