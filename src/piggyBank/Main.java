package piggyBank;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main
{
    
    public static ArrayList<AbstractCoin> filteredList = new ArrayList<AbstractCoin>();
    
    public static void printCoin(ArrayList<AbstractCoin> coin, CheckCoin tester)
    {
        DecimalFormat fp = new DecimalFormat("$###,###.00");

        for (AbstractCoin c : coin)
        {
            System.out.println("The piggy bank holds " + fp.format(c.totalMoney()));
        }
    }
    public static void main(String[] args) 
    {
        // CoinFromAbstract dollar = new CoinFromAbstract("Dollar", 1.00, 1);
        // CoinFromAbstract quarter = new CoinFromAbstract("Quarter", 0.25, 1);
        // CoinFromAbstract dime = new CoinFromAbstract("Dime", .10, 1);
        // CoinFromAbstract penny = new CoinFromAbstract("Penny", 0.01, 1);

        ArrayList<AbstractCoin> piggyBank = new ArrayList<AbstractCoin>();
        piggyBank.add(new Quarter(2));
        piggyBank.add(new Dime(1));
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar(1));
        piggyBank.add(new Penny(10));

        // Printing amount of each coin
        System.out.println(piggyBank.toString());

        // Total amount
        piggyBank.forEach((c) -> System.out.println(c.totalValue(c.amount)));
        printCoin(piggyBank, b -> (totalPiggyBank(b)));

    }
}