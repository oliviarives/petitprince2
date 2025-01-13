package petitsprinces;

import asteroide.Sujet;
import asteroide.console.ConsoleJavaBoy;
import java.util.Random;

public class PetitPrince implements Sujet{
	
	private String nom;
	private int argent;
	private ConsoleJavaBoy console;
	private int cpt;
	
	public PetitPrince () {
		nom = "Dario";
		console = new ConsoleJavaBoy(this);
		this.cpt = 0;
		this.argent = 0;
	}
	
	@Override
	public String getNom() {
		return this.nom;
	}
	@Override
	public int getArgent() {
		return this.argent;
	}
	@Override
	public void run() {
		Random random = new Random();
		int rdm = random.nextInt(0, 10);
		cpt++;
		String s = "Je m'appelle "+ nom + " . Je suis au tour "+ cpt;
		console.parler(s);
		console.seDirigerVers(rdm);
	}

}
