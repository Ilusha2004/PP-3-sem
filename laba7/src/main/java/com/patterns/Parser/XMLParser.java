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

import com.patterns.Order.Order;

public class XMLParser {

    private static List<Order> cars = new ArrayList<Order>();

    public void Parse(String filePath) throws ParserConfigurationException, SAXException, IOException{
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        HEXParse par = new HEXParse();
        parser.parse(new File(filePath), par);
    }

    private static class HEXParse extends DefaultHandler {

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            Order temp = new Order();

            if(qName.equals("person")){

            }
            if(qName.equals("menutype")){
                String type = attributes.getValue("");
            }
            if(qName.equals("table")){
                String numberTable = attributes.getValue("");
                String amountOfTable = attributes.getValue("");
            }
            if(qName.equals("dessert")){
                String amount = attributes.getValue("");
                String filling = attributes.getValue("");
                String mainPart = attributes.getValue("");
                String top = attributes.getValue("");
            }
            if(qName.equals("coffee")){
                String tempeture = attributes.getValue("");
                String is_sweet = attributes.getValue("");
                String strenght = attributes.getValue("");
                String typeCoffeeBeans = attributes.getValue(""); 
            }
            if(qName.equals("amount")){
                String am = attributes.getValue("");
            }
        }

    }
    
}