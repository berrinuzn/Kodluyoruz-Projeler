import java.util.Arrays;
import java.util.Scanner;

public class PolindromKelimeler {
	
	static void polindrome() {
		
		Scanner sc = new Scanner(System.in) ;
		System.out.print("Kelime giriniz : ");
		String s = sc.nextLine() ;
		
		String reverse = "" ;
		
		if(s.length() != 0) {
			
			for(int i = s.length()-1 ; i >= 0 ; i--) {
				
				reverse += s.charAt(i) ;
				
			}
			
			if(reverse.equals(s)) {
				
				System.out.print(s + " polindrome bir sayý.");
				
			}
			else {
				
				System.out.print(s + " polindrome bir sayý deðil.");
				
			}
			
		}
		else {
			
			System.out.print("Lütfen geçerli bir ifade giriniz.");
			
		}
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	polindrome() ;

	
}
}
