package jeux;

public abstract class JeuSimple {
	
	protected String nom;
	
	public abstract void arbitrer();

	public String getNom() {
		return nom;
	}
	
	public abstract void jourUnTour();
}
