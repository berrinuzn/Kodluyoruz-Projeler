import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);	
		
	int[] dizi = {15,12,788,1,-1,-778,2,0} ;
	
	System.out.print("Girilen Sayý : ");
	int s = sc.nextInt() ;
	
	int[] yeniDizi = {15,12,788,1,-1,-778,2,0,s} ;
	
	Arrays.sort(yeniDizi);
	
	int x = Arrays.binarySearch(yeniDizi, s);
	
	int kucuk = yeniDizi[0];
	int buyuk = yeniDizi[yeniDizi.length-1];
	
	for(int i = 0 ; i < x ; i++) {
		
		if(yeniDizi[i] > kucuk) {
			kucuk = yeniDizi[i];
		}
		
	}
	
	for(int i = yeniDizi.length-1 ; i > x ; i--) {
		
		if(yeniDizi[i] < buyuk) {
			buyuk = yeniDizi[i];
		}
		
	}
	
	System.out.println("Girilen sayýdan küçük en yakýn sayý : " + kucuk);
	System.out.println("Girilen sayýdan büyük en yakýn sayý : " + buyuk);
		
	}

}
