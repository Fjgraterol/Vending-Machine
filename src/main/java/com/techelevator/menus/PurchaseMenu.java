package com.techelevator.menus;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class PurchaseMenu extends Menu{
    private static final String PURCHASE_MENU_OPTION_FEED_MONEY = "Feed Money";
    private static final String PURCHASE_MENU_OPTION_SELECT_PRODUCT = "Select Product";
    private static final String PURCHASE_MENU_OPTION_FINISH_TRANSACTION = "Finish Transaction";
    private static final String[] PURCHASE_MENU_OPTIONS =
            {PURCHASE_MENU_OPTION_FEED_MONEY,PURCHASE_MENU_OPTION_SELECT_PRODUCT,PURCHASE_MENU_OPTION_FINISH_TRANSACTION};

    public PurchaseMenu(InputStream input, OutputStream output) {
        super(input, output);
    }

    @Override
    public void run() {
        while (true) {
            String choice = (String) super.getChoiceFromOptions(PURCHASE_MENU_OPTIONS);

            if (choice.equals(PURCHASE_MENU_OPTION_FEED_MONEY)) {
                // Feed Money Menu
            } else if (choice.equals(PURCHASE_MENU_OPTION_SELECT_PRODUCT)) {
                // Select Product Menu
            } else if (choice.equals((PURCHASE_MENU_OPTION_FINISH_TRANSACTION))){
                // Finish transaction
                break;
            }
        }

    }
}
