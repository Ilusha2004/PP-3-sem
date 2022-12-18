package com.patterns.Menu.Decorator;

import com.patterns.Menu.Decorator.Interface.MenuInterface;

public class Decorator implements MenuInterface {

    protected MenuInterface interInterface;

    public Decorator(MenuInterface interInterface) {
        this.interInterface = interInterface;
    }

    @Override
    public void setPosition() {
        this.interInterface.setPosition();
    }

}
