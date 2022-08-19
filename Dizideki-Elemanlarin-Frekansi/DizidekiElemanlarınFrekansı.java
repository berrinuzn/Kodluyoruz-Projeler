
import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlarýnFrekansý {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	
	System.out.print("Dizinin geniþliðini giriniz : ");
	int size = sc.nextInt();
	
	int[] dizi = new int[size];
	
	for(int i = 0 ; i < dizi.length ; i++) {
		
		dizi[i] = sc.nextInt() ;
		
	}
	
	System.out.println("Dizi : " + Arrays.toString(dizi));
	
	Arrays.sort(dizi);
	
	System.out.println("Tekrar Sayýlarý");
	
	int n = 1, a = 0;

    for (int i = 0 ; i < dizi.length ; i++){
        if (dizi[i] != a){
            for (int j = i + 1 ; j < dizi.length; j++){
                if (dizi[i] == dizi[j]) {
                    n++;
                    a = dizi[i];
                }
            }

            System.out.println(dizi[i] + " sayýsý " + n + " kere tekrar edildi.");
            n = 1;
        }
    }
	
	
		
	}

}
