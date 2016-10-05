package com.javikx2.klondike.controller;

import com.javikx2.klondike.model.Board;
import com.javikx2.klondike.model.BoardState;
import com.javikx2.klondike.view.KlondikeView;

public class MenuController extends Controller {

    private int selectedOption;

    protected MenuController(Board board) {
        super(board);
    }

    public void setSelectedOption(int option) {
        this.selectedOption = option;
    }

    public int getSelectedOption() {
        return this.selectedOption;
    }

    @Override
    public void control() {
        switch (this.selectedOption) {
        case 1:
            this.setBoardState(BoardState.MOVING_FROM_STOCK_TO_WASTE);
            break;
        case 2:
            this.setBoardState(BoardState.MOVING_FROM_WASTE_TO_STOCK);
            break;
        case 3:
            this.setBoardState(BoardState.MOVING_FROM_WASTE_TO_FOUNDATION);
            break;
        case 4:
            this.setBoardState(BoardState.MOVING_FROM_WASTE_TO_TABLEAUPILE);
            break;
        case 5:
            this.setBoardState(BoardState.MOVING_FROM_TABLEAUPILE_TO_FOUNDATION);
            break;
        case 6:
            this.setBoardState(BoardState.MOVING_FROM_TABLEAUPILE_TO_TABLEAUPILE);
            break;
        case 7:
            this.setBoardState(BoardState.MOVING_FROM_FOUNDATION_TO_TABLEAUPILE);
            break;
        case 8:
            this.setBoardState(BoardState.MOVING_FROM_STOCK_TO_WASTE);
            break;
        case 9:
            this.setBoardState(BoardState.GAME_OVER);
            break;
        }
    }

    @Override
    public void acceptVisitFrom(KlondikeView klondikeView) {
        klondikeView.handleVisitFrom(this);
    }
}
