import junit.framework.TestCase;

public class BoxTest extends TestCase{
	BoxWeight b;
	public void setUp() throws Exception {
		b = new BoxWeight();
	}
	public void testSetBox0() {
		assertEquals(40, b.volume());
	}
	/*public void testSetBox1() {
		BoxWeight b2=new BoxWeight(2,3,4);
		assertEquals(24, b2.volume());
	}
	public void testSetBox2() {
		BoxWeight b3=new BoxWeight(2);
		assertEquals(8, b3.volume());
	}*/
	public void testSetBox3() {
		BoxWeight b4=new BoxWeight();
		//b4.val_b();
		assertEquals(40, b4.volume());
	}
	public void testSetBox4() {
		BoxWeight b5=new BoxWeight(2,3,4,5);
		//b5.val_b();
		assertEquals(4800, b5.volume());
	}
	public void testSetBox5() {
		BoxWeight b5=new BoxWeight(2,3,4,5);
		BoxWeight b6=new BoxWeight(b5);
		//b6.val_b();
		assertEquals(4800, b6.volume());
	}
	public void testSetBox6() {
		BoxWeight b6=new BoxWeight(4,5);
		
		assertEquals(12800, b6.volume());
	}
	public void testSetBox8() {
		BoxWeight b6=new BoxWeight(4,5,6,7);
		
		assertEquals(33600, b6.volume());
	}
	public void testSetBox9() {
		BoxWeight b6=new BoxWeight();
		
		assertEquals("testing box1", b6.display());
	}
}
