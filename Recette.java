package Biblioth�que;

import java.util.ArrayList;

public class Recette {
	
public String nom;
public String description;
public int nvDifficult�;

ArrayList<String> astuces=new ArrayList<String>();
ArrayList<String> etapes=new ArrayList<String>();

public Recette() {
	}
	
public Recette(String nom, String description, int nvDifficult�) {
	super();
	this.nom = nom;
	this.description = description;
	this.nvDifficult� = nvDifficult�;
	}

public void addAstuces(String astuces) {
astuces.add(astuces);
}

public void addEtapes(String etapes) {
etapes.add(etapes);

}


	
}








