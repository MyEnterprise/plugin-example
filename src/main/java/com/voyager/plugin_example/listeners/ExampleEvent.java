package com.voyager.plugin_example.listeners;

import com.voyager.enterprise.event.CreateEnterprise;
import com.voyager.enterprise.event.UpdateEnterprise;
import com.voyager.enterprise.server.listener.EventListener;

public class ExampleEvent implements EventListener{

	public void onEnable() {}
	public void onDisable() {}

	@CreateEnterprise
	public void onCreateEnterprise() {
		System.out.println("ExampleEvent.onCreateEnterprise()");
	}

	@UpdateEnterprise
	public void onUpdateEnterprise() {
		System.out.println("ExampleEvent.onCreateEnterprise()");
	}

}

