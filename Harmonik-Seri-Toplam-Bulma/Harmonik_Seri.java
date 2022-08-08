import java.util.Scanner;

public class Harmonik_Seri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in) ;
  
	System.out.println("Bir sayý giriniz : ");
	int s = sc.nextInt() ;

	double sum = 0 ;
	
	for(int i = 1 ; i <= s ; i++) {
		
		sum += (double)1/i ;
		
	}
	
	System.out.println("Harmonik seri toplamý : " + sum);
	
	
	
	
	
	
}
}
