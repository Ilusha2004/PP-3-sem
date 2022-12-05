package com.laba_6a;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import com.laba_6a.JsonParser.ParserJson;

public class JSONTest {
    
    private ParserJson parser = new ParserJson();

    @Before
    public void parsing() {
        parser.Parse("resourses/test.json");
    }

    @Test
    public void TestingContainer() {
        assertEquals(ParserJson.getCars().size(), 2);
    }

    @Test
    public void TestingResults() {
        StringBuffer buffer = new StringBuffer("");
        String resulString = "Audi 124.2 212.1 Mercedes-Benz 124.2 223.5";

        buffer.append(ParserJson.getCars().get(0).getBrand() + " ");
        buffer.append(ParserJson.getCars().get(0).getPosition() + " ");
        buffer.append(ParserJson.getCars().get(0).getVelocity() + " ");
        buffer.append(ParserJson.getCars().get(1).getBrand() + " ");
        buffer.append(ParserJson.getCars().get(1).getPosition() + " ");
        buffer.append(ParserJson.getCars().get(1).getVelocity());
    
        assertEquals(buffer.toString(), resulString);
    }

    @Test
    public void WriteTest() throws IOException {
        parser.WriteJsonFile("resourses/out.json");
        parser.Parse("resourses/out.json");

        StringBuffer buffer = new StringBuffer("");
        String resulString = "Audi 124.2 212.1 Mercedes-Benz 124.2 223.5";

        buffer.append(ParserJson.getCars().get(0).getBrand() + " ");
        buffer.append(ParserJson.getCars().get(0).getPosition() + " ");
        buffer.append(ParserJson.getCars().get(0).getVelocity() + " ");
        buffer.append(ParserJson.getCars().get(1).getBrand() + " ");
        buffer.append(ParserJson.getCars().get(1).getPosition() + " ");
        buffer.append(ParserJson.getCars().get(1).getVelocity());
    
        assertEquals(buffer.toString(), resulString);
    }

}
