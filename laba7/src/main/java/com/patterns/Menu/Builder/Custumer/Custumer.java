package com.patterns.Menu.Builder.Custumer;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.patterns.Menu.Builder.OrderBuilder;
import com.patterns.Order.Order;
import com.patterns.Parser.XMLParser;
import com.patterns.SingleTon.DataBase;

public class Custumer {
    private String name;
    private Integer counter = DataBase.Data.size();

    public void order(OrderBuilder builder) {
        setName(DataBase.Data.get(DataBase.Data.size() - counter).getFirstItem());
        builder.setType(DataBase.Data.get(DataBase.Data.size() - counter).getSecondItem().getType());
        builder.setCoffee(DataBase.Data.get(DataBase.Data.size() - counter).getSecondItem().getCoffee());
        builder.setDessert(DataBase.Data.get(DataBase.Data.size() - counter).getSecondItem().getDessert());
        builder.setTable(DataBase.Data.get(DataBase.Data.size() - counter).getSecondItem().getTable());
        counter--;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
