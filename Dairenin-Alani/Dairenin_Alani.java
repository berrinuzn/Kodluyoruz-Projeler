import java.util.Scanner;

public class Dairenin_Alani {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in) ;
	
	System.out.println("Yarýçapý giriniz : ");
	double yaricap = sc.nextDouble() ;
	
	System.out.println("Açý giriniz : ");
	double a = sc.nextDouble() ;
	
	final double pi = 3.14 ;
	
	double alan = (pi*(yaricap*yaricap)*a)/360 ;
	
	System.out.println("Üçgenin Alaný : " + alan);
		
		
		
		
		
		
		
		

	}

}
