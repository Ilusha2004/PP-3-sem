import java.math.BigDecimal;
import java.math.BigInteger;

class Formatter{

    public String EightDigits(BigDecimal x, int k){
        String str = "";

        BigInteger mantiss = x.toBigInteger();
        BigDecimal pz = x.subtract(new BigDecimal(mantiss));

        str += mantiss.toString();
        str += ".";

        for(int i = 0; i < k; i++){
            pz = pz.multiply(BigDecimal.valueOf(8));
            BigInteger digit = pz.toBigInteger();
            pz = pz.subtract(new BigDecimal(digit));
            str += digit.toString();
        }

        return str;
    }

    public String SixteenDigits(BigDecimal x, int k){
        String str = "";

        BigInteger mantiss = x.toBigInteger();
        BigDecimal pz = x.subtract(new BigDecimal(mantiss));

        str += mantiss.toString();
        str += ".";

        for(int i = 0; i < k; i++){
            pz = pz.multiply(BigDecimal.valueOf(16));
            BigInteger digit = pz.toBigInteger();
            pz = pz.subtract(new BigDecimal(digit));
            if(digit.compareTo(BigInteger.valueOf(10)) == 0){
                str += "A";
            }else if(digit.compareTo(BigInteger.valueOf(11)) == 0){
                str += "B";
            }else if(digit.compareTo(BigInteger.valueOf(12)) == 0){
                str += "C";
            }else if(digit.compareTo(BigInteger.valueOf(13)) == 0){
                str += "D";
            }else if(digit.compareTo(BigInteger.valueOf(14)) == 0){
                str += "E";
            }else if(digit.compareTo(BigInteger.valueOf(15)) == 0){
                str += "F";
            }else{
                str += digit.toString();
            }
            System.out.println(digit);
        }

        return str;
    }

    
}