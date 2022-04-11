package Bibliothéque;

public class Roman extends Livre {
private int nbchapitres;
private String description;

public Roman() {
	super();}
public Roman(String titre, String auteur, double prix, int nbrePages, int nbchapitres, String description)
 {
	super(titre, auteur, prix, nbrePages);
	this.nbchapitres = nbchapitres;
	this.description = description;}
	
public int getNbchapitres() {
	return nbchapitres;
}

public void setNbchapitres(int nbchapitres) {
	this.nbchapitres = nbchapitres;
	System.out.println("le nombre de chapitre :"+this.nbchapitres);
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
	System.out.println("Une description quelqonque");
}}
