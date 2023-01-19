package com.control;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import javax.annotation.processing.FilerException;

public class ClassDB implements InterfBD {
    
    private static List<Student> students;
    private static Map<String, Student> studMap; 

    public void ReadFile(String path) {
        students = new ArrayList<>();

        try(BufferedReader buffer = new BufferedReader(new FileReader(path));){

            while(buffer.ready()) {
                StringTokenizer tokenizer = new StringTokenizer(buffer.readLine().toString(), " ;_");

                String[] temp = new String[5];

                Integer counter = 0;

                while(tokenizer.hasMoreTokens()) {
                    temp[counter] = tokenizer.nextElement().toString();
                    counter++;
                }

                String FirstName = temp[1];
                String SecondName = temp[0];
                String LastName = temp[2];
                Double srAmount = Double.valueOf(temp[3]);
                String ID = temp[4];
                
                students.add(new Student(FirstName, SecondName, LastName, srAmount, ID));
                
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void ReadFileInMap(String path) throws IOException {
        ReadFile(path);
        studMap = new HashMap<String, Student>();
        try(BufferedReader buffer = new BufferedReader(new FileReader(path));){

            while(buffer.ready()) {

                StringTokenizer tokenizer = new StringTokenizer(buffer.readLine().toString(), " ;_");

                String[] temp = new String[5];

                Integer counter = 0;

                while(tokenizer.hasMoreTokens()) {
                    temp[counter] = tokenizer.nextElement().toString();
                    counter++;
                }

                String FirstName = temp[1];
                String SecondName = temp[0];
                String LastName = temp[2];
                Double srAmount = Double.valueOf(temp[3]);
                String ID = temp[4];

                studMap.put(SecondName, new Student(FirstName, null, LastName, srAmount, ID));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
            
    }

    public void WriteFile(String path) throws IOException {

        try(BufferedWriter buffer = new BufferedWriter(new FileWriter(path));) {
            for(var item : studMap.entrySet()){
                buffer.write(item.getKey() + "\n");
                buffer.write(item.getValue().toString() + "\n");
            }
        } catch(FilerException e){
            System.out.println(e.getMessage());
        }
    }

    public void ReadFileInListWithXML(String path) throws IOException {
        WriteFile("src/res/rezult1.txt");
    }

    public void FindSecondNamesWithVanAndWrite(String path) throws IOException {

        try(BufferedWriter buffer = new BufferedWriter(new FileWriter(path));) {

            for(var item : students){
                if(item.getSecondName().contains("van")){
                    buffer.write(item.toString() + "\n");
                }
            }

        } catch(FilerException e){
            System.out.println(e.getMessage());
        }

    }

    public void WriteCorrectID(String path) throws IOException {

        try(BufferedWriter buffer = new BufferedWriter(new FileWriter(path));) {

            for(var item : studMap.entrySet()){
                StringTokenizer tokenizer = new StringTokenizer(item.getValue().getID(), "/\"№%:?*()+");
                String temp = "";

                while(tokenizer.hasMoreTokens()) {
                    temp += tokenizer.nextElement().toString();
                }

                if(item.getValue().getID().length() != temp.length()) {
                    item.getValue().setID(item.getValue().checkID());
                    buffer.write(item.getKey() + "\n");
                    buffer.write(item.getValue().toString() + "\n");
                }
            }

            for(var id : students) {
                id.setID(id.checkID());
            }

        } catch(FilerException e){
            System.out.println(e.getMessage());
        }
        
    }

    public void WriteSortedList(String path) throws IOException {

        for(Student item : students) {
            item.setID(item.checkID());
        }

        Collections.sort(students, (s0, s1) -> s1.compareTo(s0));

        try(BufferedWriter buffer = new BufferedWriter(new FileWriter(path));) {
            for(Student item : students) {
                buffer.write(item.toString() + "\n");
            }

        } catch(FilerException e){
            System.out.println(e.getMessage());
        }

    }

    public static List<Student> getStudents() {
        return students;
    }

    public Map<String, Student> getStudMap() {
        return studMap;
    }

    @Override
    public void StartMethods() {

        try {
            ClassDB Main = new ClassDB();
            Main.ReadFile("var//src//res/test2.txt");
            Main.ReadFileInMap("var/src/res/test2.txt");
            Main.WriteCorrectID("var/src/res/rezuncorrect1.txt");
            Main.FindSecondNamesWithVanAndWrite("var/src/res/rezreg.txt");
            Main.WriteFile("var/src/res/rezult1.txt");
            Main.WriteSortedList("var/src/res/rezsort.txt");
            XMLParser parser = new XMLParser();
            XMLParser.setOrders(ClassDB.getStudents());
            parser.WriteXMLFile("var/src/res/rezXML.xml");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

}

