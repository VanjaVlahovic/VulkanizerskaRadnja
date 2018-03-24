package gume;

/**
 * Klasa koja predstavlja gume
 * 
 * @author Vanja Vlahovic
 * @version 1.0
 *
 */

public class AutoGuma {
	
	/**
	 * Naziv marke i modela gume
	 */	
	private String markaModel = null;
	
	/**
	 * Precnik gume
	 */
	private int precnik = 0;
	
	/**
	 * Sirina gume
	 */
	private int sirina = 0;
	
	/**
	 * Visina gume
	 */
	private int visina = 0;
	
	/**
	 * Vraca vrednost atributa markaModel
	 * @return naziv marke i modela kao String
	 */
	public String getMarkaModel() {
		return markaModel;
	}
	
	/**
	 * Postavlja novu vrednost za naziv marke i modela
	 * @param markaModel nova vrednost za naziv marke i modela
	 * @throws java.lang.RuntimeException ako je 
	 * unet null ili prazan string za naziv marke i modela
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel==null || markaModel.length()<3)
			throw new RuntimeException("Morate uneti marku i model");
	
		this.markaModel = markaModel;
	}
		
	/**
	 * Vraca vrednost atributa precnik
	 * @return precnik gume kao int vrednost
	 */
	public int getPrecnik() {
		return precnik;
	}
	/**
	 * Postavlja novu vrednost za velicinu precnika gume
	 * @param precnik nova vrednost za velicinu precnika
	 * @throws java.lang.RuntimeException ako je
	 * unet precnik manji od 13 ili veci od 22
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 || precnik > 22)
			throw new RuntimeException("Precnik van opsega");
	
		this.precnik = precnik;
	}
	/**
	 * Vraca vrednost atributa sirina
	 * @return sirina gume kao int vrednost
	 */
	public int getSirina() {
		return sirina;
	}
	/**
	 * Postavlja novu vrednost za sirinu gume
	 * @param sirina nova vrednost za sirinu gume
	 * @throws java.lang.RuntimeException ako je 
	 * uneta sirina manja od 135 ili veca od 355
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 || sirina > 355)
			throw new RuntimeException("Sirina van opsega");
	
		this.sirina = sirina;
	}
	/**
	 * Vraca vrednost atributa visina
	 * @return visina gume kao int vrednost
	 */
	public int getVisina() {
		return visina;
	}
	/**
	 * Postavlja novu vrednost za visinu gume
	 * @param visina nova vrednost za visinu gume
	 * @throws java.lang.RuntimeException ako je
	 * uneta visina manja od 25 ili veca od 95 
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		
		this.visina = visina;
	}
	/**
	 * Vraca sve informacije o gumi (marka, model, precnik, sirina i visina)
	 * @return informacije o gumi kao String vrednost
	 */
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik +
				", sirina=" + sirina + ", visina=" + visina + "]";
	}
	/**
	 * Proverava da su uneti objekti isti
	 * @return true ako su isti, u suprotnom false
	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}

}
