package com.techelevator.menus;

import com.techelevator.menus.utils.TableGenerator;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

public class FeedMoneyMenu extends Menu{
    private static final int TWENTY_DOLLARS = 20;
    private static final int TEN_DOLLARS = 10;
    private static final int FIVE_DOLLARS = 5;
    private static final int ONE_DOLLAR = 1;
    private static final Integer[] MONEY_ARRAY = {TWENTY_DOLLARS,TEN_DOLLARS,FIVE_DOLLARS,ONE_DOLLAR};
    TableGenerator tableGenerator = new TableGenerator();
    public FeedMoneyMenu(InputStream input, OutputStream output) {
        super(input, output);
    }

    @Override
    public void run() {

        while (true) {
            int choice = (int) (super.getChoiceFromOptions(MONEY_ARRAY));
            List<Integer> optionsList = List.of(MONEY_ARRAY);

            if (optionsList.contains(choice)) {
                // Add choice amount to balance
            } else if (choice == 0) {
                // go back
                break;
            }
        }
    }
    @Override
    public Object getChoiceFromOptions(Object[] options){
        Object choice = null;
        while (choice == null) {
            displayMenuOptions(options);
            choice = getChoiceFromUserInput(options);
        }
        return choice;


    }
    @Override
    protected Object getChoiceFromUserInput(Object[] options) {
        Object choice = null;
        String userInput = super.getIn().nextLine();
        try {
            int selectedOption = Integer.valueOf(userInput);
            if (selectedOption >= 0 && selectedOption <= options.length) {
                if(selectedOption!=0) {
                    choice = options[selectedOption - 1];
                }else{
                    choice=0;
                }
            }
        } catch (NumberFormatException e) {
            // eat the exception, an error message will be displayed below since choice will be null
        }
        if (choice == null) {
            super.getOut().println(System.lineSeparator() + "*** " + userInput + " is not a valid option ***" + System.lineSeparator());
        }
        return choice;
    }
    @Override
    protected void displayMenuOptions(Object[] options) {
        List<Object> optionsList = List.of(options);

        super.getOut().println();
        System.out.println(tableGenerator.generateTableFromList("Amount", optionsList));

        super.getOut().print("Please choose an option or enter 0 to exit this menu >>> ");
        super.getOut().flush();
    }

}
