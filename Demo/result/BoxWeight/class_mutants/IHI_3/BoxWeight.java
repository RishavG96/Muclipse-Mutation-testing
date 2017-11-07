// This is mutant program.
// Author : ysma

public class BoxWeight extends Box
{

    int width;

    int weight;

    int a;

    public java.lang.String display()
    {
        return "testing box1";
    }

    BoxWeight( BoxWeight ob )
    {
        super( ob );
        weight = ob.weight;
        if (b != 0) {
            val_b();
        }
    }

    BoxWeight( int w, int h, int d, int m )
    {
        super( w, h, d );
        weight = m;
        if (b != 0) {
            val_b();
        }
    }

    BoxWeight()
    {
        super();
        weight = -1;
        if (b != 0) {
            val_b();
        }
    }

    BoxWeight( int len, int m )
    {
        super( len );
        weight = m;
        if (b != 0) {
            val_b();
        }
    }

    int volume()
    {
        if (a == 0) {
            a = 4;
        }
        return width * height * depth * weight * b * a;
    }

    void val_b()
    {
        super.val_b();
        b = 10;
    }

}

