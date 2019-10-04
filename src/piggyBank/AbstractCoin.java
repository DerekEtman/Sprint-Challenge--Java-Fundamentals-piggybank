package piggyBank;

public abstract class AbstractCoin
{
    // Fields
    String name;
    Double value;
    Integer amount;

    // Constructor
    public AbstractCoin(Integer amount)
    {
        this.amount = amount;
    }

    // abstract method
    public abstract double totalValue(double value, Integer amount);

    // Getter & Setters
    public Double getValue()
    {
        return value;
    }
    
    public Integer amount()
    {
        return amount;
    }




}