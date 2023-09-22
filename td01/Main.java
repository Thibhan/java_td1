package up.mi.tp.td01;

public class Main {
	public static void main(String[] args) {
		//EXO2
		//int s= UtilMath.somme3(1,2,3);
		//long f=UtilMath.fact(8);
		//long c=UtilMath.comb(10,5);
		//long p=UtilMath.puissance(4,6);
		//System.out.println("somme = "+s+"factorielle = "+f+"combinaison ="+c+"puissance ="+p);
		
		//EX03
		//int m = Maximum.max2(5,9);
		//int n = Maximum.max3v1(6,8,9);
		//int o = Maximum.max3v2(5,6,4);
		//System.out.println("Max2   "+m+"  Max3v1 "+n+"  Max3v2  "+o);
		
		//EX04
		double[] tab = {18.2, 2.3, 5, 42, 23.7 };
		UtilTab.affichageTableau(tab, false);
		System.out.println(UtilTab.appartient(0, tab));
		System.out.println(UtilTab.appartient(2.3, tab));
		System.out.println(UtilTab.max(tab));
		System.out.println(UtilTab.min(tab));
		System.out.println(UtilTab.somme(tab));
		UtilTab.triParSelection(tab);
		UtilTab.affichageTableau(tab, true);
		
		System.out.println(UtilTab.mediane(tab));
	}
}
