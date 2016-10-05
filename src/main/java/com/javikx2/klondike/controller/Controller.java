package com.javikx2.klondike.controller;

import java.util.List;

import com.javikx2.klondike.model.Board;
import com.javikx2.klondike.model.BoardState;
import com.javikx2.klondike.model.Card;
import com.javikx2.klondike.model.Suit;
import com.javikx2.klondike.view.KlondikeView;

public abstract class Controller {

    protected Board board;

    protected Controller(Board board) {
        this.board = board;
    }

    public abstract void control();

    public abstract void acceptVisitFrom(KlondikeView klondikeView);

    public boolean isFoundationEmpty(Suit foundationSuit) {
        return this.board.isFoundationEmpty(foundationSuit);
    }

    public boolean isStockEmpty() {
        return this.board.isStockEmpty();
    }

    public boolean isTableauPileEmpty(int tableauPile) {
        return this.board.isTableauPileEmpty(tableauPile);
    }

    public boolean isWasteEmpty() {
        return this.board.isWasteEmpty();
    }
    
    protected List<Card> removeCardsFromWaste(int numberOfCards){
        return this.board.removeCardsFromWaste(numberOfCards);
    }
    
    protected void removeAllCardsFromWaste() {
        this.board.removeAllCardsFromWaste();    
    }
    
    public List<Card> removeCardsFromStock(int numberOfCards){
        return this.board.removeCardsFromStock(numberOfCards);
    }
    
    public List<Card> removeCardsFromFoundation(Suit foundationSuit, int numberOfCards){
        return this.board.removeCardsFromFoundation(foundationSuit, numberOfCards);
    }
    
    public List<Card> removeCardsFromTableauPile(int tableauPile, int numberOfCards){
        return this.board.getCardsFromTableauPile(tableauPile, numberOfCards);
    }
    
    public List<Card> getAllCardsFromWaste(){
        return this.board.getAllCardsFromWaste();
    }
    
    public List<Card> getAllCardsFromStock(){
        return this.board.getAllCardsFromStock();
    }
    
    public List<Card> getAllCardsFromFoundation(Suit foundationSuit){
        return this.board.getAllCardsFromFoundation(foundationSuit);
    }
    
    public List<Card> getAllCardsFromTableauPile(int tableauPile){
        return this.board.getAllCardsFromTableauPile(tableauPile);
    }
    
    public List<Card> getCardsFromWaste(int numberOfCards){
        return this.board.getCardsFromWaste(numberOfCards);
    }
    
    public List<Card> getCardsFromStock(int numberOfCards){
        return this.board.getCardsFromStock(numberOfCards);
    }
    
    public List<Card> getCardsFromFoundation(Suit foundationSuit, int numberOfCards){
        return this.board.getCardsFromFoundation(foundationSuit, numberOfCards);
    }
    
    public List<Card> getCardsFromTableauPile(int tableauPile, int numberOfCards){
        return this.board.getCardsFromTableauPile(tableauPile, numberOfCards);
    }
    
    public void addCardsOntoFoundation(Suit foundationSuit, List<Card> cards){
        this.board.addCardsOntoFoundation(foundationSuit, cards);
    }
    
    public void addCardsOntoWaste(List<Card> cards){
        this.board.addCardsOntoWaste(cards);
    }
    
    public void addCardsOntoStock(List<Card> cards){
        this.board.addCardsOntoStock(cards);
    }
    
    public void addCardsOntoTableauPile(int tableauPile, List<Card> cards){
        this.board.addCardsOntoTableauPile(tableauPile, cards);
    }
    
    public void setBoardState(BoardState boardState){
        this.board.setBoardState(boardState);
    }
    
    public void getBoardState(){
        this.board.getBoardState();
    }
    
    public boolean isGameOver(){
        return board.isGameOver();
    }
}
