public class Main {
    public static void main(String[] args) {
        Matrix mat = new Matrix(3);

        mat.PrintMatrix();
        mat.FindMaximalElementInMatrixAndDelete();
        System.out.println();
        mat.PrintMatrix();
    }
}
