package com.javikx2.klondike.controller;

import java.util.List;

import com.javikx2.klondike.model.Board;
import com.javikx2.klondike.model.Card;
import com.javikx2.klondike.view.KlondikeView;

public class WasteToFoundationMoveController extends MoveController {

    public WasteToFoundationMoveController(Board board) {
        super(board);
    }

    @Override
    public void control() {
        super.control();
    }

    @Override
    public List<Card> getOrigin() {
        return this.getAllCardsFromWaste();
    }

    @Override
    public List<Card> getTarget() {
        return this.getAllCardsFromFoundation(this.cardsOrigin.get(this.cardsOrigin.size()-1).getSuit());
    }

    @Override
    public void acceptVisitFrom(KlondikeView klondikeView) {
        klondikeView.handleVisitFrom(this);
    }

    @Override
    public boolean validateMove() {
        return false;
    }

    @Override
    public void makeMove() {

    }

}
