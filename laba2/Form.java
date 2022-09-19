import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Formatter;

class Form{

    Formatter form = new Formatter();

    public String Skobki(BigDecimal x){
        return form.format("%(f", x.doubleValue()).toString();
    }

    public String Zapyataya(BigDecimal x){
        return form.format("%,.2f", x.doubleValue()).toString();
    }

    public String Reshetka(BigDecimal x){
        return form.format("%#f", x.doubleValue()).toString() + "$\n" + form.format("%#e", x.doubleValue()).toString();
    }

    public String HEX(BigDecimal x){
        return form.format("%a", x.doubleValue()).toString();
    }

    public String OCTA(BigDecimal x){
        return form.format("%o", x.doubleValue()).toString();
    }

    public String Float(BigDecimal x){
        return form.format("Float formatting - %f", x.doubleValue()).toString();
    }

    public String PositiveAndNegative(BigDecimal x){
        return form.format("%1$+f", x.doubleValue()).toString();
    }

    public String SetPrecition(BigDecimal x, int k){
        return form.format("%." + k + "f", x.doubleValue()).toString();
    }

    public String PorArgument(BigDecimal x){
        return form.format("", x.toBigInteger(), x.subtract(new BigDecimal(x.toBigInteger()))).toString();
    }

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
        String str = "0x";

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
        }

        return str;
    }


    public void MinWidht(BigDecimal x){

    }
}