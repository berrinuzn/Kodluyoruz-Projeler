import java.util.Scanner;

public class Ucgen_Yapma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in) ;
  
	System.out.println("Bir sayý giriniz : ");
	int s = sc.nextInt() ;

	for(int i = 1 ; i <= s ; i+=2) {
		
		for(int k = i+1 ; k <= s ; k++) {
			
			System.out.print(" ");
			
		}
		
		for(int j = 1 ; j <= i ; j++) {
			
			System.out.print("* ");
			
		}
		System.out.println();
	}
	
	for(int i = s-2 ; i >= 1 ; i-=2) {
		
		for(int k = i ; k < s ; k++) {
			
			System.out.print(" ");
			
		}
		
		for(int j = i ; j >= 1 ; j--) {
			
			System.out.print("* ");
			
		}
		System.out.println();
	}
	
	
	
	
	
	
}
}
