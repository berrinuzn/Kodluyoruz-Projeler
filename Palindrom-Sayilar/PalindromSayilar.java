import java.util.Scanner;

public class PalindromSayilar {
	
	public static boolean isPolindrome(String sayi) {
		
		String reverse = "" ;
		
		for(int i = 0 ; i < sayi.length() ; i++) {
			
			reverse = sayi.charAt(i) + reverse ;
			
		}
		
		if(sayi.equals(reverse)) {
			System.out.println("Polindrom");
			return true ;
		}
		else {
			System.out.println("Not polindrom");
			return false ;
		}
		
	}

	public static void main(String[] args) {
	    
	isPolindrome("15432") ;
	

	}	
}