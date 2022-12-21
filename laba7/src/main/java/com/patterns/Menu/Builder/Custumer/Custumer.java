package com.patterns.Menu.Builder.Custumer;

import com.patterns.Menu.Builder.OrderBuilder;
import com.patterns.SingleTon.DataBase;

public class Custumer {
    private String name;
    private static Integer counter = DataBase.Data.size();

    public void order(OrderBuilder builder) {
        setName(DataBase.Data.get(DataBase.Data.size() - counter).getFirstItem());
        builder.setType(DataBase.Data.get(DataBase.Data.size() - counter).getSecondItem().getType());
        builder.setCoffee(DataBase.Data.get(DataBase.Data.size() - counter).getSecondItem().getCoffee());
        builder.setDessert(DataBase.Data.get(DataBase.Data.size() - counter).getSecondItem().getDessert());
        builder.setTable(DataBase.Data.get(DataBase.Data.size() - counter).getSecondItem().getTable());
        builder.setAmoutOrders(DataBase.Data.get(DataBase.Data.size() - counter).getSecondItem().getAmoutOrders());
        counter--;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
