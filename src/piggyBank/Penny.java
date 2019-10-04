package piggyBank;

public class Penny extends AbstractCoin
{
    public String  name = "Penny";
    public Double value = 0.01;
    public int amount = 1;

    public Penny(Integer amount)
    {
        super(amount);
        this.amount = amount;
    }

    public int addPenny(Integer i)
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
        {return amount + " " + "Pennies";}
        else{
            return amount + " " + name;
        }
    }
}