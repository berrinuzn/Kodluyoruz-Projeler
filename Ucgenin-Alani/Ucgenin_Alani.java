import java.util.Scanner;

public class Ucgenin_Alani {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in) ;
	
	System.out.println("Birinci kenar uzunluðunu giriniz : ");
	int kenar1 = sc.nextInt() ;
	
	System.out.println("Ýkinci kenar uzunluðunu giriniz : ");
	int kenar2 = sc.nextInt() ;
	
	System.out.println("Üçüncü kenaar uzunluðunu giriniz : ");
	int kenar3 = sc.nextInt() ;
	
	double u = (double) (kenar1 + kenar2 + kenar3)/2 ;
	
	double cevre = 2*u ;
	
	double alan = Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3)) ;
	
	System.out.println(alan);
		
		
		
		
		
		
		
		
		
		
		

	}

}
