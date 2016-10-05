package com.javikx2.klondike.controller;

import java.util.List;

import com.javikx2.klondike.model.Board;
import com.javikx2.klondike.model.Card;
import com.javikx2.klondike.view.KlondikeView;

public class StockToWasteMovementController extends MoveController {

    public StockToWasteMovementController(Board board) {
        super(board);
    }

    @Override
    public List<Card> getOrigin() {
        return this.getCardsFromStock(3);
    }

    @Override
    public List<Card> getTarget() {
        return this.getAllCardsFromWaste();
    }

    @Override
    public boolean validateMove() {
        return !this.isStockEmpty();
    }

    @Override
    public void makeMove() {
        for (int i = 0; i < cardsOrigin.size(); i++) {
            if (this.cardsOrigin.get(i) != null) {
                Card card = this.cardsOrigin.remove(i);
                card.faceUp();
                this.cardsTarget.add(card);
            }
        }
        this.removeCardsFromStock(3);
        this.addCardsOntoWaste(this.cardsTarget);
    }

    @Override
    public void acceptVisitFrom(KlondikeView klondikeView) {
        klondikeView.handleVisitFrom(this);
    }
}
