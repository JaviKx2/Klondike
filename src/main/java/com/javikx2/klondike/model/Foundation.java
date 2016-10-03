package com.javikx2.klondike.model;

import java.util.List;

public class Foundation extends CardList{
    Suit suit;

    @Override
    public List<Card> getCards(int numberOfCards) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Card> removeCards(int numberOfCards) {
        // TODO Auto-generated method stub
        return null;
    }
    
    public boolean isFull(){
        return cards.size() == Suit.values().length;
    }

}
