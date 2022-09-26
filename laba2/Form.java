import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Formatter;

class Form{

    Formatter form;

    public String Skobki(BigDecimal x){
        form = new Formatter();
        return "Negative formatting: " + form.format("%(f", x.doubleValue()).toString();
    }

    public String Zapyataya(BigDecimal x){
        form = new Formatter();
        return "Point formatting: " + form.format("%,.2f", x.doubleValue()).toString();
    }

    public String Reshetka(BigDecimal x, int k){
        form = new Formatter();
        Formatter formatter = new Formatter();
        Formatter hexformatter = new Formatter();
        Formatter form_1 = new Formatter();
        return "Using #: (" + form.format("%#f", x.doubleValue()).toString() + "\n" + formatter.format("%#e", x.doubleValue()).toString()
         + "\n" + hexformatter.format("%#a", x.setScale(k, RoundingMode.HALF_DOWN).doubleValue()).toString() + ")";
    }

    public String HEX(BigDecimal x){
        form = new Formatter();
        return "HEX formatting: " + form.format("%a", x.doubleValue()).toString();
    }

    public String OCTA(BigDecimal x, int k){
        form = new Formatter();
        Formatter form_1 = new Formatter();
        return "OCTA formatting: " + form.format("%o", (int)x.doubleValue()).toString() + "." + form_1.format("%o", (int)(x.subtract(new BigDecimal(x.toBigInteger())).doubleValue() * Math.pow(10, k - 1))).toString();
    }

    public String Float(BigDecimal x){
        form = new Formatter();
        return form.format("Float formatting: %f", x.doubleValue()).toString();
    }

    public String PositiveAndNegative(BigDecimal x){
        form = new Formatter();
        return "+ and - formatting: " + form.format("%1$+f and %2$+f", x.doubleValue(), -x.doubleValue()).toString();
    }

    public String SetPrecition(BigDecimal x, int k){
        form = new Formatter();
        return "Precition formatting: " + form.format("%." + k + "f", x.doubleValue()).toString();
    }

    public String PorArgument(BigDecimal x){
        form = new Formatter();
        return "Position number argument formatting: " + form.format("First argument: %1$f and second: %2$f", x.toBigInteger().doubleValue(), x.subtract(new BigDecimal(x.toBigInteger())).doubleValue()).toString();
    }

    public String MinWidht(BigDecimal x){
        form = new Formatter();
        return "Widht formatting: " + form.format("%020f", x.doubleValue()).toString();
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
}