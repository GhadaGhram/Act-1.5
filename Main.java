package Biblioth�que;

import java.util.spi.LocaleServiceProvider;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livre livre1=new Livre("Le petit prince", "St Exup�ry", 10.40, 50);
		livre1.afficher();
		
		Livre livre2=new Livre("Contes", "Grimm", 14.40, 254);
		livre2.afficher();
		
		
		BD b1=new BD("Lucky Luke", "Morris", 14.40, 45, true);
		b1.afficher();
		
		BD b2=new BD("Tintin", "Herge", 200.40, 45, false);
		b2.afficher();
	    
		/*Manga m1=new Manga(null, null, null);
		System.out.println(m1.toString());*/
		
		Roman r1=new Roman("Dora", "Dora",3.5,300, 0,null);
		r1.afficher();
		r1.setNbchapitres(12);
		r1.setDescription("Une description ");
		
		LivreRecette lrc1=new LivreRecette("Marmiton","Philippe Etchebest", 15.98, 110);
		lrc1.afficher();
		Recette rc1=new Recette("Les p�tes crues", "comment",3);
		rc1.addAstuces("Ne pas les faire cuire.");
		rc1.addEtapes("Sortir les p�tes de leur emballage");
		lrc1.addRecette(rc1);
	}

}
