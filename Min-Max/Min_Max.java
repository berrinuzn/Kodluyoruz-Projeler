import java.util.Scanner;

public class Min_Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in) ;
  
	System.out.print("Ka� tane say� gireceksiniz: ");
	int s = sc.nextInt() ;
	
	int [] x = new int[s] ;
	
	
		
	for(int i = 1 ; i <= s ; i++) {
			
		System.out.print(i + ". say�y� giriniz: ");
		int y = sc.nextInt() ;
			
		x[i-1] = y ;
			
		}
		
	
	
	int buyuk = x[0] ;
	int kucuk = x[0];
	
	for(int i = 0 ; i < s ; i++) {
		
		if(buyuk < x[i]) {
			buyuk = x[i] ;
		} 
		else if(kucuk > x[i]) {
			kucuk = x[i] ;
		}
		
	}
	System.out.println("En b�y�k say�: " + buyuk);
	
	System.out.println("En k���k say�: " + kucuk);
	
}
}
