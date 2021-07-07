package piggyBank;

public class Dime extends AbstractCoin
{

    public Dime(Integer amount)
    {
        super(amount);
        name = "Dime";
        value = 0.10;
    }

    public int add(Integer i)
    {
        return amount = amount + i;
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