package com.patterns.Menu.Decorator;

import com.patterns.Menu.Decorator.AnotherDecorators.CoffeeDecorator;
import com.patterns.Menu.Decorator.AnotherDecorators.DessertDecorator;
import com.patterns.Menu.Decorator.AnotherDecorators.TableDecorator;
import com.patterns.Menu.Decorator.AnotherDecorators.TypeDecorator;

public class Main {
    public static void main(String[] args) {
        Decorator dec = new CoffeeDecorator(new DessertDecorator(new TableDecorator(new TypeDecorator(new MainComponents()))));
        dec.doOption();
    }
    
}
