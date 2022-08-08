import java.util.Scanner;

public class HarmonikOrtalama {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in) ;
	
	int[] numbers = {1,2,3,4,5} ;
	
	double sum = 0.0 ;
	
	for(int i = 1 ; i <= numbers.length ; i++) {
		
		sum += (double)1/i ;
		
	}
	
	double average = numbers.length / (sum) ;
	System.out.println("Harmonik Ortalama : " + average);
	
	
	
}
}
