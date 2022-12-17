package com.patterns.SingleTon;

import java.util.List;

import com.patterns.Order.Order;

public class DataBase {
    private static DataBase instance;
    public List<Order> Data;

    private DataBase(List<Order> list){
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.getStackTrace();
        }
        this.Data = list;
    }

    public static DataBase getInstance(List<Order> list) {
        if(instance == null) {
            instance = new DataBase(list);
        }
        return instance;
    } 


}
