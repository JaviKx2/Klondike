package com.javikx2.klondike.model;

import java.util.ArrayList;
import java.util.List;

public abstract class CardList {
    protected List<Card> cards;

    public CardList() {
        this.cards = new ArrayList<>();
    }

    public CardList(List<Card> cards) {
        this.addCards(cards);
    }

    public void addCards(List<Card> cards) {
        this.cards.addAll(cards);
    }

    public List<Card> getAllCards() {
        return this.cards;
    }
    
    public List<Card> removeAllCards(){
        List<Card> cardsSublist = new ArrayList<>();
        for(int i = 0; i < cards.size(); i++){
            cardsSublist.add(cards.remove(i));
        }    
        return cardsSublist;
    }

    public abstract List<Card> getCards(int numberOfCards);
    
    public abstract List<Card> removeCards(int numberOfCards);

    public boolean isEmpty() {
        return this.cards.isEmpty();
    }
}
