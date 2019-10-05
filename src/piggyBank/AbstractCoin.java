package piggyBank;

public abstract class AbstractCoin
{
    // Fields
    String name;
    Double value;
    Integer amount = 1;
    Double grossValue = 0.0;

    // Constructor
    public AbstractCoin(Integer amount)
    {
        this.amount = amount;
    }
    // Getter & Setters
    
    public Double getValue()
    {
        return value;
    }
    public void SetValue(double value)
    {
        this.value = value;
    }
    
    public Integer getAmount()
    {
        return amount;
    }
    public void setAmount(Integer amount)
    {
        this.amount = amount;
    }
    
    public double totalValue()
    {
        return value * amount;
    }    
}