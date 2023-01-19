package com.kolok.apteka;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.processing.FilerException;

import com.kolok.Regex.Regexes;
import com.kolok.lekarstvo.Lekarstvo;

public class Apteka {
    public List<Lekarstvo> apteka = new ArrayList<Lekarstvo>();

    public List<Lekarstvo> ReadFile(String path){
        try(BufferedReader buffer = new BufferedReader(new FileReader(path));){
            Integer amount = Integer.parseInt(buffer.readLine());

            while(buffer.ready()) {
                if(amount == 0){
                    break;
                }
                String[] temp = buffer.readLine().split(" ");
                String Name = null;
                int Year = 0;
                String NameManufactor = null;
                int AmountBoxes = 0;
                Double PriceForOne = 0.0d;

                Regexes reg = new Regexes();

                try{

                    for(int k = 0; k < 4; k++) {
                        if(temp[k].matches(reg.getYear())){
                            Year = Integer.parseInt(temp[k]);
                        }
                        else if(temp[k].matches(reg.getAmountBoxes())){
                            AmountBoxes = Integer.parseInt(temp[k]);
                        }
                        else if(temp[k].matches(reg.getNameManufactor())){
                            NameManufactor = temp[k];
                        }
                        else if(temp[k].matches(reg.getName())){
                            Name = temp[k];
                        }
                        else if(temp[k].matches(reg.getPriceForOne())){
                            PriceForOne = Double.parseDouble(temp[k]); 
                        }
                    }
    
                } catch(Exception e) {
                    System.out.println("Invalid format");
                    e.getStackTrace();
                }

                apteka.add(new Lekarstvo(Name, Year, NameManufactor, AmountBoxes, PriceForOne));


                amount--;
                
            }

        } catch(Exception e) {
            e.getStackTrace();
        }

        return apteka;

    }

    public void WriteFile(String path) throws IOException {
        try(BufferedWriter buffer = new BufferedWriter(new FileWriter(path));) {
            for(var item : apteka){
                buffer.write(item.toString() + "\n");
            }

        } catch(FilerException e){
            e.getStackTrace();
        }
    }

    public void SortingByBoxes() {
        Collections.sort(apteka, (s0, s1) -> Integer.valueOf(s1.getAmountBoxes()).compareTo(s0.getAmountBoxes()));
    }

    public void SortingByYear() {
        Collections.sort(apteka, (s0, s1) -> Integer.valueOf(s1.getYear()).compareTo(s0.getYear()));
    }

    public void SortingByPrice() {
        Collections.sort(apteka, (s0, s1) -> Double.valueOf(s1.getPriceForOne()).compareTo(Double.valueOf(s0.getPriceForOne())));
    }

    public void SortingByNameManufactor() {
        Collections.sort(apteka, (s0, s1) -> String.valueOf(s1.getNameManufactor()).compareTo(String.valueOf(s0.getNameManufactor())));
    }

    public void SortingByName() {
        Collections.sort(apteka, (s0, s1) -> String.valueOf(s1.getName()).compareTo(String.valueOf(s0.getName())));
    }

    public void Print() {
        for(var item : apteka) {
            System.out.println(item.toString());
        }
    }

    public static void main(String[] args) throws IOException {
        Apteka Main = new Apteka();
        Main.ReadFile("src/res/InLekarstva.txt");
        System.out.println("сортировка по коробкам");
        Main.SortingByBoxes();
        Main.Print();
        System.out.println("сортировка по цене");
        Main.SortingByPrice();
        Main.Print();
        System.out.println("сортировка по году");
        Main.SortingByYear();
        Main.Print();
        System.out.println("запись файла");
        Main.WriteFile("src/res/OutLekarstva.txt");
    }
    
}
