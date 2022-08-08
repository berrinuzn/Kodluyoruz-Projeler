import java.util.Scanner;

public class Armstrong_Sayi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in) ;
  
	System.out.println("Sayý giriniz : ");
	String s = sc.nextLine() ;
	
	String a ;
	
	int c ;
	int sum = 0 ;
	
	for(int i = 0 ; i < s.length() ; i++) {
		
		a = s.substring(i,i+1) ;
		c = Integer.parseInt(a) ;
		int b = 1 ;
		for(int j = 0 ; j < s.length() ; j++) {
			b *= c ;
		}
		sum += b ;
		
	}
	
	int ss = Integer.parseInt(s) ;
	
	if(ss == sum) {
		System.out.println(ss + " bir Armstrong sayý.");
	}
	else {
		System.out.println(ss + " nir Armstrong sayý deðil.");
	}
	
	
	
	
	
	
	
	
	
	
}
}
