package com.javikx2.klondike.view;

import com.javikx2.klondike.util.ConsoleIO;
import com.javikx2.klondike.util.LimitedIntDialog;

public class MenuView {
    private final static int MIN = 1;

    private final static int MAX = 9;

    public void show() {
        ConsoleIO io = new ConsoleIO();
        io.writeln("=================== MENU ===================");
        io.writeln("1.\tMove from Deck to Waste.");
        io.writeln("2.\tMove from Waste to Deck.");
        io.writeln("3.\tMove from Waste to Foundation.");
        io.writeln("4.\tMove from Waste to Tableau Pile.");
        io.writeln("5.\tMove from Tableau Pile to Foundation.");
        io.writeln("6.\tMove from Tableau Pile to Tableau Pile.");
        io.writeln("7.\tMove from Foundation to Tableau Pile.");
        io.writeln("8.\tMove from Deck to Waste.");
        io.writeln("9.\tQuit game.");    
    }
    
    public void chooseOption(){
        int option = new LimitedIntDialog("Choose an option from above:", MIN, MAX).read();
        chooseOption(option);
    }

    private void chooseOption(int option) {
        switch (option) {
        case 1:
            optionOne();
            break;
        case 2:
            optionTwo();
            break;
        case 3:
            optionThree();
            break;
        case 4:
            optionFour();
            break;
        case 5:
            optionFive();
            break;
        case 6:
            optionSix();
            break;
        case 7:
            optionSeven();
            break;
        case 8:
            optionEight();
            break;
        case 9:
            optionNine();
            break;
        default:
            break;
        }
    }

    private void optionOne() {

    }

    private void optionTwo() {

    }

    private void optionThree() {

    }

    private void optionFour() {

    }

    private void optionFive() {

    }

    private void optionSix() {

    }

    private void optionSeven() {

    }

    private void optionEight() {

    }

    private void optionNine() {

    }
}
