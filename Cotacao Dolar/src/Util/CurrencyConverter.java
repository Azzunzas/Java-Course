package Util;

public class CurrencyConverter {


//    declaracao de uma vareavel constante e estatica;
    public static final double iof = 1.06;

    public static double cotacao(double x, double y){
        return x * y * iof;
    }

}
