package com.patterns.Menu.Decorator.AnotherDecorators;

import com.patterns.Menu.Decorator.Decorator;
import com.patterns.Menu.Decorator.Interface.MenuInterface;

public class DessertDecorator extends Decorator {

    public DessertDecorator(MenuInterface interInterface) {
        super(interInterface);
    }

    @Override
    public void doOption() {
        System.out.println("hola");
        super.doOption();
    }
   
}
