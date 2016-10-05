package com.javikx2.klondike.app;

import com.javikx2.klondike.controller.Controller;
import com.javikx2.klondike.controller.Logic;
import com.javikx2.klondike.view.KlondikeView;

public class Klondike {
    private Logic logic;

    private KlondikeView view;
    
    public Klondike(){
        logic = new Logic();
        view = new KlondikeView();
    }

    public void play() {
        Controller controller;
        do{
            controller = logic.getController();
            if(controller != null){
                view.askForVisitingMeBy(controller);
            }
        } while (controller != null);
    }

    public static void main(String[] args) {
        new Klondike().play();
    }
}
