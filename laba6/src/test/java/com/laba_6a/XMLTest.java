package com.laba_6a;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.Before;
import org.junit.Test;
import org.xml.sax.SAXException;

import com.laba_6a.XMLParser.XMLParser;

public class XMLTest {

    private XMLParser parser = new XMLParser();

    @Before
    public void ReadTest() throws ParserConfigurationException, SAXException, IOException {
        parser.Parse("resourses/test.xml");
    }

    @Test
    public void TestingContainer() {
        assertEquals(XMLParser.getCars().size(), 2);
    }

    @Test
    public void TestingResults() {
        StringBuffer buffer = new StringBuffer("");
        String resulString = "Audi 112.3 212.1 Audi 124.2 223.5";

        buffer.append(XMLParser.getCars().get(0).getBrand() + " ");
        buffer.append(XMLParser.getCars().get(0).getPosition() + " ");
        buffer.append(XMLParser.getCars().get(0).getVelocity() + " ");
        buffer.append(XMLParser.getCars().get(1).getBrand() + " ");
        buffer.append(XMLParser.getCars().get(1).getPosition() + " ");
        buffer.append(XMLParser.getCars().get(1).getVelocity());
    
        assertEquals(buffer.toString(), resulString);
    }

    @Test
    public void WriteTest() throws ParserConfigurationException, SAXException, IOException {
        parser.WriteXMLFile("resourses/out.xml");
        parser.Parse("resourses/out.xml");
        assertEquals(XMLParser.getCars().size(), 2);

        StringBuffer buffer = new StringBuffer("");
        String resulString = "Audi 112.3 212.1 Audi 124.2 223.5";

        buffer.append(XMLParser.getCars().get(0).getBrand() + " ");
        buffer.append(XMLParser.getCars().get(0).getPosition() + " ");
        buffer.append(XMLParser.getCars().get(0).getVelocity() + " ");
        buffer.append(XMLParser.getCars().get(1).getBrand() + " ");
        buffer.append(XMLParser.getCars().get(1).getPosition() + " ");
        buffer.append(XMLParser.getCars().get(1).getVelocity());
    
        assertEquals(buffer.toString(), resulString);
    }
    
}
