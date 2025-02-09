public class CurrencyConverter {
    public static final double IOF = 0.06;

    //Valor em reais com IOF
    public static double convert(double dollarRate, double amount) {
        return amount * dollarRate * (1 + IOF);
    }
}