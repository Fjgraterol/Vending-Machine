package com.techelevator.menus;

import java.io.InputStream;
import java.io.OutputStream;

public class MainMenu extends Menu{
    private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
    private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
    private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE };
    Menu purchaseMenu;

    public MainMenu(InputStream input, OutputStream output) {
        super(input, output);
        this.purchaseMenu = new PurchaseMenu(input,output);
    }

    @Override
    public void run() {

		while (true) {
			String choice = (String) super.getChoiceFromOptions(MAIN_MENU_OPTIONS);

			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				// display vending machine items
			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				// do purchase
                purchaseMenu.run();
			}
		}

    }
}
