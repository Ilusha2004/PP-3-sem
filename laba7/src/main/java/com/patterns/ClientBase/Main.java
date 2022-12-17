package com.patterns.ClientBase;

import com.patterns.Menu.Builder.OrderBuilder;
import com.patterns.Menu.Builder.Custumer.Custumer;
import com.patterns.Order.Order;

public class Main { 
    
    public static void main(String[] args) {
        Custumer custumer = new Custumer();
        OrderBuilder builder = new OrderBuilder();
        custumer.order(builder);
        Order order = builder.getOrder();
        System.out.println(order.getTable());
        System.out.println(order);
        
    }
    
}
