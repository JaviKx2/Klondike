package com.javikx2.klondike.controller;

import com.javikx2.klondike.model.Board;

public class Logic {
    Board board;
    
    MenuController menuController;
    MoveController[] moveControllers;  
    FaceUpController faceUpController;
    WinController winController;
    
    public Logic(){
        board = new Board();
        menuController = new MenuController(board);
        moveControllers = new MoveController[] {
                new StockToWasteMovementController(board),
                new WasteToStockMoveController(board),
                new WasteToFoundationMoveController(board),
                new WasteToTableauPileMoveController(board),
                new TableauPileToFoundationMoveController(board),
                new TableauPileToTableauPileMoveController(board),
                new FoundationToTableauPileMoveController(board)
        };
        faceUpController = new FaceUpController(board);
        winController = new WinController(board);
    }

    public Controller getController() {      
        switch(board.getBoardState()){
        case WAITING_FOR_MOVE:
            return menuController;
        case MOVING_FROM_STOCK_TO_WASTE:
            return moveControllers[0];
        case MOVING_FROM_WASTE_TO_STOCK:
            return moveControllers[1];
        case MOVING_FROM_WASTE_TO_FOUNDATION:
            return moveControllers[2];
        case MOVING_FROM_WASTE_TO_TABLEAUPILE:
            return moveControllers[3];
        case MOVING_FROM_TABLEAUPILE_TO_FOUNDATION:
            return moveControllers[4];
        case MOVING_FROM_TABLEAUPILE_TO_TABLEAUPILE:
            return moveControllers[5];
        case MOVING_FROM_FOUNDATION_TO_TABLEAUPILE:
            return moveControllers[6];
        case FACING_UP_CARDS:
            return moveControllers[7];
        case CHECKING_WIN:
            return winController;
        case GAME_OVER:
        default:
            return null;        
        }
    }
}
