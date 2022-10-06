import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Matrix mat = new Matrix(10, 1);

        System.out.println("Old Matrix: ");
        mat.PrintMatrix();
        System.out.println();
        mat.FindMaximalElementInMatrixAndDelete();
        mat.ShowDeletingStrokeAndStolb();
        mat.ShowNewMatrix();
        System.out.println("Maximal element: " + mat.GetMax());
        if(mat.GetLenght() - Arrays.binarySearch(mat.gIntegers(), mat.GetMax()) < mat.GetLenght()){
            System.out.println("True " + "Index: " + (mat.GetLenght() - Arrays.binarySearch(mat.gIntegers(), mat.GetMax())));
        }else{
            System.out.println("False");
        }
    }
}
