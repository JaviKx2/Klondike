package com.javikx2.klondike.controller;

import java.util.List;

import com.javikx2.klondike.model.Board;
import com.javikx2.klondike.model.BoardState;
import com.javikx2.klondike.model.Card;
import com.javikx2.klondike.view.KlondikeView;

public class FaceUpController extends Controller{

    protected FaceUpController(Board board) {
        super(board);
    }

    @Override
    public void control() {
        faceUpCards();
        this.setBoardState(BoardState.CHECKING_WIN); 
    }
    
    private void faceUpCards(){
        List<Card> cards;
        for(int i=0; i < 7; i++){
            cards = this.getAllCardsFromTableauPile(i);
            cards.get(0).faceUp();
        }
    }

    @Override
    public void acceptVisitFrom(KlondikeView klondikeView) {
        klondikeView.handleVisitFrom(this);
        
        
        
            
    }

}
