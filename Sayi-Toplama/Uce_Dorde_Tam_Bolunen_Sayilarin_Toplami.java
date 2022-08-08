import java.util.Scanner;

public class Uce_Dorde_Tam_Bolunen_Sayilarin_Toplami {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in) ;
    
	System.out.println("Bir sayý giriniz : ");
	int x = sc.nextInt() ;
	
	int sum = 0;
	int sayac = 0;
	
	for(int i = 0 ; i <= x ; i++) {
		
		if(x % 3 == 0 || x % 4 == 0) {
			
			sum += i ;
			sayac++ ;
		}
		
	}

    double ortalama = (double)sum/sayac ;
    System.out.println(ortalama);

}
}
