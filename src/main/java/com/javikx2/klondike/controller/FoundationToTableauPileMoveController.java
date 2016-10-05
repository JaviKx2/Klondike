package com.javikx2.klondike.controller;

import java.util.ArrayList;
import java.util.List;

import com.javikx2.klondike.model.Board;
import com.javikx2.klondike.model.Card;
import com.javikx2.klondike.model.CardLocation;
import com.javikx2.klondike.model.Suit;
import com.javikx2.klondike.view.KlondikeView;

public class FoundationToTableauPileMoveController extends MoveController {
    int tableauPile;

    int foundationPile;

    public FoundationToTableauPileMoveController(Board board) {
        super(board);
    }

    public int getTableauPile() {
        return tableauPile;
    }

    public void setTableauPile(int tableauPile) {
        this.tableauPile = tableauPile;
    }

    public int getFoundationPile() {
        return foundationPile;
    }

    public void setFoundationPile(int foundationPile) {
        this.foundationPile = foundationPile;
    }

    @Override
    public List<Card> getOrigin() {
        return null;
    }

    @Override
    public List<Card> getTarget() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void acceptVisitFrom(KlondikeView klondikeView) {
        klondikeView.handleVisitFrom(this);
    }

    @Override
    public boolean validateMove() {
        if(this.isFoundationEmpty(Suit.values()[foundationPile])){
            return false;
        }
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
        this.removeCardsFromFoundation(Suit.values()[foundationPile], 1);
        List<Card> card = new ArrayList<>();
        card.add(origin);
        this.addCardsOntoTableauPile(tableauPile, card);
    }
}
