package com.patterns.Menu.Decorator;

import com.patterns.Menu.Decorator.Interface.MenuInterface;
import com.patterns.Order.Order;
import com.patterns.SingleTon.DataBase;

public class MainComponents implements MenuInterface {

    private static Order order = new Order();
    private static Integer counter = DataBase.Data.size();

    @Override
    public void setPosition() {
        System.out.println(getOrder().toString());
        counter--;
    }

    public static Order getOrder() {
        return order;
    }

    public static void setOrder(Order order_1) {
        order = order_1;
    }

    public static Integer getCounter() {
        return counter;
    }
    
}
