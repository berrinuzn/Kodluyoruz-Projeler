import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlariSiralama {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in) ;
	
	System.out.print("Dizinin boyutu : ");
	int boyut = sc.nextInt() ;
	
	int[] dizi = new int[boyut] ;
	
	System.out.println("Dizinin elemanlar�n� giriniz : ");
	
	for(int i = 1 ; i <= boyut ; i++) {
		
		System.out.print(i + ". Eleman� : ");
		int s = sc.nextInt() ;
		dizi[i-1] = s ;
		
	}
	
	Arrays.sort(dizi);
	
	System.out.print("S�ralama : " + Arrays.toString(dizi));
	
	
	
	
}
}
