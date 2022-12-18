package com.patterns.Menu.Decorator.AnotherDecorators;

import com.patterns.Menu.Decorator.Decorator;
import com.patterns.Menu.Decorator.MainComponents;
import com.patterns.Menu.Decorator.Interface.MenuInterface;
import com.patterns.Order.Order;
import com.patterns.SingleTon.DataBase;

public class CoffeeDecorator extends Decorator {

    public CoffeeDecorator(MenuInterface interInterface) {
        super(interInterface);
    }

    public void setPosition() {
        Order temp = new Order(MainComponents.getOrder());
        temp.setCoffee(DataBase.Data.get(DataBase.Data.size() - MainComponents.getCounter()).getSecondItem().getCoffee());
        MainComponents.setOrder(new Order(temp));
        super.setPosition();
    }
    
}
