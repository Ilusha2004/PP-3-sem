package com.matrix.Main;

import com.matrix.Matrix.Matrix;

public class Main {
    public static void main(String[] args) {
       
        Matrix mat = new Matrix(4, 1);

        mat.FindMaximalElementInMatrixAndDelete();
        System.out.println(mat.GetMax());

        System.out.println("Old Matrix: ");
        mat.PrintMatrix();
        System.out.println();
        mat.FindMaximalElementInMatrixAndDelete();
        mat.ShowDeletingStrokeAndStolb();
        mat.ShowNewMatrix();
        System.out.println("Maximal element: " + mat.GetMax());
        if(mat.FindElem()){
            System.out.println("True ");
        }else{
            System.out.println("False");
        }
        mat.FindElem();
    }
}
