package Test.java.com.calci.app;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Main.java.com.calci.app.cal;
 public class Testcal{

	@Test
	void testAdd() {
		
		assertEquals(40, cal.add(10, 30));
		assertEquals(60, cal.add(10, 30));   //this test case should return faliure
		assertEquals(400, cal.add(100, 300));
		assertEquals(42, cal.add(21, 21));
		assertEquals(40, cal.add(1, 39));
		
		}
		
	
	@Test
	void testSub() {
		
		assertEquals(2, cal.sub(6, 4));
		assertEquals(60, cal.sub(100, 40));
		assertEquals(400, cal.sub(1000, 600));
		assertEquals(42, cal.sub(63, 21));
		assertEquals(40, cal.sub(79, 39));
		
		}
	
	@Test
	void testDiv() {
		
		assertEquals(4, cal.div(12, 3));
		assertEquals(0, cal.div(0, 30));
		assertEquals(3, cal.div(9, 3));
		assertEquals(8, cal.div(64,8));
		assertEquals(0, cal.div(0, 6));
		
		}
	
	
	@Test
	void testMul() {
		
		assertEquals(-2000, cal.mul(-50, 40));
		assertEquals(60, cal.mul(3, 20));
		assertEquals(400, cal.mul(20, 20));
		assertEquals(42, cal.mul(21, 2));
		assertEquals(40, cal.mul(1, 40));
		
		}
	
	@Test
	void testMod() {
		
		assertEquals(1, cal.mod(1, 2));
		assertEquals(0, cal.mod(200, 2));
		assertEquals(2, cal.mod(8, 3));
		assertEquals(4, cal.mod(19,5));
		assertEquals(0, cal.mod(32, 8));
		
		}	

}
