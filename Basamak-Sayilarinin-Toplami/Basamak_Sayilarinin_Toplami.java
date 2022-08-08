import java.util.Scanner;

public class Basamak_Sayilarinin_Toplami {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in) ;
  
	System.out.println("Sayý giriniz : ");
	String s = sc.nextLine() ;
	
	String a ;
	int x , sum = 0 ;
	
	for(int i = 0 ; i < s.length() ; i++) {
		
		a = s.substring(i, i+1) ;
		x = Integer.parseInt(a) ;
		sum += x ;
		
	}
	
	System.out.println(s + " = " + sum);
	
	
	
	
	
	
	
	
}
}
