import java.util.ArrayList;

public class Joueur {
	public String nom;
	public int id;
	protected ArrayList<Territoire> territoireListJoueur;
	
	
	public Joueur(int id, String nom) {
		this.id = id;
		this.nom = nom;
		ArrayList<Territoire> terList = new ArrayList<Territoire>();
		this.territoireListJoueur = terList;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static void initListJoueurs(int nbJoueur) {
		for (int i =1; i <=nbJoueur; i++) {
			
			Joueur j=new Joueur(i, "joueur"+i);
			
			Plateau.joueurList.add(j);
			
			System.out.println(Plateau.joueurList.get(i-1).getNom());
		}
	}


	public void addTerritoire (Territoire territoire){
		this.territoireListJoueur.add(territoire);
		
	}
}
