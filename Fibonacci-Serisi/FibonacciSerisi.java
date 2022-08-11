import java.util.Scanner;

public class FibonacciSerisi {

	public static void main(String[] args) {
	       
	Scanner sc = new Scanner(System.in) ;
	int s = sc.nextInt() ;
	
	int[] dizi = new int[s+1] ;
	dizi[0] = 0 ;
	dizi[1] = 1 ;
	
	System.out.print(s + " Elemanlý Fibonacci Serisi : " + dizi[0] + " " + dizi[1] + " ");

	for(int i = 2 ; i <= s ; i++) {
		
		dizi[i] = dizi[i-2] + dizi[i-1] ;
		System.out.print(dizi[i] + " ");
		
	}
	



	}	
}