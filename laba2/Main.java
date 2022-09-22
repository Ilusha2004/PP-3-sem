import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {


        Form formatter = new Form();

        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Input x, where  -1 < x < 1, and k > 0");
        double x = scanner.nextDouble();
        int k = scanner.nextInt();

        if(x < -1 && x > 1){
            System.out.println("Incorrect input!");
        }

        Row obj = new Row(x, k);
        //System.out.println(BigDecimal.valueOf(obj.TaylorN10()).setScale(k, RoundingMode.HALF_DOWN));

        Big oBig = new Big(x, k);
        System.out.println(oBig.TaylorN1(x, k));
        
        // System.out.println(formatter.EightDigits(oBig.TaylorN1(x, k), k));
        // System.out.println(formatter.Float(oBig.TaylorN1(x, k)));
        // System.out.println(formatter.HEX(oBig.TaylorN1(x, k)));
        // System.out.println(formatter.MinWidht(oBig.TaylorN1(x, k)));
        // System.out.println(formatter.OCTA(oBig.TaylorN1(x, k), k));
        // System.out.println(formatter.EightDigits(oBig.TaylorN1(x, k), k));
        System.out.println(formatter.PorArgument(oBig.TaylorN1(x, k)));
        // System.out.println(formatter.PositiveAndNegative(oBig.TaylorN1(x, k)));
        // System.out.println(formatter.Reshetka(oBig.TaylorN1(x, k)));
        // System.out.println(formatter.SetPrecition(oBig.TaylorN1(x, k), k));
        // System.out.println(formatter.SixteenDigits(oBig.TaylorN1(x, k), k));
        // System.out.println(formatter.Skobki(oBig.TaylorN1(x, k)));
        // System.out.println(formatter.Zapyataya(oBig.TaylorN1(x, k)));

        scanner.close();
    }
}