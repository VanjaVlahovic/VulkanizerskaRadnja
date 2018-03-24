/**
 * 
 */
package gume;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Vanja Vlahovic
 *
 */
public class AutoGumaTest {
	private AutoGuma g;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		g = new AutoGuma();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		g = null;
	}

	/**
	 * Test method for {@link gume.AutoGuma#setMarkaModel(java.lang.String)}.
	 */
	@Test
	public void testSetMarkaModel() {
		g.setMarkaModel("Michelin primacy 4");
		assertEquals("Michelin primacy 4", g.getMarkaModel());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		g.setMarkaModel(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelPrazanString() {
		g.setMarkaModel("");
	}

	/**
	 * Test method for {@link gume.AutoGuma#setPrecnik(int)}.
	 */
	@Test
	public void testSetPrecnik() {
		g.setPrecnik(16);
		assertEquals(16, g.getPrecnik());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikManjeOd13() {
		g.setPrecnik(10);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikViseOd22() {
		g.setPrecnik(25);
	}

	/**
	 * Test method for {@link gume.AutoGuma#setSirina(int)}.
	 */
	@Test
	public void testSetSirina() {
		g.setSirina(205);
		assertEquals(205, g.getSirina());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaManjaOd135() {
		g.setSirina(100);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaVecaOd335() {
		g.setSirina(400);
	}

	/**
	 * Test method for {@link gume.AutoGuma#setVisina(int)}.
	 */
	@Test
	public void testSetVisina() {
		g.setVisina(60);
		assertEquals(60, g.getVisina());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaManjaOd25() {
		g.setVisina(20);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaVecaOd95() {
		g.setVisina(100);
	}

	/**
	 * Test method for {@link gume.AutoGuma#toString()}.
	 */
	@Test
	public void testToString() {
		g.setMarkaModel("Michelin CrossClimate +");
		g.setPrecnik(15);
		g.setSirina(175);
		g.setVisina(65);
		
		assertEquals("AutoGuma [markaModel=Michelin CrossClimate +, precnik=15, sirina=175, visina=65]", g.toString());
		
	}
	
	@Test 
	public void testEqualsObject() {
		g.setMarkaModel("Michelin CrossClimate +");
		g.setPrecnik(15);
		g.setSirina(175);
		g.setVisina(65);
		
		AutoGuma g2 = new AutoGuma();
		
		g2.setMarkaModel("Michelin CrossClimate +");
		g2.setPrecnik(15);
		g2.setSirina(175);
		g2.setVisina(65);
		
		assertTrue(g.equals(g2));
		}
	
	@Test 
	public void testEqualsObjectFalse() {
		g.setMarkaModel("Michelin CrossClimate +");
		g.setPrecnik(15);
		g.setSirina(175);
		g.setVisina(65);
		
		AutoGuma g2 = new AutoGuma();
		
		g2.setMarkaModel("Michelin Alpin5");
		g2.setPrecnik(15);
		g2.setSirina(175);
		g2.setVisina(65);
		
		assertFalse(g.equals(g2));
		}

}
