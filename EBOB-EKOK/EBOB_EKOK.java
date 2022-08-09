
import java.util.Scanner;

public class EBOB_EKOK {

	public static void main(String[] args) {
	       
	Scanner sc = new Scanner(System.in) ;
	
	System.out.print("Birinci sayý : ");
	int s1 = sc.nextInt() ;
	
	System.out.print("Ýkinci sayý : ");
	int s2 = sc.nextInt() ;
	
	int i = 1 , ebob = 1 ;
	
	while(i <= s1) {
		
		if((s1 % i == 0) && (s2 % i == 0)) {
			ebob = i ;
		}
		i++ ;
	}
		
	System.out.println("Ebob : " + ebob);	
	
	int k = 1 ;
	
	while(k <= (s1*s2)) {
		
		if(k % s1 == 0 && k % s2 == 0) {
			System.out.println("Ekok : " + k);
			break ;
		}
		k++ ;
	}
	
	
	
}
}