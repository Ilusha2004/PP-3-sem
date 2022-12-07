package com.bigdecimal.Main;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input x, where  -1 < x < 1, and k > 0");
        double x = scanner.nextDouble();
        int k = scanner.nextInt();

        if(x < -1 && x > 1){
            System.out.println("Incorrect input!");
        }

        // Row obj = new Row(x, k);
        // System.out.println(BigDecimal.valueOf(obj.TaylorN10()).setScale(k, RoundingMode.HALF_DOWN));

        Big oBig = new Big(x, k);
        System.out.println(oBig.TaylorN1(x, k));
       
        
        scanner.close();
    }
}