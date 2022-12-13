package com.patterns.Menu.Decorator.AnotherDecorators;

import com.patterns.Menu.Decorator.Decorator;
import com.patterns.Menu.Decorator.Interface.MenuInterface;

public class TableDecorator extends Decorator {

    public TableDecorator(MenuInterface interInterface) {
        super(interInterface);
    }

    @Override
    public void doOption() {
        System.out.println("hallo");
        super.doOption();
    }
    
}
