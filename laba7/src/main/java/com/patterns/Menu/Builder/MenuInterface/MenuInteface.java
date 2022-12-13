package com.patterns.Menu.Builder.MenuInterface;

import com.patterns.Menu.Builder.ObjectClasses.Coffee;
import com.patterns.Menu.Builder.ObjectClasses.Dessert;
import com.patterns.Menu.Builder.ObjectClasses.Table;
import com.patterns.Menu.Builder.Type.MenuType;

public interface MenuInteface {
    void setType(MenuType menuType); // завтрак, обед, ужин
    void setCoffee(Coffee coffee);   // латте, каппучино, эспрессо, американо
    void setDessert(Dessert dessert); // пуддигн, мороженное, вафли, пирог, панкейки
    void setTable(Table table);

}