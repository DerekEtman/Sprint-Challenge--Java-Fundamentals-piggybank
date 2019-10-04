package piggyBank;

public class Dollar extends AbstractCoin
{
    public String  name = "$";
    public Double value = 1.00;
    public int amount = 1;

    public Dollar(Integer amount)
    {
        super(amount);
        this.amount = amount;
    }

    public double totalValue(double value, Integer amount)
    {
        return value * amount;
    }

    @Override
    public String toString()
    {
        return name + amount ;
    }
}