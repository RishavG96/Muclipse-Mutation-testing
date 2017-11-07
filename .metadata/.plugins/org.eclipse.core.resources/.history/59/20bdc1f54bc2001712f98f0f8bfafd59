package testing;
import static org.junit.Assert.*;
import org.junit.Test;

public class inheritTest {
	@Test
	public void calculate_val_rev()
	{
		assertTrue(inheritpoly.inherit_calc(20,5));
	}
	@Test
	public void calculate_val_add_const()
	{
		assertTrue(inheritpoly.inherit_calc(20,10));
	}
	@Test
	public void calculate_val()
	{
		assertFalse(inheritpoly.inherit_calc(5,20));
	}
	@Test
	public void calculate_val_zero()
	{
		assertFalse(inheritpoly.inherit_calc(0,10));
	}
	
	@Test
	public void calculate_val_neg()
	{
		assertFalse(inheritpoly.inherit_calc(-5,20));
	}
	@Test
	public void calculate_val_eq()
	{
		assertTrue(inheritpoly.inherit_calc(20,20));
	}
	@Test
	public void calculate_val_neg_eq()
	{
		assertFalse(inheritpoly.inherit_calc(-10,-10));
	}
	@Test
	public void calculate_val_neg_neq()
	{
		assertFalse(inheritpoly.inherit_calc(-10,-5));
	}
}
