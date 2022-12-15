package com.laba_6a.Main;

import java.util.ArrayList;
import com.laba_6a.JsonParser.ParserJson;
import com.laba_6a.XMLParser.XMLParser;
import com.laba_6a.car.Car;
import com.laba_6a.car.Track;
import com.laba_6b.archive.Archive;
import com.laba_6b.uncrypt.UnCrypt;

public class Main {
    public static void main(String[] args) throws Exception {

        XMLParser parser = new XMLParser();
        ParserJson parserJson = new ParserJson();

        ArrayList<Car> cars = new ArrayList<>();
        System.out.println("Reading XML file...");
        parser.Parse("resourses/lscar.xml");
        cars = XMLParser.getCars();
        Track Main = new Track(cars);
        Main.GetfirstNrapids(10);
        System.out.println(Main.getCars());

        System.out.println("Writting in XML file");
        parser.WriteXMLFile("resourses/xlout.xml");
        
        cars = new ArrayList<>();
        System.out.println("Reading JSON file...");
        parserJson.Parse("resourses/lscar.json");
        cars = ParserJson.getCars();
        Track Main_0 = new Track(cars);
        Main_0.GetfirstNrapids(5);
        System.out.println("Writting in JSON file");
        parserJson.WriteJsonFile("resourses/jsout.json");

        Archive archive = new Archive("jsout.json");
        archive.JarArchiving();
        archive.RarArchiving();
        archive.ZipArchivation();

        Archive archive2 = new Archive("xlout.xml");
        archive2.JarArchiving();
        archive2.RarArchiving();
        archive2.ZipArchivation();

        UnCrypt iUnCrypt = new UnCrypt("jsout.json");
        iUnCrypt.Encrypt();
        iUnCrypt.Uncode();

        UnCrypt iUnCrypt2 = new UnCrypt("xlout.xml");
        iUnCrypt2.Encrypt();
        iUnCrypt2.Uncode();
    }
    
}

