public class BD extends Livre {
private boolean couleur;

public BD() {
	super();
}

public BD(String titre, String auteur, double prix, int nbrePages, boolean couleur) {
	super(titre, auteur, prix, nbrePages);
	this.couleur = couleur;
}

public void afficher() {
	super.afficher();
	if (couleur==true) {System.out.println("Livre en couleur");
		}
		else {System.out.println("Livre en noir et blanc");
		}
}
}
