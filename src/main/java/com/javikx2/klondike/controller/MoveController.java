package com.javikx2.klondike.controller;

import com.javikx2.klondike.model.Board;
import com.javikx2.klondike.model.BoardState;
import com.javikx2.klondike.model.Card;
import com.javikx2.klondike.view.KlondikeView;
import java.util.List;

public abstract class MoveController extends Controller {

    List<Card> cardsOrigin;

    List<Card> cardsTarget;

    protected MoveController(Board board) {
        super(board);
    }

    @Override
    public void control() {
        cardsOrigin = getOrigin();
        cardsTarget = getTarget();
        if (validateMove()) {
            makeMove();
        } else {
            // Error
        }
        this.setBoardState(BoardState.WAITING_FOR_MOVE);
    }

    public abstract void makeMove();

    public abstract List<Card> getOrigin();

    public abstract List<Card> getTarget();

    public abstract boolean validateMove();

    public abstract void acceptVisitFrom(KlondikeView klondikeView);
}
