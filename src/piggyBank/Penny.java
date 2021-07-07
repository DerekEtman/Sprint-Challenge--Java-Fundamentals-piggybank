package piggyBank;

public class Penny extends AbstractCoin
{
    public Penny(Integer amount)
    {
        super(amount);
        name = "Penny";
        value = 0.01;
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