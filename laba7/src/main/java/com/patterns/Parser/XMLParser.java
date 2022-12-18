package com.patterns.Parser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import com.patterns.Menu.Builder.ObjectClasses.Coffee;
import com.patterns.Menu.Builder.ObjectClasses.Dessert;
import com.patterns.Menu.Builder.ObjectClasses.Table;
import com.patterns.Menu.Builder.Type.MenuType;
import com.patterns.Order.Order;
import com.patterns.Pair.Pair;
import com.patterns.SingleTon.DataBase;

public class XMLParser {

    private static List<Pair<String, Order>> orders = new ArrayList<Pair<String, Order>>();

    public void Parse(String filePath) throws ParserConfigurationException, SAXException, IOException{
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        HEXParse par = new HEXParse();
        parser.parse(new File(filePath), par);
    }

    private static class HEXParse extends DefaultHandler {

        private Order temp = new Order();
        private String name = new String();
        private Integer counter = 0;

        @Override
        public void startElement(String uri, String me, String qName, Attributes attributes) throws SAXException {

            if(qName.equals("person")){
                name = attributes.getValue("name");
            }

            if(qName.equals("menutype")){
                String type = attributes.getValue("type");
                if(type == MenuType.BREAKFAST.toString()){
                temp.setType(MenuType.BREAKFAST);
                }
                else if(type == MenuType.LUNCH.toString()){
                    temp.setType(MenuType.LUNCH);
                }
                else if(type == MenuType.DINNER.toString()){
                    temp.setType(MenuType.DINNER);
                }
            }

            if(qName.equals("table")){
                String numberTable = attributes.getValue("numberTable");
                String amountOfTable = attributes.getValue("amountOfTable");
                temp.setTable(new Table(Integer.valueOf(numberTable),
                              Integer.valueOf(amountOfTable)));
            }

            if(qName.equals("dessert")){
                String filling = attributes.getValue("filling");
                String mainPart = attributes.getValue("mainPart");
                String top = attributes.getValue("top");
                temp.setDessert(new Dessert(filling,
                                mainPart,
                                top));
            }

            if(qName.equals("amount")){
                String am = attributes.getValue("am");
                temp.setAmoutOrders(Integer.valueOf(am));
            }

            if(qName.equals("coffee")){
                String tempeture = attributes.getValue("tempeture");
                String is_sweet = attributes.getValue("is_sweet");
                String strenght = attributes.getValue("strenght");
                String typeCoffeeBeans = attributes.getValue("typeCoffeeBeans"); 
                temp.setCoffee(new Coffee(Double.valueOf(tempeture),
                               Boolean.valueOf(is_sweet),
                               Integer.valueOf(strenght),
                               typeCoffeeBeans));
            }

            counter++;
            if(counter == 6){
                orders.add(new Pair<String,Order>(name, temp));
                counter = 0;
            }
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            DataBase.getInstance(orders);
        }

    }

    public static List<Pair<String, Order>> getOrders() {
        return orders;
    }

    public static void setOrders(List<Pair<String, Order>> orders) {
        XMLParser.orders = orders;
    }
    
}