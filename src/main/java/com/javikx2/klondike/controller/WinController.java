package com.javikx2.klondike.controller;

import com.javikx2.klondike.model.Board;
import com.javikx2.klondike.model.BoardState;
import com.javikx2.klondike.view.KlondikeView;

public class WinController extends Controller{

    protected WinController(Board board) {
        super(board);
    }

    @Override
    public void control() {
        if(isWin()){
            this.setBoardState(BoardState.GAME_OVER);
        }else{
            this.setBoardState(BoardState.WAITING_FOR_MOVE);
        }       
    }
    
    private boolean isWin(){
        return this.isGameOver();     
    }

    @Override
    public void acceptVisitFrom(KlondikeView klondikeView) {
        klondikeView.handleVisitFrom(this);        
    }

}
