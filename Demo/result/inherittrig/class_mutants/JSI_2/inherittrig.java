// This is mutant program.
// Author : ysma

class triangle
{

    private final int scalene = 1;

    private static final int isosceles = 2;

    private final int equilateral = 3;

    public boolean valid( int side1, int side2, int side3 )
    {
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            return true;
        } else {
            return false;
        }
    }

    public int triangle_form( int side1, int side2, int side3 )
    {
        int type;
        if (side1 == side2 && side2 == side3) {
            type = equilateral;
        } else {
            if (side1 == side2 || side2 == side3 || side3 == side1) {
                type = isosceles;
            } else {
                type = scalene;
            }
        }
        return type;
    }

}

class inherittrig extends triangle
{

    public static int calc( int s1, int s2, int s3 )
    {
        inherittrig t = new inherittrig();
        boolean temp = false;
        int temp3 = 0;
        temp = t.valid( s1, s2, s3 );
        if (temp == true) {
            temp3 = t.triangle_form( s1, s2, s3 );
        }
        return temp3;
    }

}
