import java.util.Scanner;

public class Dairenin_Alani {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in) ;
	
	System.out.println("Yar��ap� giriniz : ");
	double yaricap = sc.nextDouble() ;
	
	System.out.println("A�� giriniz : ");
	double a = sc.nextDouble() ;
	
	final double pi = 3.14 ;
	
	double alan = (pi*(yaricap*yaricap)*a)/360 ;
	
	System.out.println("��genin Alan� : " + alan);
		
		
		
		
		
		
		
		

	}

}
