package com.patterns.Menu.Decorator.AnotherDecorators;

import com.patterns.Menu.Decorator.Decorator;
import com.patterns.Menu.Decorator.Interface.MenuInterface;

public class TypeDecorator extends Decorator {

    public TypeDecorator(MenuInterface inter) {
        super(inter);
    }

    @Override
    public void doOption() {
        System.out.println("hi");
        super.doOption();
    }
    
}
