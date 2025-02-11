// This is Program To implement the Cloneable Interface
import java.lang.Cloneable;


class abc implements Cloneable
// Here The abc is a class constructor
{
    int x;
    String y;
    // Here The abc is a class constructor
    public abc(int x,String y)
    {
        this.x = x;
        this.y = y;
    }

    protected Object clone()
            throws CloneNotSupportedException

    {
        return super.clone();
    }
}

public class MarkerInterface
{
    public static void main(String[] args)
            throws CloneNotSupportedException
    {

        abc p = new abc(10, "We Are Reading GFG Now");
        abc q = (abc)p.clone();

        System.out.println(q.x);
        System.out.println(q.y);

    }
}
