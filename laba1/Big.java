import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

class Big {

    public BigDecimal x;
    public BigDecimal eps;
    public BigInteger k;

    Big(double x, int k){
        this.x = BigDecimal.valueOf(x);
        this.k = BigInteger.valueOf(k);
        this.eps = BigDecimal.valueOf(Math.pow(10.0, -(k)));
    }
    
    public BigDecimal TaylorN1(double x, int k){

        BigDecimal temp_0 = BigDecimal.ONE;
        BigDecimal temp_1 = BigDecimal.ONE;
        BigInteger d = BigInteger.ONE;
        BigDecimal test_Decimal = BigDecimal.ONE;
        BigDecimal e = this.eps.setScale(k + 2, RoundingMode.HALF_DOWN);
        BigDecimal test_value = new BigDecimal((Math.sqrt(1 + x))).setScale(k + 3, RoundingMode.HALF_DOWN);
        test_Decimal = test_Decimal.divide(test_value, k, RoundingMode.HALF_UP).setScale(k + 2, RoundingMode.HALF_DOWN);
        long i = 1;

        while((temp_1.subtract(test_Decimal)).abs().compareTo(e) == 1){ //пока разность больше е
            
             //double temp_3 = (double)d / (double)(d + 1);
            BigDecimal temp_3 = new BigDecimal(d);
            temp_3 = temp_3.divide(new BigDecimal(d.add(BigInteger.ONE)), k + 3, RoundingMode.HALF_DOWN);

            // temp_0 *= temp_3;
            // temp_0 *= x;

            temp_0 = temp_0.multiply(temp_3);
            temp_0 = temp_0.multiply(BigDecimal.valueOf(x)).setScale(k + 3, RoundingMode.HALF_DOWN);

            if(i % 2 == 1){
                 // temp_1 -= temp_0;
                temp_1 = temp_1.subtract(temp_0);
            }
            else{
                // temp_1 += temp_0;
                temp_1 = temp_1.add(temp_0);
            }  
            i++;
            //d+=2;
            d = d.add(BigInteger.TWO);
            
        }
        
        return temp_1.setScale(k, RoundingMode.HALF_DOWN);
    }

}

