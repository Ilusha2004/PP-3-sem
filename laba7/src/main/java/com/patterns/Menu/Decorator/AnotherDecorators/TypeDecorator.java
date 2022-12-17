package com.patterns.Menu.Decorator.AnotherDecorators;

import com.patterns.Menu.Decorator.Decorator;
import com.patterns.Menu.Decorator.MainComponents;
import com.patterns.Menu.Decorator.Interface.MenuInterface;
import com.patterns.Order.Order;

public class TypeDecorator extends Decorator {

    public TypeDecorator(MenuInterface inter) {
        super(inter);
    }

    @Override
    public void doOption() {
        System.out.println("hi");
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
