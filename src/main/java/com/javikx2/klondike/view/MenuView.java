package com.javikx2.klondike.view;

import com.javikx2.klondike.controller.MenuController;
import com.javikx2.klondike.util.ConsoleIO;

public class MenuView {
    BoardView boardView;

    OptionsView optionsView;
    
    MenuController menuController;

    public MenuView(MenuController menuController) {
        boardView = new BoardView(menuController);
        optionsView = new OptionsView(menuController);
        this.menuController = menuController;
    }

    public void show() {
        ConsoleIO io = new ConsoleIO();
        io.writeln("=================== KLONDIKE ===================");
        boardView.show();
        optionsView.show();
        optionsView.chooseOption();
        menuController.control();
    }
}
