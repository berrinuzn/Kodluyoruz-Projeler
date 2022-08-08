import java.util.Scanner;

public class Kucukten_Buyuge_Siralama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in) ;
    
	System.out.println("Ýlk sayýyý giriniz : ");
	int s1 = sc.nextInt() ;
	
	System.out.println("Ýkinci sayýyý giriniz : ");
	int s2 = sc.nextInt() ;
	
	System.out.println("Üçüncü sayýyý giriniz : ");
	int s3 = sc.nextInt() ;
	
	if(s1 > s2 && s1 > s3) {
		
		if(s2 > s3) {
			
			System.out.println(s3 + " < " + s2 + " < " + s1);
			
		}
		else {
		
			System.out.println(s2 + " < " + s3 + " < " + s1);
			
		}
		
	}
	else if(s2 > s1 && s2 > s3) {
		
		if(s1 > s3) {
			
			System.out.println(s3 + " < " + s1 + " < " + s2);
			
		}
		else {
			
			System.out.println(s1 + " < " + s3 + " < " + s2);
			
		}
		
	}
	else {
		
		if(s1 > s2) {
			
			System.out.println(s2 + " < " + s1 + " < " + s3);
			
		}
		else {
		
			System.out.println(s1 + " < " + s2 + " < " + s3);
			
		}
		
	}

    
    
    

}
}
