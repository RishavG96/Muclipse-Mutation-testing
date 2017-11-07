// This is mutant program.
// Author : ysma

class Box
{

    static int a;

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
        a = ob.width;
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box( int width, int height, int depth )
    {
        a = width;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box()
    {
        a = -1;
        width = -1;
        height = -1;
        depth = -1;
    }

    Box( int len )
    {
        width = height = a = depth = len;
    }

    int volume()
    {
        val_b();
        return width * height * depth;
    }

    void val_b()
    {
        b = 5;
    }

}

class BoxWeight extends Box
{

    int weight;

    int a;

    public java.lang.String display()
    {
        return super.display();
    }

    BoxWeight( BoxWeight ob )
    {
        super( ob );
        a = 10;
        weight = ob.weight;
        val_b();
    }

    BoxWeight( int w, int h, int d, int m )
    {
        // super( w, h, d );

        a = 10;
        weight = m;
        val_b();
    }

    BoxWeight()
    {
        super();
        a = 10;
        weight = -1;
        val_b();
    }

    BoxWeight( int len, int m )
    {
        super( len );
        a = 10;
        weight = m;
        val_b();
    }

    int volume()
    {
        return width * height * depth * weight * b;
    }

    void val_b()
    {
        b = 10;
        super.val_b();
    }

}
