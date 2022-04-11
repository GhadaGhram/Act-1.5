import java.util.ArrayList;
public class Recette {
public String nom;
public String description;
public int nvDifficulté;

ArrayList<String> astuce=new ArrayList<String>();
ArrayList<String> etape=new ArrayList<String>();

public Recette() {
	}
	
public Recette(String nom, String description, int nvDifficulté) {
	this.nom = nom;
	this.description = description;
	this.nvDifficulté = nvDifficulté;
	}

public void addAstuce(String astuce) {
astuce.add(astuce);
}

public void addEtape(String etape) {
etape.add(etape);

}}








