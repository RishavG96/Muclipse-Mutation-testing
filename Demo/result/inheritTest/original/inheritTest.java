// This is mutant program.
// Author : ysma

import junit.framework.TestCase;


public class inheritTest extends junit.framework.TestCase
{

    inheritpoly ip;

    public void setUp()
        throws java.lang.Exception
    {
        ip = new inheritpoly();
    }

    public void calculate_val_rev()
    {
        assertTrue( ip.inherit_calc( 20, 5 ) );
    }

    public void calculate_val_add_const()
    {
        assertTrue( ip.inherit_calc( 20, 10 ) );
    }

    public void calculate_val()
    {
        assertFalse( ip.inherit_calc( 5, 20 ) );
    }

    public void calculate_val_zero()
    {
        assertFalse( ip.inherit_calc( 0, 10 ) );
    }

    public void calculate_val_neg()
    {
        assertFalse( ip.inherit_calc( -5, 20 ) );
    }

    public void calculate_val_eq()
    {
        assertTrue( ip.inherit_calc( 20, 20 ) );
    }

    public void calculate_val_neg_eq()
    {
        assertFalse( ip.inherit_calc( -10, -10 ) );
    }

    public void calculate_val_neg_neq()
    {
        assertFalse( ip.inherit_calc( -10, -5 ) );
    }

}
