import java.util.Scanner;

public class Kombinasyon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in) ;
  
	System.out.println("Bir n deðeri giriniz : ");
	int n = sc.nextInt() ;
	
	System.out.println("Bir r deðeri giriniz : ");
	int r = sc.nextInt() ;
	
	int c ;
	int j = 1;
	int k = 1;
	int l = 1;
	
	for(int i = 1 ; i <= n ; i++) {
		j *= i ;
	}
	
	for(int i = 1 ; i <= r ; i++) {
		k *= i ;
	}
	
	for(int i = 1 ; i <= (n-r) ; i++) {
		l *= i ;
	}
	
	c = j / (k * l) ;
	
	System.out.println("Kombinasyon : " + c);
	
	
	
	
	
	
	
	
}
}
