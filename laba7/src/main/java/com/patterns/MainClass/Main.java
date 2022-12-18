package com.patterns.MainClass;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

import com.patterns.Menu.Builder.OrderBuilder;
import com.patterns.Menu.Builder.Custumer.Custumer;
import com.patterns.Menu.Decorator.Decorator;
import com.patterns.Menu.Decorator.MainComponents;
import com.patterns.Menu.Decorator.AnotherDecorators.CoffeeDecorator;
import com.patterns.Menu.Decorator.AnotherDecorators.DessertDecorator;
import com.patterns.Menu.Decorator.AnotherDecorators.TableDecorator;
import com.patterns.Menu.Decorator.AnotherDecorators.TypeDecorator;
import com.patterns.Order.Order;
import com.patterns.Parser.XMLParser;
import com.patterns.SingleTon.DataBase;

public class Main {
    
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        XMLParser parser = new XMLParser();
        parser.Parse("src/res/order.xml");

        System.out.println("Builder part");

        Custumer[] custumer = new Custumer[DataBase.Data.size()];
        OrderBuilder[] builder = new OrderBuilder[DataBase.Data.size()];
        for(Integer i = 0; i < DataBase.Data.size(); i++) {
            custumer[i] = new Custumer();
            builder[i] = new OrderBuilder();
            custumer[i].order(builder[i]);
            Order order = builder[i].getOrder();
            System.out.println(order);
        }
        
        System.out.println("Decorator part");
        
        Decorator[] dec = new Decorator[DataBase.Data.size()];

        for(var id : dec) {
            id = new CoffeeDecorator(new DessertDecorator(new TableDecorator(new TypeDecorator(new MainComponents()))));
            id.setPosition();
        }
    }
}
