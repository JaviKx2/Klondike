package com.javikx2.klondike.view;

import com.javikx2.klondike.util.ConsoleIO;

public class BoardView {

    public void show(){
        ConsoleIO io = new ConsoleIO();
        io.writeln("=================== BOARD ===================");
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
}
