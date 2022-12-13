package com.patterns.Menu.Builder.Order;

import com.patterns.Menu.Builder.ObjectClasses.Coffee;
import com.patterns.Menu.Builder.ObjectClasses.Dessert;
import com.patterns.Menu.Builder.ObjectClasses.Table;
import com.patterns.Menu.Builder.Type.MenuType;

public class Order {
    private MenuType type;
    private Coffee coffee;
    private Dessert dessert;
    private Table table;
    private Integer amoutOrders;
    
    public Order(MenuType type, Coffee coffee, Dessert dessert, Table table, Integer amoutOrders) {
        this.type = type;
        this.coffee = coffee;
        this.dessert = dessert;
        this.table = table;
        this.amoutOrders = amoutOrders;
    }

    public MenuType getType() {
        return type;
    }

    public void setType(MenuType type) {
        this.type = type;
    }

    public Coffee getCoffee() {
        return coffee;
    }

    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public Dessert getDessert() {
        return dessert;
    }

    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public Integer getAmoutOrders() {
        return amoutOrders;
    }

    public void setAmoutOrders(Integer amoutOrders) {
        this.amoutOrders = amoutOrders;
    }

    @Override
    public String toString() {
        return "Order [type=" + type + ", coffee=" + coffee + ", dessert=" + dessert + ", table=" + table
                + ", amoutOrders=" + amoutOrders + "]";
    }

}