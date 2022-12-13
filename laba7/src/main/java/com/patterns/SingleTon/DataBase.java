package com.patterns.SingleTon;

import java.util.List;

public class DataBase {
    private static DataBase instance;
    public List<String> Data;

    private DataBase(List<String> list){
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.getStackTrace();
        }
        this.Data = list;
    }

    public static DataBase getInstance(List<String> list) {
        if(instance == null) {
            instance = new DataBase(list);
        }
        return instance;
    } 


}
