package com.patterns.Menu.Decorator.AnotherDecorators;

import com.patterns.Menu.Decorator.Decorator;
import com.patterns.Menu.Decorator.MainComponents;
import com.patterns.Menu.Decorator.Interface.MenuInterface;
import com.patterns.Order.Order;

public class TableDecorator extends Decorator {

    public TableDecorator(MenuInterface interInterface) {
        super(interInterface);
    }

    @Override
    public void doOption() {
        System.out.println("hallo");
        super.doOption();
    }
    
    public void setPosition() {
        Order temp = new Order(MainComponents.getOrder());
        temp.setDessert(null);
        MainComponents.setOrder(new Order(null));
        System.out.println(MainComponents.getOrder().toString());
        super.setPosition();
    }
    
}
