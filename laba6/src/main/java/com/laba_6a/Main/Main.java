package com.laba_6a.Main;

import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.laba_6a.JsonParser.ParserJson;
import com.laba_6a.XMLParser.XMLParser;
import com.laba_6a.car.Car;
import com.laba_6a.car.Track;

public class Main {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {

        XMLParser parser = new XMLParser();
        ParserJson parserJson = new ParserJson();

        ArrayList<Car> cars = new ArrayList<>();
        System.out.println("Reading XML file...");
        parser.Parse("resourses/car.xml");
        cars = XMLParser.getCars();
        Track Main = new Track(cars);
        Main.GetfirstNrapids(10);

        System.out.println("Writting in XML file");
        parser.WriteXMLFile("resourses/out.xml");
        
        cars = new ArrayList<>();
        System.out.println("Reading JSON file...");
        parserJson.Parse("resourses/car.json");
        cars = ParserJson.getCars();
        Track Main_0 = new Track(cars);
        Main_0.GetfirstNrapids(5);
        System.out.println("Writting in JSON file");
        parserJson.WriteJsonFile("resourses/out.json");
    }
    
}

