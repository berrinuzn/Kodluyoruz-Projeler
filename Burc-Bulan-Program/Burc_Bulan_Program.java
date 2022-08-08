import java.util.Scanner;

public class Burc_Bulan_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in) ;
    
	System.out.println("Doğduğunuz ay : ");
	int ay = sc.nextInt() ;
	
	System.out.println("Doğduğunuz gün : ");
	int gun = sc.nextInt() ;
	
	if(ay == 3) {
		if(gun >= 21 && gun <= 31) {
			System.out.println("Koç burcusunuz.");
		}
		else if(gun >= 1 && gun <= 20) {
			System.out.println("Balık burcusunuz.");
		}
	}
	else if(ay == 4) {
		if(gun >= 1 && gun <= 20) {
			System.out.println("Koç burcusunuz.");
		}
		else if(gun >= 21 && gun <= 30) {
			System.out.println("Boğa burcusunuz.");
		}
	}
	else if(ay == 5) {
		if(gun >= 1 && gun <= 21) {
			System.out.println("Boğa burcusunuz.");
		}
		else if(gun >= 22 && gun <= 31) {
			System.out.println("İkizler burcusunuz.");
		}
	}
	else if(ay == 6) {
		if(gun >= 1 && gun <= 22) {
			System.out.println("İkizler burcusunuz.");
		}
		else if(gun >= 23 && gun <= 30) {
			System.out.println("Yengeç burcusunuz.");
		}
	}
	else if(ay == 7) {
		if(gun >= 1 && gun <= 22) {
			System.out.println("Yengeç burcusunuz.");
		}
		else if(gun >= 23 && gun <= 31) {
			System.out.println("Aslan burcusunuz.");
		}
	}
	else if(ay == 8) {
		if(gun >= 1 && gun <= 22) {
			System.out.println("Aslan burcusunuz.");
		}
		else if(gun >= 23 && gun <= 31) {
			System.out.println("Başak burcusunuz.");
		}
	}
	else if(ay == 9) {
		if(gun >= 1 && gun <= 22) {
			System.out.println("Başak burcusunuz.");
		}
		else if(gun >= 23 && gun <= 30) {
			System.out.println("Terazi burcusunuz.");
		}
	}
	else if(ay == 10) {
		if(gun >= 1 && gun <= 22) {
			System.out.println("Terazi burcusunuz.");
		}
		else if(gun >= 23 && gun <= 31) {
			System.out.println("Akrep burcusunuz.");
		}
	}
	else if(ay == 11) {
		if(gun >= 1 && gun <= 21) {
			System.out.println("Akrep burcusunuz.");
		}
		else if(gun >= 22 && gun <= 30) {
			System.out.println("Yay burcusunuz.");
		}
	}
	else if(ay == 12) {
		if(gun >= 1 && gun <= 21) {
			System.out.println("Yay burcusunuz.");
		}
		else if(gun >= 22 && gun <= 31) {
			System.out.println("Oğlak burcusunuz.");
		}
	}
	else if(ay == 1) {
		if(gun >= 1 && gun <= 21) {
			System.out.println("Oğlak burcusunuz.");
		}
		else if(gun >= 22 && gun <=31) {
			System.out.println("Kova burcusunuz.");
		}
	}
	else if(ay == 2) {
		if(gun >= 1 && gun <= 19) {
			System.out.println("Kova burcusunuz.");
		}
		else {
			System.out.println("Balık burcusunuz.");
		}
	}
    
    
    

}
}
