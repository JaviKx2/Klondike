package com.javikx2.klondike.view;

import java.util.List;

import com.javikx2.klondike.controller.MenuController;
import com.javikx2.klondike.model.Card;

public class TableauPileView {

    private MenuController menuController;

    private int tableauPile;

    public TableauPileView(MenuController menuController, int tableauPile) {
        this.menuController = menuController;
        this.tableauPile = tableauPile;
    }

    public void show() {
        CardView cardView;
        List<Card> cards = menuController.getAllCardsFromTableauPile(tableauPile);
        int size = cards.size();
        for (int i = size - 1; i >= 0; i--) {
            cardView = new CardView(cards.get(i));
            cardView.show();
        }
    }

}
