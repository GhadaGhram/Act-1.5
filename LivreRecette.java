import java.util.ArrayList;
public class LivreRecette extends Livre {

ArrayList<Recette> recettes = new ArrayList<>();
public LivreRecette(String titre, String auteur, double prix, int nbrePages) {
        super(titre, auteur, prix, nbrePages);
    }

    public void addRecette(Recette recette) {
        recettes.add(recette);
    }
	

}
