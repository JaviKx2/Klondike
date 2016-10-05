package com.javikx2.klondike.controller;

import com.javikx2.klondike.model.Board;
import com.javikx2.klondike.model.Card;
import com.javikx2.klondike.model.CardLocation;
import com.javikx2.klondike.view.KlondikeView;

import java.util.ArrayList;
import java.util.List;

public class WasteToTableauPileMoveController extends MoveController {
    int tableauPile;

    public WasteToTableauPileMoveController(Board board) {
        super(board);
    }

    public int getTableauPile() {
        return tableauPile;
    }

    public void setTableauPile(int tableauPile) {
        this.tableauPile = tableauPile;
    }

    @Override
    public List<Card> getOrigin() {
        return this.getAllCardsFromWaste();
    }

    @Override
    public List<Card> getTarget() {
        return this.getAllCardsFromTableauPile(tableauPile);
    }

    @Override
    public void acceptVisitFrom(KlondikeView klondikeView) {
        klondikeView.handleVisitFrom(this);
    }

    @Override
    public boolean validateMove() {
        Card origin = this.cardsOrigin.get(cardsOrigin.size() - 1);
        Card target = this.cardsTarget.get(cardsOrigin.size() - 1);
        if (this.isTableauPileEmpty(tableauPile)) {
            if (!target.sameSuit(origin.getSuit()) && origin.isKing() && target.compareNumber(origin) == CardLocation.IMMEDIATE_HIGHER) {
                return true;
            }
        } else {
            if (!target.sameSuit(origin.getSuit()) && target.compareNumber(origin) == CardLocation.IMMEDIATE_HIGHER) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void makeMove() {
        Card origin = this.cardsOrigin.get(cardsOrigin.size() - 1);
        this.removeCardsFromWaste(1);
        List<Card> card = new ArrayList<>();
        card.add(origin);
        this.addCardsOntoTableauPile(tableauPile, card);
    }

}
