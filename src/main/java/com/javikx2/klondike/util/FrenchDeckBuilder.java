package com.javikx2.klondike.util;

import java.util.ArrayList;
import java.util.List;

import com.javikx2.klondike.model.Card;
import com.javikx2.klondike.model.DeckNumber;
import com.javikx2.klondike.model.Suit;

public class FrenchDeckBuilder {
    private List<Card> cards = new ArrayList<>();
    public List<Card> build(){
        Suit[] suits = Suit.values();
        DeckNumber[] numbers = DeckNumber.values();
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                cards.add(new Card(numbers[j], suits[i]));
            }
        }
        return cards;
    }
}
