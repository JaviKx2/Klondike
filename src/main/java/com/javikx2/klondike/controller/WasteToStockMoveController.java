package com.javikx2.klondike.controller;

import java.util.List;

import com.javikx2.klondike.model.Board;
import com.javikx2.klondike.model.Card;
import com.javikx2.klondike.view.KlondikeView;

public class WasteToStockMoveController extends MoveController {

    public WasteToStockMoveController(Board board) {
        super(board);
    }

    @Override
    public List<Card> getOrigin() {
        return this.getAllCardsFromWaste();
    }

    @Override
    public List<Card> getTarget() {
        return this.getAllCardsFromStock();
    }

    @Override
    public void acceptVisitFrom(KlondikeView klondikeView) {
        klondikeView.handleVisitFrom(this);
    }

    @Override
    public boolean validateMove() {
        return !this.isWasteEmpty();
    }

    @Override
    public void makeMove() {
        this.addCardsOntoStock(this.cardsOrigin);
        this.removeAllCardsFromWaste();       
    }

    

}
