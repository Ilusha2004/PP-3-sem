package com.patterns.Menu.Decorator;

import com.patterns.Menu.Decorator.Interface.MenuInterface;
import com.patterns.Order.Order;

public class MainComponents implements MenuInterface {

    private static Order order = new Order(null, null, null, null, null);
    private String path;

    @Override
    public void doOption() {
        System.out.println("Hello");
    }

    @Override
    public void setPosition() {
        System.out.println("Order");
    }

    public static Order getOrder() {
        return order;
    }

    public static void setOrder(Order order_1) {
        order = order_1;
    }
    
}
