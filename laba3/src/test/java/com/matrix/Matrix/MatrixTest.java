package com.matrix.Matrix;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MatrixTest {

    private Matrix matrix;
    private Integer[][] matr;

    @BeforeEach
    public void setUp() {
        Integer counter = 0;
        matr = new Integer[5][5];
        try(BufferedReader buffer = new BufferedReader(new FileReader("src/test/java/com/matrix/Matrix/res/input.txt"))) {
            while(buffer.ready()) {
                Integer[] temp = new Integer[5];
                String[] str = buffer.readLine().split(" ");

                for(int i = 0; i < 5; i++) {
                    temp[i] = Integer.valueOf(str[i]);
                    System.out.println(temp[i]);
                }
                
                matr[counter] = temp;
                counter++;

            }
        } catch (Exception e) {
            e.getStackTrace();
        }

        matrix = new Matrix(matr);
        matrix.FindMaximalElementInMatrixAndDelete();
    }
    
    @Test
    public void testFindMaximalElementInMatrixAndDelete() {
        assertEquals(matrix.GetMaxStroke(), 2);
        assertEquals(matrix.GetMaxS(), 3);
        assertEquals(matrix.GetMax(), 9);
    }

    @Test
    void testGetLenght() {
        assertEquals(matrix.GetLenght(), 4);
    }

    @Test
    void testPrintMatrix() {
        StringBuffer buffer = new StringBuffer();
        for(int i = 0; i < 4; i++) {
            for(Integer p: matrix.getaIntegers2D()[i]){
            buffer.append(p);
            }
        }
        String str = "2-34-242312-42-1651-7";
        assertEquals(buffer.toString(), str);
    }

    @Test
    void testShowDeletingStrokeAndStolb() {
        StringBuffer buffer = new StringBuffer();
        matrix.ShowDeletingStrokeAndStolb();
        for(int i = 0; i < matrix.getArray2DInteger().length; i++){

            for(int k = 0; k < matrix.getArray2DInteger().length; k++){
                if(k == matrix.GetMaxS() || i == matrix.GetMaxStroke()){
                    buffer.append(0);
                }
                else{
                    buffer.append(matrix.getArray2DInteger()[i][k]);
                }
            }
        }

        assertEquals(buffer.toString(), "2-340-242301000002-420-16510-7");
    }

    @Test
    void testFindElem() {
        assertEquals(Arrays.binarySearch(matrix.gIntegers(), matrix.GetMax()) >= 0, false);
    }


}
