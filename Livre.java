package Bibliothéque;

public class Livre {
public String titre;
public String auteur;
public double prix;
public int nbrePages;


public Livre() {

}

public Livre(String titre, String auteur, double prix, int nbrePages) {
	super();
	this.titre = titre;
	this.auteur = auteur;
	this.prix = prix;
	this.nbrePages = nbrePages;
}


public void afficher() {
	System.out.println("  ");
	System.out.println("Titre:"+this.titre);
	System.out.println("Auteur:"+this.auteur);
	System.out.println("Prix:"+this.prix);
	System.out.println("nbrePages:"+this.nbrePages);
	
}


 
}

