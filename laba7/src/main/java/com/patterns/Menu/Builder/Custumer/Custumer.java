package com.patterns.Menu.Builder.Custumer;

import com.patterns.Menu.Builder.OrderBuilder;
import com.patterns.Menu.Builder.ObjectClasses.Coffee;
import com.patterns.Menu.Builder.ObjectClasses.Dessert;
import com.patterns.Menu.Builder.ObjectClasses.Table;
import com.patterns.Menu.Builder.Type.MenuType;

public class Custumer {

    private String name;

    public void order(OrderBuilder builder) {
        setName("Vlad");
        builder.setType(MenuType.BREAKFAST);
        builder.setCoffee(new Coffee(40.1d, false, 4, "arabica"));
        builder.setDessert(new Dessert(2, "honey", "vafles", "chocolate"));
        builder.setTable(new Table(4, 3));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
