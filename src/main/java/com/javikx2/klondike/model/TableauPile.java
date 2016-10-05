package com.javikx2.klondike.model;

import java.util.ArrayList;
import java.util.List;

public class TableauPile extends CardList{

    public TableauPile(List<Card> cards){
        super();   
        assert !cards.isEmpty();            
        Card card = cards.remove(0);
        card.faceUp();
        this.cards.add(card);
        this.cards.addAll(cards);
    }
    
    @Override
    public List<Card> getCards(int numberOfCards) {
        assert numberOfCards > 0;
        assert numberOfCards <= cards.size();
        
        List<Card> cardsSublist = new ArrayList<>();
        for (int i = 0; i < numberOfCards; i++) {
            cardsSublist.add(this.cards.get(i));
        }
        return cardsSublist;
    }

    @Override
    public List<Card> removeCards(int numberOfCards) {
        assert numberOfCards > 0;
        assert numberOfCards <= cards.size();
        
        List<Card> cardsSublist = new ArrayList<>();
        for (int i = 0; i < numberOfCards; i++) {
            cardsSublist.add(this.cards.remove(i));
        }
        return cardsSublist;
    }
    
    
}
