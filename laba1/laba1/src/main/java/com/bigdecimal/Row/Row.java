package com.bigdecimal.Row;

public class Row {

    private double x;
    private double eps;
    private int k;

    public Row(double x, int k){
        this.x = x; this.k = k;
        this.eps = Math.pow(10.0, -k);
    }

    public double TaylorN10(){

        double temp_0 = 1, temp_1 = 1;
        double test_value = 1.0 / Math.sqrt(1 + this.x); // 1 / sqrt(1 + x)
        int d = 1, i = 1; 

            //пока разность больше заданной точности

        while(Math.abs(temp_1 - test_value) > this.eps){ 
            double temp_3 = (double)d / (double)(d + 1); //(a/b)*x^n
            temp_0 *= temp_3;
            temp_0 *= this.x;

            if(i % 2 == 1){
                temp_1 -= temp_0;              
            }
            else{
                temp_1 += temp_0;
            }  

            i++;
            d+=2;
        }

        return temp_1;
    }

    public double getX() {
        return x;
    }

    public double getEps() {
        return eps;
    }

    public int getK() {
        return k;
    }
}