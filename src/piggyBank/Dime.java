package piggyBank;

public class Dime extends AbstractCoin
{
    public String  name = "Dime";
    public Double value = 0.10;
    public int amount = 1;

    public Dime(Integer amount)
    {
        super(amount);
        this.amount = amount;
    }

    public int add(Integer i)
    {
        return amount = amount + i;
    }
    public double totalValue(Integer amount)
    {
        return this.value * amount;
    }

    @Override
    public String toString()
    {
        if(amount > 1)
        {return amount + " " + "Dimes";}
        else{
            return amount + " " + name;
        }
    }
}