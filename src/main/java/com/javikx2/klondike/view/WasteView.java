package com.javikx2.klondike.view;

import java.util.List;

import com.javikx2.klondike.controller.MenuController;
import com.javikx2.klondike.model.Card;

public class WasteView {

    private MenuController menuController;

    public WasteView(MenuController menuController) {
        this.menuController = menuController;
    }

    public void show() {
        List<Card> cards = menuController.getAllCardsFromWaste();
        for (int j = cards.size() - 1; j > cards.size() - 1 - 3; j--) {
            new CardView(cards.get(j)).show();
        }
    }

}
