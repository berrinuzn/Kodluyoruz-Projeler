
import java.util.Scanner;

public class MukemmelSayi {

	public static void main(String[] args) {
	       
	Scanner sc = new Scanner(System.in) ;
	
	System.out.print("Bir sayý giriniz: ");
	int s = sc.nextInt() ;
	int sum = 0 ;
	
	for(int i = 1 ; i < s ; i++) {
		if(s % i == 0) {
			sum += i ;
		}
	}
	if(sum == s) {
		System.out.println(s + " Mükemmel sayýdýr");
	}
	else {
		System.out.println(s + " Mükemmel sayý deðildir");
	}
	
	
}
}