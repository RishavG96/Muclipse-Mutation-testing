// This is mutant program.
// Author : ysma

public class BoxWeight extends Box
{

    int height;

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
    }

    BoxWeight( int w, int h, int d, int m )
    {
        super( w, h, d );
        weight = m;
    }

    BoxWeight()
    {
        super();
        weight = -1;
    }

    BoxWeight( int len, int m )
    {
        super( len );
        weight = m;
    }

    int volume()
    {
        if (a == 0) {
            a = 4;
        }
        val_b();
        int res = width * height * depth * weight * super.b * a;
        return res;
    }

    void val_b()
    {
        super.val_b();
        b = 10;
    }

}

