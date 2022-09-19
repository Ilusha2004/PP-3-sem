import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.SocketTimeoutException;
import java.util.Formatter;

// 2. Выводить положительные и отрицательные значения с плавающей точкой
// 3. Использовать спецификатор минимальной ширины поля
// 5. Использовать флаги (flags) форматирования: 0,+)#
// 6. Использование порядкового номера аргумента

public class Main {
    public static void main(String[] args) throws Exception {


        Form f = new Form();

        // Scanner scanner = new Scanner(System.in);
        // Formatter form = new Formatter();

        // System.out.println("Input x, where  -1 < x < 1, and k > 0");
        // double x = scanner.nextDouble();
        // int k = scanner.nextInt();

        // if(x < -1 && x > 1){
        //     System.out.println("Incorrect input!");
        // }

        // // Row obj = new Row(x, k);
        // // System.out.println(BigDecimal.valueOf(obj.TaylorN10()).setScale(k, RoundingMode.HALF_DOWN));

        // Big oBig = new Big(x, k);
        // // System.out.println(oBig.TaylorN1(x, k));
        // // System.out.println(oBig.EightDigits(oBig.TaylorN1(x, k), 7));
        // //System.out.println(oBig.SixteenDigits(oBig.TaylorN1(x, k), k));
        
        // System.out.println(String.format("Float formatting - %f", oBig.TaylorN1(x, k)));

        double i = 4.3423;

        BigDecimal d = new BigDecimal("441243");
  
        // System.out.println(String.format("%#f", d.doubleValue()));
        // System.out.println(String.format("%#e", d.doubleValue()));
        // System.out.println(String.format("%#x", (int)d.doubleValue()));
        // System.out.println(String.format("%#f", d.doubleValue()));

        // System.out.println(String.format("%1$+f", 1.23523523));
        // // System.out.println(String.format("%1$20.10f", 1.23523523));
        // System.out.println(String.format("%a", d.doubleValue()));
        // System.out.println(String.format("%." + 3 + "f", d.doubleValue()));
        // //System.out.println(oBig.TaylorN1(x, k));
        // System.out.println(f.SixteenDigits(d, 10));

        // System.out.println(f.HEX(d));
        // System.out.println(f.PorArgument(d));
        // System.out.println(f.Float(d));
        //System.out.println(f.PositiveAndNegative(d));
        //System.out.println(f.OCTA(d));
        //System.out.println(f.SetPrecition(d, 10));
        //System.out.println(f.Skobki(d));
        System.out.println(f.Reshetka(d));
       
        // System.out.println(f.Zapyataya(d));

        
        //scanner.close();
    }
}