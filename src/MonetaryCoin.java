public class MonetaryCoin extends Coin
{
    double value;

    public MonetaryCoin(double value)
    {
        super();
        this.value = value;
    }//end constr w/ call to super

    public double getValue()
    {
        return value;
    }//end getValue

    public String toString()
    {
        String output = super.toString();
        output += "\nValue: "+value+" dollars";
        return output;
    }//end to string oveerride w/ call to super
}//end Monetary Coin class
