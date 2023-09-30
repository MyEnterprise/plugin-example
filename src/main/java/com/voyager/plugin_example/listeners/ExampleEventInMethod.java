package com.voyager.plugin_example.listeners;

import com.voyager.enterprise.event.UpdateEnterprise;
import com.voyager.enterprise.server.listener.EventListener;

public class ExampleEventInMethod implements EventListener{
	
	@UpdateEnterprise
	public void teste01() {
		System.out.println("@ExampleEventInMethod.teste01");
	}

	public void onEnable() {
		// TODO Auto-generated method stub
		
	}

	public void onDisable() {
		// TODO Auto-generated method stub
		
	}
}
