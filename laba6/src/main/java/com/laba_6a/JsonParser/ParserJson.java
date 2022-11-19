package com.laba_6a.JsonParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ParserJson {

    private static JSONObject object;


    public static void Parse(String reader) {
        try {
            FileReader Reader = new FileReader(reader);
            JSONParser Parser = new JSONParser();
            JSONObject object = null;
            try {
                object = (JSONObject) Parser.parse(reader);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            JSONArray array = (JSONArray) object.get("cars");

            var iterator = array.iterator();

            while(iterator.hasNext()){
                JSONObject temp = (JSONObject) iterator.next();
                System.out.println(temp.get("Brand") + " " + temp.get("Color") + " " + temp.get("Position") + " " + temp.get("Velocity"));
            }
            
        } catch (FileNotFoundException exp) {
            exp.printStackTrace();
        } catch (IOException exp) { 
            exp.printStackTrace();
        } catch (NullPointerException exp){
            exp.printStackTrace();
        }

    }

    public static void WriteJsonFile(String reader) throws IOException {
        object = new JSONObject();
        object.put("temporary", 23);
        object.put("temp", "hitman");

        JSONArray array = new JSONArray();
        array.add("heyyyyyy");
        array.add("fun");

        object.put("mess", array);
        Files.write(Paths.get(reader), object.toJSONString().getBytes());
        
    }


    public static void main(String[] args) throws IOException {
        Parse("resourses/car.json");
        WriteJsonFile("resourses/out.json");
    }
    
}