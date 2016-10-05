package com.javikx2.klondike.controller;

import java.util.List;

import com.javikx2.klondike.model.Board;
import com.javikx2.klondike.model.Card;
import com.javikx2.klondike.model.CardLocation;
import com.javikx2.klondike.model.Suit;
import com.javikx2.klondike.view.KlondikeView;

public class TableauPileToFoundationMoveController extends MoveController {

    int tableauPile;

    int foundationPile;

    public TableauPileToFoundationMoveController(Board board) {
        super(board);
    }

    @Override
    public List<Card> getOrigin() {
        return this.getAllCardsFromTableauPile(tableauPile);
    }

    @Override
    public List<Card> getTarget() {
        return this.getAllCardsFromFoundation(Suit.values()[foundationPile]);
    }

    @Override
    public void acceptVisitFrom(KlondikeView klondikeView) {
        klondikeView.handleVisitFrom(this);
    }

    @Override
    public boolean validateMove() {
        Card origin = this.cardsOrigin.get(cardsOrigin.size() - 1);
        Card target = this.cardsTarget.get(cardsOrigin.size() - 1);
        if (this.isFoundationEmpty(Suit.values()[foundationPile])) {
            if (target.sameSuit(origin.getSuit()) && origin.isAce() && target.compareNumber(origin) == CardLocation.IMMEDIATE_LOWER) {
                return true;
            }
        } else {
            if (target.sameSuit(origin.getSuit()) && target.compareNumber(origin) == CardLocation.IMMEDIATE_LOWER) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void makeMove() {
        

    }

    public void setFoundationPile(int readFoundationPile) {
        this.foundationPile = readFoundationPile;

    }

    public void setTableauPile(int readTableauPile) {
        this.tableauPile = readTableauPile;
    }

}
