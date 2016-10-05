package com.javikx2.klondike.view;

import com.javikx2.klondike.controller.MenuController;
import com.javikx2.klondike.model.Suit;
import com.javikx2.klondike.util.ConsoleIO;

public class BoardView {

    private MenuController menuController;

    private TableauPileView tableauPileView;

    private FoundationView foundationPileView;

    private WasteView wasteView;
    
    private ConsoleIO io;

    public BoardView(MenuController menuController) {
        this.menuController = menuController;
        wasteView = new WasteView(menuController);
        io = new ConsoleIO();
    }

    public void show() {
        showStock();
        showWaste();
        showFoundationPiles();
        showTableauPiles();      
    }
    
    private void showStock(){
        io.write("Stock: ");
        if(menuController.isStockEmpty()){
            showEmpty();
        }else{
            io.writeln("[X]");
        }
    }
    
    private void showWaste(){
        io.write("Waste: ");      
        if(menuController.isWasteEmpty()){
            showEmpty();
        }else{
            wasteView.show();
            io.writeln();
        }
    }

    private void showTableauPiles() {
        for (int i = 0; i < 7; i++) {
            io.write("Tableau Pile " + String.valueOf(i + 1) + ": ");
            if (menuController.isTableauPileEmpty(i)) {
                showEmpty();
            } else {
                tableauPileView = new TableauPileView(menuController, i);
                tableauPileView.show();
                io.writeln();
            }           
        }
    }

    private void showFoundationPiles() {
        for (int i = 0; i < 4; i++) {
            io.write("Foundation " + Suit.values()[i] + ": ");
            if (menuController.isFoundationEmpty(Suit.values()[i])) {
                showEmpty();
            } else {
                foundationPileView = new FoundationView(menuController, Suit.values()[i]);
                foundationPileView.show();
                io.writeln();
            }  
        }
    }

    private void showEmpty() {
       io.writeln("<empty>");
    }
}
