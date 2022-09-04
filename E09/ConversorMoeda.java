package E09;

public class ConversorMoeda {
    
    private double cotacaoD;
    private double dolar;
    
    public ConversorMoeda() {
    }

    public ConversorMoeda(double cotacaoD, double dolar) {
        this.cotacaoD = cotacaoD;
        this.dolar = dolar;
    }

    public static double pagar(double cotacaoD, double dolar){
        double pagar = ((cotacaoD * dolar) * 0.06f) + (cotacaoD * dolar);
        return pagar;
    }

    public double getCotacaoD() {
        return cotacaoD;
    }

    public void setCotacaoD(double cotacaoD) {
        this.cotacaoD = cotacaoD;
    }

    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    

    
}
