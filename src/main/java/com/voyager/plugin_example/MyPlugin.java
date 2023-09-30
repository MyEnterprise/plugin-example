package com.voyager.plugin_example;

import javax.swing.JOptionPane;

import com.voyager.enterprise.manager.comercial.ManagerCommercial;
import com.voyager.enterprise.manager.economy.ManagerEconomy;
import com.voyager.enterprise.plugin.entity.Emitter;
import com.voyager.enterprise.plugin.entity.PluginManager;
import com.voyager.enterprise.plugin.entity.Plugin;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.*;

public class MyPlugin implements Plugin{
	
	String name = "NameExample";
	String desc = "DescExample";
	
	public MyPlugin() {}
	public MyPlugin( ManagerCommercial mc ) {}
	public MyPlugin( ManagerCommercial mc, ManagerEconomy me ) {}
	
	public static void main(String... args) {

		Plugin plugin = new MyPlugin();

		plugin.initialize(null);
	}
	
	public void emit(Emitter arg0) {
		// TODO Auto-generated method stub
		System.out.println("Call My func emit");
	}

	public void getName() {
		// TODO Auto-generated method stub
		System.out.println("Call My func getName");
	}

	public void getPluginDescription() {
		// TODO Auto-generated method stub
		System.out.println("Call My func getPluginDescription");
	}

	public void initialize(PluginManager arg0) {
		// TODO Auto-generated method stub
		System.out.println("Call My func initialize");
		JOptionPane.showConfirmDialog(null, "Estou executando?");
		
        System.out.println(colorize("This text will be yellow on magenta", YELLOW_TEXT(), MAGENTA_BACK()));
        System.out.println("\n");

		
	}

	public boolean isInitialized() {
		// TODO Auto-generated method stub
		System.out.println("Call My func isInitialized");
		return false;
	}

	public void onCommand() {
		// TODO Auto-generated method stub
		System.out.println("Call My func onCommand");
	}

	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("Call My func pause");
	}

	public void reloadConfig() {
		// TODO Auto-generated method stub
		System.out.println("Call My func reloadConfig");
	}

	public void resume() {
		// TODO Auto-generated method stub
		System.out.println("Call My func resume");
	}

}
