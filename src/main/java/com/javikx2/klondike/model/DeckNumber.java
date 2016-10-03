package com.javikx2.klondike.model;

public enum DeckNumber {
    ACE, 
    TWO, 
    THREE, 
    FOUR, 
    FIVE, 
    SIX, 
    SEVEN, 
    EIGHT, 
    NINE, 
    JACK, 
    QUEEN, 
    KING;

    public CardLocation compareDeckNumber(DeckNumber deckNumber) {
        if (this.ordinal() + 1 == deckNumber.ordinal()) {
            return CardLocation.IMMEDIATE_HIGHER;
        }
        if (this.ordinal() - 1 == deckNumber.ordinal()) {
            return CardLocation.IMMEDIATE_LOWER;
        }
        return CardLocation.NONE;
    }
    
    public boolean isAce(){
        return this.ordinal() == ACE.ordinal();
    }
    
    public boolean isKing(){
        return this.ordinal() == KING.ordinal();
    }
}
