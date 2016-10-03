package com.javikx2.klondike.model;

public class Card {
    Suit suit;

    DeckNumber number;

    boolean facedUp;

    public Card(DeckNumber number, Suit suit) {
        this.facedUp = false;
        this.number = number;
        this.suit = suit;
    }

    public CardLocation compareNumber(Card card) {
        return this.number.compareDeckNumber(card.getNumber());
    }

    public boolean sameSuit(Suit suit) {
        return this.suit.sameSuit(suit);
    }

    public void faceUp() {
        this.facedUp = true;
    }

    public boolean isFacedUp() {
        return this.facedUp;
    }

    public boolean isAce() {
        return this.number.isAce();
    }

    public boolean isKing() {
        return this.number.isKing();
    }

    public void setNumber(DeckNumber number) {
        this.number = number;
    }

    public DeckNumber getNumber() {
        return number;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Suit getSuit() {
        return this.suit;
    }

    @Override
    public String toString() {
        return "Card [suit=" + suit + ", number=" + number + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((number == null) ? 0 : number.hashCode());
        result = prime * result + ((suit == null) ? 0 : suit.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Card other = (Card) obj;
        if (number != other.number)
            return false;
        if (suit != other.suit)
            return false;
        return true;
    }

}
