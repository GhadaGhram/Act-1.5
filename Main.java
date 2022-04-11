public class Main {

	public static void main(String[] args) {
	        Livre livre1=new Livre("Le petit prince", "St Exupéry", 10.40, 50);
		livre1.afficher();
		
		Livre livre2=new Livre("Contes", "Grimm", 14.40, 254);
		livre2.afficher();
				
		BD b1=new BD("Lucky Luke", "Morris", 14.40, 45, true);
		b1.afficher();
		
		BD b2=new BD("Tintin", "Herge", 200.40, 45, false);
		b2.afficher();
	    
		Manga m1=new Manga("One piece","Eiichiro Oda",5.40,60);
		m1.aficher;
		
		Manga m2=new Manga("Death Note","Tsugumi Oba",7.40,75);
		m1.aficher;
		
		Roman r1=new Roman("Dora", "Dora",3.5,300, 0,null);
		r1.afficher();
		r1.setNbchapitres(12);
		r1.setDescription("Une description ");
		
		LivreRecette lrc1=new LivreRecette("Marmiton","Philippe Etchebest", 15.98, 110);
		lrc1.afficher();
		Recette rc1=new Recette("Les pâtes crues", "comment réaliser de délicieuses pâtes",3);
		rc1.addAstuces("Ne pas les faire cuire.");
		rc1.addEtapes("Sortir les pâtes de leur emballage");
		lrc1.addRecette(rc1);
	}

}
