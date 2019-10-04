package piggyBank;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main
{
    DecimalFormat fp = new DecimalFormat("$###,###.00");
    public static void main(String[] args) 
    {
        // CoinFromAbstract dollar = new CoinFromAbstract("Dollar", 1.00, 1);
        // CoinFromAbstract quarter = new CoinFromAbstract("Quarter", 0.25, 1);
        // CoinFromAbstract dime = new CoinFromAbstract("Dime", .10, 1);
        // CoinFromAbstract penny = new CoinFromAbstract("Penny", 0.01, 1);

        ArrayList<AbstractCoin> piggyBank = new ArrayList<AbstractCoin>();
        piggyBank.add(new Quarter(2));
        piggyBank.add(new Dime(20));
        piggyBank.add(new Dollar(3));
        piggyBank.add(new Penny(2));
        // piggyBank.add();


        System.out.println(piggyBank.toString());
        System.out.println();

    }
}