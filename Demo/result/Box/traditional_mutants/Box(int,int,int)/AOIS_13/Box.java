// This is mutant program.
// Author : ysma

class Box
{

    private static int width;

    private static int height;

    private static int depth;

    Box( Box ob )
    {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box( int weight, int height, int depth )
    {
        this.width = ++weight;
        this.height = height;
        this.depth = depth;
    }

    Box()
    {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box( int len )
    {
        width = height = depth = len;
    }

    int volume()
    {
        return width * height * depth;
    }

}

class BoxWeight extends Box
{

    static int weight;

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

}
