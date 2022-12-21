package com.patterns.Menu.Builder;

import com.patterns.Menu.Builder.MenuInterface.MenuInteface;
import com.patterns.Menu.Builder.ObjectClasses.Coffee;
import com.patterns.Menu.Builder.ObjectClasses.Dessert;
import com.patterns.Menu.Builder.ObjectClasses.Table;
import com.patterns.Menu.Builder.Type.MenuType;
import com.patterns.Order.Order;

public class OrderBuilder implements MenuInteface {
    
    private MenuType type;
    private Coffee coffee;
    private Dessert dessert;
    private Table table;
    private Integer amountOrders;

    public void setType(MenuType type) {
        this.type = type;
    }

    @Override
    public void setCoffee(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public void setDessert(Dessert dessert){
        this.dessert = dessert;
    }

    @Override
    public void setTable(Table table){
        this.table = table;
    }

    @Override
    public void setAmoutOrders(Integer amount) {
        this.amountOrders = amount;
    }   

    public Order getOrder() {
        return new Order(type, coffee, dessert, table, amountOrders);
    }

}
