package com.techelevator;

import com.sun.tools.javac.Main;
import com.techelevator.menus.MainMenu;
import com.techelevator.menus.Menu;

public class VendingMachineCLI {


	private Menu menu;

	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
	}







	public static void main(String[] args) {
		Menu menu = new MainMenu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		menu.run();
	}
}
