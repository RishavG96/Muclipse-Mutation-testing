// This is mutant program.
// Author : ysma

public class inheritpoly extends Calculation
{

    private static boolean temp;

    private boolean temp2;

    inheritpoly()
    {
        super();
        this.temp = false;
        this.temp2 = false;
    }

    public boolean inherit_calc( int a, int b )
    {
        Calculation demo = new inheritpoly();
        temp = demo.div( a, b );
        if (temp == true) {
            temp = demo.Pow( a, b );
            temp2 = true;
        }
        if (temp2 == true && temp == true) {
            temp = true;
        } else {
            temp = false;
        }
        return temp;
    }

}

class Calculation
{

    private int z;

    Calculation()
    {
        this.z = 0;
    }

    public boolean div( int x, int y )
    {
        this.z = x / y;
        if (this.z > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean Pow( int x, int y )
    {
        this.z = x + y;
        if (this.z == Math.abs( x ) + Math.abs( y )) {
            return true;
        } else {
            return false;
        }
    }

}
