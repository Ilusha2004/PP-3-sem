package com.patterns.Menu.Builder.MenuInterface;

import com.patterns.Menu.Builder.ObjectClasses.Coffee;
import com.patterns.Menu.Builder.ObjectClasses.Dessert;
import com.patterns.Menu.Builder.ObjectClasses.Table;
import com.patterns.Menu.Builder.Type.MenuType;

public interface MenuInteface {
    void setType(MenuType menuType);
    void setCoffee(Coffee coffee);
    void setDessert(Dessert dessert);
    void setTable(Table table);
}