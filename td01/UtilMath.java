package up.mi.tp.td01;
import java.lang.Math;

public class UtilMath {
	public static int somme3(int a,int b,int c) {
		return a+b+c;
	}
	
	public static long fact(int n){
		if(n == 0) {
			return  1;
		}
		else if(n == 1) {
			return  1;
		}else {
			return n *fact(n-1);
		}
		
	}
	public static long comb(int n,int p){
		return fact(n)/(fact(p)*fact(n-p));
	}
	public static long puissance(int n, int m) {
		return (long)Math.pow(n,m);
	}

}

