package com.javikx2.klondike.model;

import java.util.ArrayList;
import java.util.List;

public class TableauPile extends CardList{

    public TableauPile(List<Card> cards, int numberOfFacedUpCards){
        super();   
        assert numberOfFacedUpCards >= 0;
        assert !cards.isEmpty();             
        for (int i = 0; i < numberOfFacedUpCards; i++) {
            Card card = cards.remove(i);
            card.faceUp();
            this.cards.add(card);
        }
        this.cards.addAll(cards);
    }
    
    @Override
    public List<Card> getCards(int numberOfCards) {
        assert numberOfCards > 0;
        List<Card> cardsSublist = new ArrayList<>();
        for (int i = 0; i < numberOfCards; i++) {
            cardsSublist.add(this.cards.remove(i));
        }
        return cardsSublist;
    }

    @Override
    public List<Card> removeCards(int numberOfCards) {
        assert numberOfCards > 0;
        return null;
    }
    
    
}
