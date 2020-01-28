import java.text.DecimalFormat;
public class CoinDriver
{
    public static void main(String[] args)
    {
        double sum;
        DecimalFormat fmt = new DecimalFormat("0.##");

        MonetaryCoin penny = new MonetaryCoin(0.01);
        MonetaryCoin nickel = new MonetaryCoin(0.05);
        MonetaryCoin dime = new MonetaryCoin(0.10);
        MonetaryCoin quarter = new MonetaryCoin(0.25);

        sum = penny.getValue() + nickel.getValue()
                + dime.getValue() + quarter.getValue();

        System.out.println("Total Value: "+fmt.format(sum)+" dollars.");

        System.out.println("\nPenny: "+penny);
        System.out.println("\nNickel: "+nickel);
        System.out.println("\nDime: "+dime);
        System.out.println("\nQuarter: "+quarter);


    }//end main method
}//end driver
