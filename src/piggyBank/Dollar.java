package piggyBank;

public class Dollar extends AbstractCoin
{
    public Dollar(Integer amount)
    {
        super(amount);
        this.amount = amount;
        name = "$";
        value = 1.00;
    }

    @Override
    public String toString()
    {
        return name + amount ;
    }
}