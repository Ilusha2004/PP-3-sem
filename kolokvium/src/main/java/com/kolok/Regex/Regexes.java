package com.kolok.Regex;

public class Regexes {
    public String Year = "[2][0][2][2-5]";
    public String NameManufactor = "[<][a-z A-Z]*[>]";
    public String AmountBoxes = "^[1-9][0-9]?$|^100$";
    public String Name = "[\"][a-z A-Z]*[\"]";
    public String PriceForOne = "[0-9]*[.][0-9]*";

    public static void main(String[] args) {
        String str = "2025";
        if(str.matches("[2][0][2][2-5]")){
            System.out.println("yes");
        }
        str = "\"jlahdjllfj\"";
        if(str.matches("[\"][a-z]*[\"]")){
            System.out.println("yes");
        }
        str = "<jkhfsa>";
        if(str.matches("[<][a-z]*[>]")){
            System.out.println("yes");
        }
        str = "89";
        if(str.matches("^[1-9][0-9]?$|^100$")){
            System.out.println("yes");
        }
    }

    public String getYear() {
        return Year;
    }

    public String getNameManufactor() {
        return NameManufactor;
    }

    public String getAmountBoxes() {
        return AmountBoxes;
    }

    public String getName() {
        return Name;
    }

    public String getPriceForOne() {
        return PriceForOne;
    }
    
}
