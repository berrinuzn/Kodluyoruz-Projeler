import java.util.Scanner;

public class TersUcgen {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	    
	System.out.print("Basamak sayýsý : ");
	int b = sc.nextInt() ;
		
	for(int i = b ; i > 0 ; i--){
		
        for(int j = b-i ; j > 0 ; j--){
        	
            System.out.print(" ");
        }

      for(int k = 2*i-1 ; k > 0 ; k--){
    	  
          System.out.print("*");
      
      }
        System.out.println(" ");

    }
		
	
		
	
	
	}
	
}
