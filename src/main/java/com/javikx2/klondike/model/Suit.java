package com.javikx2.klondike.model;

public enum Suit {
    HEARTS, DIAMONDS, CLUBS, SPADES;

    public boolean sameSuit(Suit suit) {
        return this.ordinal() == suit.ordinal();
    }
}
