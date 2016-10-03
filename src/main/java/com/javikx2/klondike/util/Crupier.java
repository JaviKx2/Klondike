package com.javikx2.klondike.util;

import java.util.List;
import java.util.Random;
import com.javikx2.klondike.model.Card;

public class Crupier {
    private List<Card> cards;

    public Crupier(List<Card> cards) {
        assert cards.size() > 0;
        this.cards = cards;
    }

    public List<Card> shuffle(int times) {
        assert times > 0;
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < times; i++) {
            this.cards.add(this.cards.remove(random.nextInt(this.cards.size())));
        }
        return this.cards;
    }
}
