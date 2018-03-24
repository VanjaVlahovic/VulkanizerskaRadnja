/**
 * 
 */
package gume.radnja;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import gume.AutoGuma;

/**
 * @author Vanja Vlahovic
 *
 */
public class VulkanizerskaRadnjaTest {
	
	private VulkanizerskaRadnja r;
	private AutoGuma g;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		r = new VulkanizerskaRadnja();
		
		g = new AutoGuma();
		
		g.setMarkaModel("Michelin Alpin5");
		g.setPrecnik(15);
		g.setSirina(175);
		g.setVisina(65);
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		r =null;
		g = null;
	}

	/**
	 * Test method for {@link gume.radnja.VulkanizerskaRadnja#dodajGumu(gume.AutoGuma)}.
	 */
	@Test
	public void testDodajGumuPrazna() {
		r.dodajGumu(g);
		assertEquals(1, r.vratiListu().size());
		assertEquals(g, r.vratiListu().get(0));
	}
	
	@Test
	public void testDodajGumuNijePrazna() {
		AutoGuma g2 = new AutoGuma();
		
		g2.setMarkaModel("Michelin CrossClimate +");
		g2.setPrecnik(15);
		g2.setSirina(175);
		g2.setVisina(65);
		
		r.dodajGumu(g);
		r.dodajGumu(g2);
		assertEquals(2, r.vratiListu().size());
		assertEquals(g2, r.vratiListu().get(0));
	}

	@Test (expected = java.lang.NullPointerException.class)
	public void testDodajGumuNull() {
		r.dodajGumu(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajGumuDuplikat() {
		AutoGuma g2 = new AutoGuma();
		g2.setMarkaModel("Michelin Alpin5");
		g2.setPrecnik(15);
		g2.setSirina(175);
		g2.setVisina(65);
		
		r.dodajGumu(g);
		r.dodajGumu(g2);
	}
	
	/**
	 * Test method for {@link gume.radnja.VulkanizerskaRadnja#pronadjiGumu(java.lang.String)}.
	 */
	@Test 
	public void testPronadjiGumuMarkaNull() {
		assertEquals(null, r.pronadjiGumu(null));
	}

	@Test
	public void testPronadjiGumuNemaGume() {
		AutoGuma g2 = new AutoGuma();
		g2.setMarkaModel("Michelin CrossClimate +");
		g2.setPrecnik(15);
		g2.setSirina(175);
		g2.setVisina(65);
		r.dodajGumu(g);
		r.dodajGumu(g2);
		
		assertEquals(0, r.pronadjiGumu("Marshal").size());
	}
	
	@Test
	public void testPronadjiGumuRazliciteDimenzije() {
		AutoGuma g2 = new AutoGuma();
		g2.setMarkaModel("Michelin CrossClimate +");
		g2.setPrecnik(15);
		g2.setSirina(175);
		g2.setVisina(65);
		
		AutoGuma g3 = new AutoGuma();
		g3.setMarkaModel("Michelin Alpin5");
		g3.setPrecnik(15);
		g3.setSirina(180);
		g3.setVisina(65);
		
		r.dodajGumu(g);
		r.dodajGumu(g2);
		r.dodajGumu(g3);
		
		assertEquals(2, r.pronadjiGumu("Michelin Alpin5").size());
	}
	
	@Test
	public void testVratiListu() {
		r.dodajGumu(g);
		
		assertEquals(1, r.vratiListu().size());
		assertEquals(g, r.vratiListu().get(0));		
	}
	
	@Test
	public void testVratiListuPrazna() {
		assertEquals(0, r.vratiListu().size());
		
	}
	
}
