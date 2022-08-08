import java.util.Scanner;

public class DeseneGoreMetotOlusturma {
	
	public static void desen(int n) {
		
		if(n > 0) {
			System.out.print(n + " ");
			desen(n-5) ;
		}
		System.out.print(n + " ");
	}

	public static void main(String[] args) {
	
		 Scanner scan = new Scanner(System.in);
	    
		 System.out.print("N sayýsý : ");
	     int n = scan.nextInt();
	        
	     System.out.print("Çýktýsý : ");
	     desen(n);
	   
	       
	
	
	}
	
}
