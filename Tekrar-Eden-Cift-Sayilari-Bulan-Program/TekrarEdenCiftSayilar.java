import java.util.Scanner;

public class TekrarEdenCiftSayilar {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in) ;
	
	int [] list = {2,5,9,12,16,21,2,12,21} ;
	
	for(int i = 0 ; i < list.length ; i++) {
		
		for(int j = i+1 ; j < list.length ; j++) {
			
			if(list[i] == list[j] && list[i] % 2 == 0) {
				
				System.out.print(list[i] + " ");
				
			}
			
		}
		
	}
	
	
	
}
}
