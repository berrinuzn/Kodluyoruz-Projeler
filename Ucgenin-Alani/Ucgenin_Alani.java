import java.util.Scanner;

public class Ucgenin_Alani {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in) ;
	
	System.out.println("Birinci kenar uzunlu�unu giriniz : ");
	int kenar1 = sc.nextInt() ;
	
	System.out.println("�kinci kenar uzunlu�unu giriniz : ");
	int kenar2 = sc.nextInt() ;
	
	System.out.println("���nc� kenaar uzunlu�unu giriniz : ");
	int kenar3 = sc.nextInt() ;
	
	double u = (double) (kenar1 + kenar2 + kenar3)/2 ;
	
	double cevre = 2*u ;
	
	double alan = Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3)) ;
	
	System.out.println(alan);
		
		
		
		
		
		
		
		
		
		
		

	}

}
