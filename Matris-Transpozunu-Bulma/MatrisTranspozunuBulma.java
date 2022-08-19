import java.util.Arrays;
import java.util.Scanner;

public class MatrisTranspozunuBulma {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Matrisin kaça kaç olacaðýný giiriniz : ");
	int x = sc.nextInt() ;
	int y = sc.nextInt();
	
	int[][] dizi = new int[y][x];
	
	for(int i = 0 ; i < y ; i++) {
		
		for(int j = 0 ; j < x ; j++) {
			
			dizi[i][j] = sc.nextInt() ;
			
		}
		
	}
	
	System.out.println("Matris : ");
	
	for(int i = 0 ; i < y ; i++) {
		
		for(int j = 0 ; j < x ; j++) {
			
			System.out.print(dizi[i][j] + "\t");
			
		}
		System.out.println();
	}
	
	
	System.out.println("Transpoze:");
	
	int j = 0 ;
	
	while(j < x) {
		
		for(int i = 0 ; i < y ; i++) {
		
			System.out.print(dizi[i][j] + "\t");
		
		}
		
		j++;
		System.out.println();
		
	}
	
	
	
		
	}

}
