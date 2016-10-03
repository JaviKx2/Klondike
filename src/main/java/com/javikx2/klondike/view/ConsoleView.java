package com.javikx2.klondike.view;

import com.javikx2.klondike.util.ConsoleIO;

public class ConsoleView {
    ConsoleIO io;

    BoardView boardView;

    MenuView menuView;

    public ConsoleView() {
        boardView = new BoardView();
        menuView = new MenuView();
    }

    public void show() {
        ConsoleIO io = new ConsoleIO();
        io.writeln("=================== KLONDIKE ===================");
        boardView.show();
        menuView.show();
        menuView.chooseOption();
    }
}
