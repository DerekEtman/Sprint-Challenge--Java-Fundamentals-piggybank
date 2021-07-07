package piggyBank;

public class Nickel extends AbstractCoin
{

    public Nickel(Integer amount)
    {
        super(amount);
        name = "Nickel";
        value = 0.05;
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