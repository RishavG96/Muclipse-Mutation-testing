import junit.framework.TestCase;
public class BoxTest extends TestCase{
	Box b;
	public void setUp() throws Exception {
		b = new Box();
	}
	public void testSetBox0() {
		assertEquals(-1, b.volume());
	}
	public void testSetBox() {
		Box b1=new Box(2);
		assertEquals(8, b1.volume());
	}
	public void testSetBox1() {
		Box b2=new Box(2,3,4);
		assertEquals(24, b2.volume());
	}
	public void testSetBox2() {
		Box b3=new Box(2);
		assertEquals(8, b3.volume());
	}
	public void testSetBox3() {
		Box b4=new BoxWeight();
		assertEquals(-1, b4.volume());
	}
	public void testSetBox4() {
		Box b5=new BoxWeight(2,3,4,5);
		assertEquals(24, b5.volume());
	}
	public void testSetBox5() {
		BoxWeight b5=new BoxWeight(2,3,4,5);
		Box b6=new BoxWeight(b5);
		assertEquals(24, b6.volume());
	}
	public void testSetBox6() {
		Box b6=new BoxWeight(4,5);
		assertEquals(64, b6.volume());
	}
}
