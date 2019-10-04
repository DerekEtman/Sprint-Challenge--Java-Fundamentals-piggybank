package piggyBank;

public class Nickel extends AbstractCoin
{
    public String  name = "Nickel";
    public Double value = 0.05;
    public int amount = 1;

    public Nickel(Integer amount)
    {
        super(amount);
        this.amount = amount;
    }

    public int addNickel(Integer i)
    {
        return amount = amount + i;
    }
    public double totalValue( Integer amount)
    {
        return this.value * amount;
    }

    @Override
    public String toString()
    {
        if(amount > 1)
        {return amount + " " + "Quarters";}
        else{
            return amount + " " + name;
        }
    }
}