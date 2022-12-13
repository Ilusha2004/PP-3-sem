package com.patterns.Menu.Decorator.AnotherDecorators;

import com.patterns.Menu.Decorator.Decorator;
import com.patterns.Menu.Decorator.Interface.MenuInterface;

public class CoffeeDecorator extends Decorator {

    public CoffeeDecorator(MenuInterface interInterface) {
        super(interInterface);
    }

    @Override
    public void doOption() {
        System.out.println("privet");
        super.doOption();
    }
    
}
