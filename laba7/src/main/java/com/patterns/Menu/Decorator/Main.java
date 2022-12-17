package com.patterns.Menu.Decorator;

import javax.xml.crypto.Data;

import com.patterns.Menu.Decorator.AnotherDecorators.CoffeeDecorator;
import com.patterns.Menu.Decorator.AnotherDecorators.DessertDecorator;
import com.patterns.Menu.Decorator.AnotherDecorators.TableDecorator;
import com.patterns.Menu.Decorator.AnotherDecorators.TypeDecorator;
import com.patterns.SingleTon.DataBase;

public class Main {
    public static void main(String[] args) {
        DataBase.getInstance(null);
        Decorator dec = new CoffeeDecorator(new DessertDecorator(new TableDecorator(new TypeDecorator(new MainComponents()))));
        dec.doOption();
        dec.setPosition();
    }
    
}
