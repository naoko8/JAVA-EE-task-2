package ge.btu.nino.potskhishvili;

public class CurrencyMain {
    String currencyType;
    double buy;
    double sell;

    public CurrencyMain(){

    }

    public CurrencyMain(String currencyType, double buy, double sell) {
        this.currencyType = currencyType;
        this.buy = buy;
        this.sell = sell;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public double getBuy() {
        return buy;
    }

    public double getSell() {
        return sell;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    public void setBuy(double buy) {
        this.buy = buy;
    }

    public void setSell(double sell) {
        this.sell = sell;
    }

    @Override
    public String toString() {
        return "CurrencyMain{" +
                "currencyType='" + currencyType + '\'' +
                ", buy=" + buy +
                ", sell=" + sell +
                '}';
    }
}
