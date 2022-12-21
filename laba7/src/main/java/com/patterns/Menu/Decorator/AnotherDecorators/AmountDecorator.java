package com.patterns.Menu.Decorator.AnotherDecorators;

import com.patterns.Menu.Decorator.Decorator;
import com.patterns.Menu.Decorator.MainComponents;
import com.patterns.Menu.Decorator.Interface.MenuInterface;
import com.patterns.Order.Order;
import com.patterns.SingleTon.DataBase;

public class AmountDecorator extends Decorator {

    public AmountDecorator(MenuInterface interInterface) {
        super(interInterface);
    }

    public void setPosition() {
        Order temp = new Order(MainComponents.getOrder());
        temp.setAmoutOrders(DataBase.Data.get(DataBase.Data.size() - MainComponents.getCounter()).getSecondItem().getAmoutOrders());
        MainComponents.setOrder(new Order(temp));
        super.setPosition();
    }
    
}
