package com.javikx2.klondike.view;

import com.javikx2.klondike.controller.Controller;
import com.javikx2.klondike.controller.FaceUpController;
import com.javikx2.klondike.controller.StockToWasteMovementController;
import com.javikx2.klondike.controller.FoundationToTableauPileMoveController;
import com.javikx2.klondike.controller.MenuController;
import com.javikx2.klondike.controller.TableauPileToFoundationMoveController;
import com.javikx2.klondike.controller.TableauPileToTableauPileMoveController;
import com.javikx2.klondike.controller.WasteToStockMoveController;
import com.javikx2.klondike.controller.WasteToFoundationMoveController;
import com.javikx2.klondike.controller.WasteToTableauPileMoveController;
import com.javikx2.klondike.controller.WinController;
import com.javikx2.klondike.util.ConsoleIO;
import com.javikx2.klondike.util.LimitedIntDialog;

public class KlondikeView {

    public void askForVisitingMeBy(Controller controller) {
        controller.acceptVisitFrom(this);
    }

    public void handleVisitFrom(StockToWasteMovementController movementController) {
        movementController.control();
    }

    public void handleVisitFrom(FoundationToTableauPileMoveController movementController) {
        movementController.setFoundationPile(readFoundationPile());
        movementController.setTableauPile(readTableauPile());
        movementController.control();
    }

    public void handleVisitFrom(TableauPileToFoundationMoveController movementController) {
        movementController.setFoundationPile(readFoundationPile());
        movementController.setTableauPile(readTableauPile());
        movementController.control();
    }

    public void handleVisitFrom(TableauPileToTableauPileMoveController movementController) {
        movementController.setTableauPileOrigin(readTableauPile());
        movementController.setNumOfCards(new ConsoleIO().readInt("How many cards?: "));
        movementController.setTableauPileTarget(readTableauPile());
        movementController.control();
    }

    public void handleVisitFrom(WasteToStockMoveController movementController) {
        movementController.control();
    }

    public void handleVisitFrom(WasteToFoundationMoveController movementController) {
        movementController.control();
    }

    public void handleVisitFrom(WasteToTableauPileMoveController movementController) {
        
        movementController.control();
    }

    public void handleVisitFrom(MenuController menuController) {
        new MenuView(menuController).show();
    }

    public void handleVisitFrom(FaceUpController faceUpController) {
        faceUpController.control();      
    }

    public void handleVisitFrom(WinController winController) {
        winController.control();        
    }

    private int readFoundationPile(){
        return new LimitedIntDialog("Choose foundation: ", 1, 4).read();
    }
    
    private int readTableauPile(){
        return new LimitedIntDialog("Choose tableauPile: ", 1, 7).read();
    }
}
