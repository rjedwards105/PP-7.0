public class Main
{
    public static void main (String[] args)
    {
        MonetaryCoin[] bank = new MonetaryCoin[5];
        bank[0] = new MonetaryCoin(0.01);
        bank[1] = new MonetaryCoin(0.05);
        bank[2] = new MonetaryCoin(0.10);
        bank[3] = new MonetaryCoin(0.25);
        bank[4] = new MonetaryCoin(0.50);

        double total = 0;
        for (MonetaryCoin coin : bank)
        {
            total += coin.getValue();
        }
        System.out.println("Amount: " + total);
        bank[0].flip();
        System.out.println("Coin:\n" + bank[0].toString());
    }
}
