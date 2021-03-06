import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Mission {
	String A = "Détruire le joueur";
	String B = "Conquérir tous les territoires";
	String C = "Contôler 3 régions et au moins 18 territoires";
	String D = "Contrôler 18 territoires avec au moins 2 armées";
	String E = "Contrôler 30 territoires";
	String F = "Contrôler 24 territoires";
	String G = "contrôler 21 territoires";
	String H = "Contrôler la plus grosse région + 1 autre région";
	List<String> list = new ArrayList<String>();
	

	
	public Mission (List<Joueur> j) {
		list.add(C);
		list.add(H);
		
		switch (j.size()) {
		
		case 2:
			list.add(B);
			list.add(E);
			choixmission(list, j);
			break;
			
		case 3:
			list.add(A);
			list.add(B);
			list.add(E);
			list.add(D);
			choixmission(list, j);
			break;
			
		case 4:
			list.add(A);
			list.add(D);
			list.add(F);
			choixmission(list, j);
			break;
			
		case 5:
			list.add(A);
			list.add(D);
			list.add(F);
			choixmission(list, j);
			break;
			
		case 6 : 
			list.add(A);
			list.add(D);
			list.add(G);
			choixmission(list, j);
			break;
			
		
		}
	}
	
	public void choixmission (List<String> list, List<Joueur> j) {
		int l = list.size();
		for (int i=0; i<j.size(); i++) {
			Random r = new Random();
			int valeur = 1 + r.nextInt(l - 1);
			String mission = list.get(valeur);;
			if (mission == A) {
				Random p = new Random();
				int k = 2 + p.nextInt(j.size() - 2);
				while (k==i) {
					p = new Random();
					k = 2 + p.nextInt(j.size() - 2);
				}
				mission = "Détruire le joueur "+k;
			}
			j.get(i).setMission(mission);
			//System.out.println("La mission du joueur "+i+" est "+mission); // il faudra faire un pause d'affichage 
		}
	}
	
		public boolean Victoire(Joueur j, List<Joueur> Jlist) {
		boolean v = false;
		if (j.territoireListJoueur.size()==42) {
			v = true;
		}
		if (j.getMission()==B) {
			if (j.territoireListJoueur.size()==42) {
				v = true;
			}
		}
		if (j.getMission()==C) {
			int compt=0;
			if (j.territoireListJoueur.size()>=18) {
				/*for (Region r : Plateau.regionsList) {
					for (Territoire t : j.territoireListJoueur) {
						for (Territoire region : ) {
							
						}
					}
				}
			}*/
				v = true;
			}
		}
		if (j.getMission()==D) {
			int nbarmee = 0;
			if (j.territoireListJoueur.size()==18) {
				for (Territoire t : j.territoireListJoueur) {
					nbarmee =+ t.canonListTerritoire.size()+t.soldatListTerritoire.size()+t.cavalierListTerritoire.size();
					if (nbarmee<=2) {
						v=true;
					}
				}
			}
		}
		if (j.getMission()==E) {
			if (j.territoireListJoueur.size()==30) {
				v = true;
			}
		}
		if (j.getMission()==F) {
			if (j.territoireListJoueur.size()==24) {
				v = true;
			}
		}
		if (j.getMission()==G) {
			if (j.territoireListJoueur.size()==21) {
				v = true;
			}
		}
		if (j.getMission()==H) {
			
		}
		return v;
	}

}
