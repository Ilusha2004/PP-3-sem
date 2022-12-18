package com.patterns.SingleTon;

import java.util.List;

import com.patterns.Order.Order;
import com.patterns.Pair.Pair;

public class DataBase {
    private static DataBase instance;
    public static List<Pair<String, Order>> Data;

    private DataBase(List<Pair<String, Order>> list){
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.getStackTrace();
        }
        Data = list;
    }

    public static DataBase getInstance(List<Pair<String, Order>> list) {
        if(instance == null) {
            instance = new DataBase(list);
        }
        return instance;
    } 


}
