package com.javikx2.klondike.view;

import com.javikx2.klondike.model.Card;
import com.javikx2.klondike.util.ConsoleIO;

public class CardView {
    private static final String NOT_FACED_UP = "X";
    private static final char[] CARDS = {'A', '2', '3', '4', '5', '6', '7', '8', '9', 'J', 'Q', 'K'}; 
    private static final char[] SUITS = {'♥', '♦', '♣', '♠'};

    private Card card;

    public CardView(Card card) {
        this.card = card;
    }

    public void show() {
        ConsoleIO io = new ConsoleIO();
        io.write("[");
        if(!card.isFacedUp()){
            io.write(NOT_FACED_UP);
        }else{
            io.write(toCardString());
        }
        io.write("]");
    }
    
    private String toCardString() {
        int number = card.getNumber().ordinal();
        int suit = card.getSuit().ordinal();
        return String.valueOf(CARDS[number]) + String.valueOf(SUITS[suit]);
    }
}
