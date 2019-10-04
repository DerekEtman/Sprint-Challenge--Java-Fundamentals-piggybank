package piggyBank;

public abstract class AbstractCoin
{
    // Fields
    String name;
    Double value;
    Integer amount;
    double totalMoney;

    // Constructor
    public AbstractCoin(Integer amount)
    {
        this.amount = amount;
    }

    // Abstrct method
    public abstract double totalValue(Integer amount);

    public double totalPiggyBank(double value)
    {
        return this.totalMoney = this.totalMoney + value;
    }
    // Getter & Setters
    public Double getValue()
    {
        return value;
    }
    public void setValue(Integer amount)
    {
        this.amount = amount;
    }
    
    public Integer getAmount()
    {
        return amount;
    }





}