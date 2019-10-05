package piggyBank;

public class Quarter extends AbstractCoin
{    
    public Quarter(Integer amount)
    {
        super(amount);
        name = "Quarter";
        value = 0.25;
    }

    // public Quarter()
    // {
    //     super();
    // }

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