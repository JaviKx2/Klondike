package com.javikx2.klondike.view;

import java.util.List;

import com.javikx2.klondike.controller.MenuController;
import com.javikx2.klondike.model.Card;
import com.javikx2.klondike.model.Suit;

public class FoundationView {

    private MenuController menuController;

    private Suit foundationSuit;

    public FoundationView(MenuController menuController, Suit foundationSuit) {
        this.menuController = menuController;
        this.foundationSuit = foundationSuit;
    }

    public void show() {
        List<Card> cards = menuController.getAllCardsFromFoundation(foundationSuit);
        new CardView(cards.get(cards.size() - 1));
    }

}
