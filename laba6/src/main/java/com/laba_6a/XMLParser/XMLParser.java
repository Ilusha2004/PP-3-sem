package com.laba_6a.XMLParser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import com.laba_6a.car.Car;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class XMLParser {

    private static ArrayList<Car> cars = new ArrayList<>();

    public void Parse(String filePath) throws ParserConfigurationException, SAXException, IOException{

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        HEXParse par = new HEXParse();

        parser.parse(new File(filePath), par);
        
    }

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        XMLParser Main = new XMLParser();
        Main.Parse("resourses/car.xml");
        Main.WriteXMLFile("resourses/car.xml");
    }

    private static class HEXParse extends DefaultHandler {

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            if(qName.equals("car")){
                String brand = attributes.getValue("brand");
                String color = attributes.getValue("color");
                String pos = attributes.getValue("position");
                String vel = attributes.getValue("velocity");

                cars.add(new Car(brand, color, Double.parseDouble(pos), Double.parseDouble(vel)));
            }
        }

    }

    public void WriteXMLFile(String filePath) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;

        try{
            builder = factory.newDocumentBuilder();
            Document document = builder.newDocument();

            Element element = document.createElementNS("govno", "jk");

            document.appendChild(element);
            element.appendChild(getLanguage(document, "1", "java", "4"));

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transform = transformerFactory.newTransformer(); 
            
            transform.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(document);

            StreamResult result = new StreamResult(new File("resourses/out.xml"));

            transform.transform(source, result);


        } catch(Exception e) {
            e.getStackTrace();
        }

    }

    private static Node getLanguage(Document doc, String id, String name, String age) {
        Element language = doc.createElement("Language");
 
        language.setAttribute("id", id);
 
        language.appendChild(getLanguageElements(doc, language, "name", name));
 
        language.appendChild(getLanguageElements(doc, language, "age", age)); 
        return language;
    }
 
    private static Node getLanguageElements(Document doc, Element element, String name, String value) {
        Element node = doc.createElement(name);
        node.appendChild(doc.createTextNode(value));
        return node;
    }

    public static ArrayList<Car> getCars() {
        return cars;
    }
    
}
