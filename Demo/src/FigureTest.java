import junit.framework.TestCase;
public class FigureTest extends TestCase{
	Figure f;
	public void setUp() throws Exception {
		f = new Figure();
	}
	public void testSetBox() {
		assertEquals(6, f.area(2,3));
	}
	public void testSetBox0() {
		assertEquals(0, f.area());
	}
	public void testSetBox1() {
		Figure f1=new Figure(2,3);
		assertEquals(0, f1.area());
	}
	public void testSetBox2() {
		Figure f2=new Rectangle(3, 5);
		assertEquals(15, f2.area());
	}
	public void testSetBox3() {
		Figure f3=new Triangle(2,3);
		assertEquals(3, f3.area());
	}
	public void testSetBox4() {
		Figure f3=new Triangle(3,5);
		assertEquals(7, f3.area());
	}
	public void testSetBox5() {
		Figure f2=new Rectangle(3,5);
		assertEquals(15, f2.area(3,5));
	}
}
