import java.util.Random;
public class Coin
{
    private final int HEADS = 0;
    private final int TAILS = 1;

    private int face;

    //flips coin initialy
    public Coin()
    {
        flip();
    }//end constr
    //randomly filp coin
    public void flip()
    {
        face = (int)(Math.random()*2);
    }//end flip
    //ruturns true if is heads
    public boolean isHEads()
    {
        return (face == HEADS);
    }// end is heads

    public String toString()
    {
        String faceName;

        if(face == HEADS)
            faceName = "Heads";
        else
            faceName = "Tails";
        return faceName;
    }//end toString
}//end class coin
