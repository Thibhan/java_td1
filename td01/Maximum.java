package up.mi.tp.td01;

public class Maximum {
	public static int max2(int a, int b ) {
		return (a > b)?a:b;
	}
	
	public static int max3v1(int a, int b , int c){
		if(( a >b )&&(a>c)) {
			return a;
		}else if((b>a)&&(b>c)) {
			return b;
		}else {
			return c;
		}
	}
	
	public static int max3v2(int a , int b , int c ) {
		return (max2(a,b)>c)?max2(a,b):c;
	}
	

}
