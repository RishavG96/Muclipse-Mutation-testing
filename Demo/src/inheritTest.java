//import static org.junit.Assert.*;
//import org.junit.Test;

import junit.framework.TestCase;
public class inheritTest extends TestCase {
	inheritpoly ip;
	
	public void setUp() throws Exception {
		ip = new inheritpoly();
	}
	
	//@Test
	public void calculate_val_rev()
	{
		assertTrue(ip.inherit_calc(20,5));
	}
	//@Test
	public void calculate_val_add_const()
	{
		assertTrue(ip.inherit_calc(20,10));
	}
	//@Test
	public void calculate_val()
	{
		assertFalse(ip.inherit_calc(5,20));
	}
	//@Test
	public void calculate_val_zero()
	{
		assertFalse(ip.inherit_calc(0,10));
	}
	
	//@Test
	public void calculate_val_neg()
	{
		assertFalse(ip.inherit_calc(-5,20));
	}
	//@Test
	public void calculate_val_eq()
	{
		assertTrue(ip.inherit_calc(20,20));
	}
	//@Test
	public void calculate_val_neg_eq()
	{
		assertFalse(ip.inherit_calc(-10,-10));
	}
	//@Test
	public void calculate_val_neg_neq()
	{
		assertFalse(ip.inherit_calc(-10,-5));
	}
}
