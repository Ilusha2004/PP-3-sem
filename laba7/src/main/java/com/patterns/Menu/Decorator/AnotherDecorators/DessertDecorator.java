package com.patterns.Menu.Decorator.AnotherDecorators;

import com.patterns.Menu.Decorator.Decorator;
import com.patterns.Menu.Decorator.MainComponents;
import com.patterns.Menu.Decorator.Interface.MenuInterface;
import com.patterns.Order.Order;
import com.patterns.SingleTon.DataBase;

public class DessertDecorator extends Decorator {

    public DessertDecorator(MenuInterface interInterface) {
        super(interInterface);
    }

    public void setPosition() {
        Order temp = new Order(MainComponents.getOrder());
        temp.setDessert(DataBase.Data.get(DataBase.Data.size() - MainComponents.getCounter()).getSecondItem().getDessert());
        MainComponents.setOrder(new Order(temp));
        super.setPosition();
    }
    
}
