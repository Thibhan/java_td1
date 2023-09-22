package up.mi.tp.td01;

public class UtilTab {
	public static void affichageTableau(double[] tab, boolean enLigne) { 
		for(int i = 0 ;i < tab.length ;i++) {
		   System.out.print(tab[i]);
		   if(enLigne) {
		      System.out.print(" ");
		   }else {
		      System.out.println();
		   }
		}
		System.out.println(); 
    }
	public static boolean appartient(double val, double[] tab) {
		for(int i = 0 ;i < tab.length ;i++) {
			if(tab[i] == val) {
			    return true ;
			}
		}
		return false ;
	}
	public static double min(double[] tab) { 
		double tmpMin = tab[0] ;
		for(int i = 1 ;i < tab.length ;i++) {
		    if(tab[i] < tmpMin) {
		         tmpMin = tab[i];
		    }
		}
		return tmpMin ;
	}
	public static double max(double[] tab) { 
		double tmpMax = tab[0] ;
		for(int i = 1 ;i < tab.length ;i++) {
		    if(tab[i] > tmpMax) {
		         tmpMax = tab[i];
		    }
		}
		return tmpMax ;
	}
	public static double somme(double[] tab) {
		double tmpSomme = 0 ;
		for(int i = 0 ;i < tab.length ;i++) {
			tmpSomme += tab[i];
		}
		return tmpSomme;
	}
	public static void triParSelection(double[] tab) {
		for(int i = 0 ;i < tab.length - 1 ;i++) {
			int indiceMin = rechercheIndicePlusPetit(tab, i);
			if(indiceMin != i) {
				echanger(tab,i, indiceMin);
			}
		}
	}
	private static int rechercheIndicePlusPetit(double[] tab, int indiceMin) {
		for(int j = indiceMin + 1 ;j < tab.length ;j++) {
			if(tab[j] < tab[indiceMin]) {
				indiceMin = j ;
			}
		}
		return indiceMin ;
	}
	private static void echanger(double[] tab, int i, int j) {
		double tmpVal = tab[i];
		tab[i] = tab[j];
		tab[j] = tmpVal ;
	}
    
	public static double moyenne(double [] tab ) {
		double somme = 0,moyenne = 0;
		for (int i = 0;i<tab.length;i++) {
			somme += tab[i];
		}
		moyenne = somme/tab.length;
		return moyenne;
	}
	
	public static double mediane(double[] tab ) {
		double mediane=0;
		if (tab.length%2==0) {
			double  somme = 0;
			
			somme =(tab[(tab.length)/2  ]+ tab[(tab.length)/2 +1])/2;
			return somme;	
		}else{
			mediane = tab[tab.length/2];
			return mediane;
		}
	}
	
	public static double moyennePonderee(double[]tab,int [] tab) {
		
	}

}
