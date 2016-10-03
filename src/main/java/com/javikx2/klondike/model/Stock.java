package com.javikx2.klondike.model;

import java.util.ArrayList;
import java.util.List;
import com.javikx2.klondike.util.FrenchDeckBuilder;
import com.javikx2.klondike.util.Crupier;

public class Stock extends CardList{

    public Stock(){
        super();
        this.cards.addAll(new Crupier(new FrenchDeckBuilder().build()).shuffle(50));
    }

    @Override
    public List<Card> getCards(int numberOfCards) {
        List<Card> cardsSubList = new ArrayList<>();
        for (int i = 0; i < numberOfCards; i++) {
            cardsSubList.add(this.cards.get(i));
        }
        return cardsSubList;
    }

    @Override
    public List<Card> removeCards(int numberOfCards){
        List<Card> cardsSubList = new ArrayList<>();
        for (int i = 0; i < numberOfCards; i++) {
            cardsSubList.add(this.cards.remove(i));
        }
        return cardsSubList;
    }
    



}
