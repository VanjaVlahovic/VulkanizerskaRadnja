package gume.radnja;

import java.util.LinkedList;

import gume.AutoGuma;
/**
 * Klasa koja predstavlja vulkanizersku radnju
 * 
 * @author Vanja Vlahovic
 * @version 1.0
 *
 */
public class VulkanizerskaRadnja {
	/**
	 * Lista guma dostupnih u vulkanizersoj radnji
	 */
	private LinkedList<AutoGuma> gume =	new LinkedList<AutoGuma>();
	
	/**
	 * Dodaje novu gumu u magacin vulkanizerske radnje
	 * @param a nova guma koja se dodaje u radnju, na pocetak liste
	 * @throws java.lang.NullPointerException ako je uneta guma null
	 * @throws java.lang.RuntimeException  ako se ista takva guma 
	 * vec nalazi u radnji 
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
	
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		
		gume.addFirst(a);
	}

	/**
	 *  Pronalazi i vraca listu sa svim gumama koje su trazenog modela i marke.
	 *  
	 * @param markaModel naziv marke i modela knjige
	 * @return null ako atribut markaModel ima null vrednost,
	 * u suprotnom listu guma koje odgovaraju upitu
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;

		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
			for(int i=0;i<gume.size();i++)
				if (gume.get(i).getMarkaModel().equals(markaModel))
					novaLista.add(gume.get(i));
			
		return novaLista;
	}
	
	/**
	 * Vraca listu svih guma u vulkanizerskoj radnji
	 * @return listu svih guma iz radnje
	 */
	public LinkedList<AutoGuma> vratiListu(){
		return gume;
	}
}
