package piggyBank;

public class Quarter extends AbstractCoin
{
    public String  name = "Quarter";
    public Double value = 0.25;
    public int amount = 1;

    public Quarter(Integer amount)
    {
        super(amount);
    }

    public int addQuarter(Integer i)
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