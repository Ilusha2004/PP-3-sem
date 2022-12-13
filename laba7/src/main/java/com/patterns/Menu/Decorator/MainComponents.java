package com.patterns.Menu.Decorator;

import com.patterns.Menu.Decorator.Interface.MenuInterface;

public class MainComponents implements MenuInterface {

    @Override
    public void doOption() {
        System.out.println("Hello");
    }
    
}
