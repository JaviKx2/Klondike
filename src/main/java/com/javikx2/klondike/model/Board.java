package com.javikx2.klondike.model;

import java.util.List;

public class Board {

    private final static int NUMBER_OF_TABLEAU_PILES = 7;
    
    private final static int NUMBER_OF_FOUNDATION_PILES = 4;

    private TableauPile[] tableauPiles;

    private Foundation[] foundationPiles;

    private Waste waste;

    private Stock stock;

    public Board() {
        this.stock = new Stock();
        this.waste = new Waste();
        initializeFoundationPiles();
        initializeTableauPiles();
    }
    
    private void initializeTableauPiles(){
        this.tableauPiles = new TableauPile[NUMBER_OF_TABLEAU_PILES];
        for (int i = 0; i < NUMBER_OF_TABLEAU_PILES; i++) {
            tableauPiles[i] = new TableauPile(stock.removeCards(i+1), i);
        }
    }
    
    private void initializeFoundationPiles(){
        this.foundationPiles = new Foundation[NUMBER_OF_FOUNDATION_PILES];
        for (int i = 0; i < NUMBER_OF_FOUNDATION_PILES; i++) {
            foundationPiles[i] = new Foundation();
        }
    }
    
    public boolean isWasteEmpty(){
        return waste.isEmpty();
    }
    
    public boolean isStockEmpty(){
        return stock.isEmpty();
    }
    
    public boolean isFoundationEmpty(Suit foundationSuit){
        return foundationPiles[foundationSuit.ordinal()].isEmpty();       
    }
    
    public boolean isTableauPileEmpty(){
        //TODO Terminan implementación
        return false;
    }
    
    public List<Card> removeCardsFromWaste(int numberOfCards){
        return waste.removeCards(numberOfCards);
    }
    
    public List<Card> removeCardsFromStock(int numberOfCards){
        return stock.removeCards(numberOfCards);
    }
    
    public List<Card> removeCardsFromFoundation(Suit foundationSuit, int numberOfCards){
        return foundationPiles[foundationSuit.ordinal()].removeCards(numberOfCards);
    }
    
    public List<Card> removeCardsFromTableauPile(int tableauPile, int numberOfCards){
        return tableauPiles[tableauPile].removeCards(numberOfCards);
    }
    
    public List<Card> getCardsFromWaste(int numberOfCards){
        return waste.getCards(numberOfCards);
    }
    
    public List<Card> getCardsFromStock(int numberOfCards){
        return stock.getCards(numberOfCards);
    }
    
    public List<Card> getCardsFromFoundation(Suit foundationSuit, int numberOfCards){
        return foundationPiles[foundationSuit.ordinal()].getCards(numberOfCards);
    }
    
    public List<Card> getCardsFromTableauPile(int tableauPile, int numberOfCards){
        return tableauPiles[tableauPile].getCards(numberOfCards);
    }
    
    public void addCardsOntoFoundation(Suit foundationSuit, List<Card> cards){
        foundationPiles[foundationSuit.ordinal()].addCards(cards);
    }
    
    public void addCardsOntoWaste(List<Card> cards){
        waste.addCards(cards);
    }
    
    public void addCardsOntoStock(List<Card> cards){
        stock.addCards(cards);
    }
    
    public void addCardsOntoTableauPile(int tableauPile, List<Card> cards){
        tableauPiles[tableauPile].addCards(cards);
    }
    
    public boolean isGameOver(){
        int numberOfFullPiles = 0;
        for (int i = 0; i < foundationPiles.length; i++) {
            if(foundationPiles[i].isFull()){
                numberOfFullPiles++;
            }
        }
        return numberOfFullPiles == foundationPiles.length;
    }
    
    
    
}
