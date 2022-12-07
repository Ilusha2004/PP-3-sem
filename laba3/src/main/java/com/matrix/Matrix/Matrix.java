package com.matrix.Matrix;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Formatter;
import java.text.NumberFormat;

public class Matrix {

    private int N;
    private Integer[][] array2DInteger;
    private Integer[][] aIntegers2D;
    private Integer max = Integer.MIN_VALUE;
    private int MaxStroke = 0;
    private int MaxS = 0;
    private int krat = 1;

    Formatter form = new Formatter();

    public Matrix(int N, int krat){
        this.N = N;
        this.krat = krat;
        array2DInteger = new Integer[N][N];

        for(int i = 0; i < array2DInteger.length; i++){
            for(int k = 0; k < array2DInteger.length; k++){
                array2DInteger[i][k] = (int)(Math.random() * Math.pow(10, krat) * -1); 
            }
        }
    }

    public void PrintMatrix(){
        for(int i = 0; i < array2DInteger.length; i++){
            form = new Formatter();
            for(Integer p: array2DInteger[i]){
                form.format("% " + (krat + 1) + "d", p);
            }
            System.out.println(form.format(""));
            form.close();
        }
    }

    public void ShowDeletingStrokeAndStolb(){
        System.out.println("Deleting: ");
        for(int i = 0; i < array2DInteger.length; i++){
            form = new Formatter();
            for(int k = 0; k < array2DInteger.length; k++){
                if(k == MaxS || i == MaxStroke){
                    form.format("% " + (krat + 1) + "d", 0);
                }
                else{
                    form.format("% " + (krat + 1) + "d", array2DInteger[i][k]);
                }
            }
            System.out.println(form.format(""));
            form.close();
        }
        System.out.println();
    }

    public void ShowNewMatrix(){
        System.out.println("New Matrix: ");
        NumberFormat fNumberFormat = NumberFormat.getInstance();
        NumberFormat fNumberFormat2 = NumberFormat.getCompactNumberInstance();
        NumberFormat fNumberFormat3 = NumberFormat.getCurrencyInstance();

        for(int i = 0; i < aIntegers2D.length; i++){
            form = new Formatter();
            for(Integer p: aIntegers2D[i]){
                form.format("% " + (krat + 1) + "d", p);
            }
            System.out.println(form.format(""));
            form.close();
        }
        System.out.println();
        for(int i = 0; i < aIntegers2D.length; i++){
            for(Integer p: aIntegers2D[i]){
                System.out.print(fNumberFormat.format(p) + " ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 0; i < aIntegers2D.length; i++){
            for(Integer p: aIntegers2D[i]){
                System.out.print(fNumberFormat2.format(p) + " ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 0; i < aIntegers2D.length; i++){
            for(Integer p: aIntegers2D[i]){
                System.out.print(fNumberFormat3.format(p) + " ");
            }
            System.out.println();
        }
        System.out.println();
        
    }

    public void FindMaximalElementInMatrixAndDelete(){
        Integer[][] ar = new Integer[array2DInteger.length - 1][array2DInteger.length - 1];
        int ik = 0, ki = 0;

        for(int i = 0; i < array2DInteger.length; i++){
            for(int k = 0; k < array2DInteger.length; k++){
                if(Math.abs(array2DInteger[i][k]) > Math.abs(max)){
                    max = array2DInteger[i][k];
                    MaxStroke = i;
                    MaxS = k;
                }
            }
        }

        for(int i = 0; i < array2DInteger.length; i++){
            if(i == MaxStroke){ 
                continue;
            }
            for(int k = 0; k < array2DInteger.length; k++){
                if(k == MaxS){
                    continue;
                }
                ar[ik][ki] = array2DInteger[i][k];
                ki++;
            }
            ik++;
            ki = 0;
        }
        
        Arrays.sort(ar[array2DInteger.length - 2], new Comparator<Integer>() {
            public int compare(Integer object1, Integer object2){
                Integer a = object1;
                Integer b = object2;
                return a < b ? 1 : a == b ? 0 : -1;
            }
        });

        aIntegers2D = new Integer[N - 1][N - 1];
        aIntegers2D = ar;
    }

    public Integer GetMax(){
        return max;
    }

    int GetMaxStroke(){
        return MaxStroke;
    }

    public int GetLenght(){
        return aIntegers2D.length;
    }

    public Integer[] gIntegers(){
        Arrays.sort(aIntegers2D[aIntegers2D.length - 1]);
        return aIntegers2D[aIntegers2D.length - 1];
    }

}
