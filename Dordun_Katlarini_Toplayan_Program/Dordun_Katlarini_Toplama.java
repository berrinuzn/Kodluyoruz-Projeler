import java.util.Scanner;

public class Dordun_Katlarini_Toplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in) ;
    
	int sum = 0 ;
	int x ;
	
	do {
		
		System.out.println("Bir sayý giriniz : ");
		x = sc.nextInt() ;
		
		if(x % 4 == 0) {
			
			sum += x ;
			
		}
		
	}while(x % 2 == 0) ;
	
	System.out.println("Toplam = " + sum);
	
	
	
	
	
	
	
	
	
	
}
}
