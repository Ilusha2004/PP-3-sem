package com.patterns.Menu.Decorator.AnotherDecorators;

import com.patterns.Menu.Decorator.Decorator;
import com.patterns.Menu.Decorator.MainComponents;
import com.patterns.Menu.Decorator.Interface.MenuInterface;
import com.patterns.Order.Order;
import com.patterns.SingleTon.DataBase;

public class TypeDecorator extends Decorator {

    public TypeDecorator(MenuInterface inter) {
        super(inter);
    }
    
    public void setPosition() {
        Order temp = new Order(MainComponents.getOrder());
        temp.setType(DataBase.Data.get(DataBase.Data.size() - MainComponents.getCounter()).getSecondItem().getType());
        MainComponents.setOrder(new Order(temp));
        super.setPosition();
    }

}
