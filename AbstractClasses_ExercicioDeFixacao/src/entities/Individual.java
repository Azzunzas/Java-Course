package entities;

public class Individual extends Payer{

    private Double HealthExpenditures;

    public Individual(String name, Double anualIncome) {
        super(name, anualIncome);
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        HealthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return HealthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        HealthExpenditures = healthExpenditures;
    }

    @Override
    public double tax(){
        if (getAnualIncome() <= 20000.00){
            double tax = (getAnualIncome() * 0.15) - (getHealthExpenditures() * 0.5);
            return tax;
        }else {
            double tax = (getAnualIncome() * 0.25) - (getHealthExpenditures() * 0.5);
            return tax;
        }
    }
}
