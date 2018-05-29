import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Mission {
	String A = "D�truire le joueur";
	String B = "Conqu�rir tous les territoires";
	String C = "Cont�ler 3 r�gions et au moins 18 territoires";
	String D = "Contr�ler 18 territoires avec au moins 2 arm�es";
	String E = "Contr�ler 30 territoires";
	String F = "Contr�ler 24 territoires";
	String G = "contr�ler 21 territoires";
	String H = "Contr�ler la plus grosse r�gion + 1 autre r�gion";
	List<String> list = new ArrayList<String>();
	

	
	public Mission (int nbjoueur) {
		list.add(C);
		list.add(H);
		
		switch (nbjoueur) {
		
		case 2:
			list.add(B);
			list.add(E);
			choixmission(list, nbjoueur);
			break;
			
		case 3:
			list.add(A);
			list.add(B);
			list.add(E);
			list.add(D);
			choixmission(list, nbjoueur);
			break;
			
		case 4:
			list.add(A);
			list.add(D);
			list.add(F);
			choixmission(list, nbjoueur);
			break;
			
		case 5:
			list.add(A);
			list.add(D);
			list.add(F);
			choixmission(list, nbjoueur);
			break;
			
		case 6 : 
			list.add(A);
			list.add(D);
			list.add(G);
			choixmission(list, nbjoueur);
			break;
			
		
		}
	}
	
	public void choixmission (List<String> list, int nbjoueur) {
		int l = list.size();
		for (int i=1; i<=nbjoueur; i++) {
			Random r = new Random();
			int valeur = 1 + r.nextInt(l - 1);
			String mission = list.get(valeur);;
			if (mission == A) {
				Random p = new Random();
				int j = 2 + p.nextInt(nbjoueur - 2);
				while (j==i) {
					p = new Random();
					j = 2 + p.nextInt(nbjoueur - 2);
				}
				mission = "D�truire le joueur "+j;
			}
			System.out.println("La mission du joueur "+i+" est "+mission); // il faudra faire un pause d'affichage 
		}
	}

}