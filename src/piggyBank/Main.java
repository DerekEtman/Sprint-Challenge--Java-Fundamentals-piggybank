package piggyBank;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main
{
    
    
    public static void main(String[] args) 
    {
        DecimalFormat fp = new DecimalFormat("$###,###.00");
        // CoinFromAbstract dollar = new CoinFromAbstract("Dollar", 1.00, 1);
        // CoinFromAbstract quarter = new CoinFromAbstract("Quarter", 0.25, 1);
        // CoinFromAbstract dime = new CoinFromAbstract("Dime", .10, 1);
        // CoinFromAbstract penny = new CoinFromAbstract("Penny", 0.01, 1);
        // Quarter quarter = new Quarter(1);

        ArrayList<AbstractCoin> piggyBank = new ArrayList<AbstractCoin>();
        piggyBank.add(new Quarter(1));
        piggyBank.add(new Dime(1));
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar(1));
        piggyBank.add(new Penny(10));

        // Printing amount of each coin
        System.out.println(piggyBank.toString());

        // Total amount
        System.out.println("**** Amount of Coins ****");
        piggyBank.forEach((b) -> System.out.println( b.amount));
        System.out.println();

        System.out.println("\n**** Value of Coins ****");
        piggyBank.forEach((b) -> System.out.println(b.totalValue()));
        piggyBank.forEach((b) -> b.SetValue(b.value));
        System.out.println();

        System.out.println("**** Total Value ****");
        // piggyBank.foreach((b) -> b.setGrossValue());

        double totalTest = 0;

        for(AbstractCoin p : piggyBank)
        {
            totalTest += p.getValue();
        }

        System.out.println("The piggy bank holds " + fp.format(totalTest));

    }
}