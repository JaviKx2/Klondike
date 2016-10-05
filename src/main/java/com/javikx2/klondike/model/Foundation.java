package com.javikx2.klondike.model;

import java.util.ArrayList;
import java.util.List;

public class Foundation extends CardList {
    @Override
    public List<Card> getCards(int numberOfCards) {
        return cards.subList(0, numberOfCards);
    }

    @Override
    public List<Card> removeCards(int numberOfCards) {
        List<Card> cardsSubList = new ArrayList<>();
        for (int i = 0; i < numberOfCards; i++) {
            cardsSubList.add(cards.remove(numberOfCards));
        }
        return cardsSubList;
    }

    public boolean isFull() {
        return cards.size() == Suit.values().length;
    }

}
