// This is mutant program.
// Author : ysma

public class BoxWeight extends Box
{

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
        // super( len );

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

class Box
{

    public int a;

    public int b;

    int width;

    int height;

    int depth;

    public java.lang.String display()
    {
        return "testing box";
    }

    Box( Box ob )
    {
        a = 1;
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
        val_b();
    }

    Box( int width, int height, int depth )
    {
        a = 1;
        this.width = width;
        this.height = height;
        this.depth = depth;
        val_b();
    }

    Box()
    {
        a = 1;
        width = -1;
        height = -1;
        depth = -1;
        val_b();
    }

    Box( int len )
    {
        a = 1;
        width = height = depth = len;
        val_b();
    }

    int volume()
    {
        val_b();
        return width * height * depth * a;
    }

    void val_b()
    {
        b = 5;
    }

}
