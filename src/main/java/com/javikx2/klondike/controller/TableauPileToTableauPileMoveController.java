package com.javikx2.klondike.controller;

import java.util.List;

import com.javikx2.klondike.model.Board;
import com.javikx2.klondike.model.Card;
import com.javikx2.klondike.view.KlondikeView;

public class TableauPileToTableauPileMoveController extends MoveController {

    int tableauPileOrigin;

    int numOfCards;

    int tableauPileTarget;

    public TableauPileToTableauPileMoveController(Board board) {
        super(board);
    }

    public int getTableauPileOrigin() {
        return tableauPileOrigin;
    }

    public void setTableauPileOrigin(int tableauPileOrigin) {
        this.tableauPileOrigin = tableauPileOrigin;
    }

    public int getNumOfCards() {
        return numOfCards;
    }

    public void setNumOfCards(int numOfCards) {
        this.numOfCards = numOfCards;
    }

    public int getTableauPileTarget() {
        return tableauPileTarget;
    }

    public void setTableauPileTarget(int tableauPileTarget) {
        this.tableauPileTarget = tableauPileTarget;
    }

    @Override
    public List<Card> getOrigin() {
        return this.getAllCardsFromTableauPile(tableauPileOrigin);
    }

    @Override
    public List<Card> getTarget() {
        return this.getAllCardsFromTableauPile(tableauPileTarget);
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
