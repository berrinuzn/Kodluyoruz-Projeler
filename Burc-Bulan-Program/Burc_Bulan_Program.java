import java.util.Scanner;

public class Burc_Bulan_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in) ;
    
	System.out.println("Do�du�unuz ay : ");
	int ay = sc.nextInt() ;
	
	System.out.println("Do�du�unuz g�n : ");
	int gun = sc.nextInt() ;
	
	if(ay == 3) {
		if(gun >= 21 && gun <= 31) {
			System.out.println("Ko� burcusunuz.");
		}
		else if(gun >= 1 && gun <= 20) {
			System.out.println("Bal�k burcusunuz.");
		}
	}
	else if(ay == 4) {
		if(gun >= 1 && gun <= 20) {
			System.out.println("Ko� burcusunuz.");
		}
		else if(gun >= 21 && gun <= 30) {
			System.out.println("Bo�a burcusunuz.");
		}
	}
	else if(ay == 5) {
		if(gun >= 1 && gun <= 21) {
			System.out.println("Bo�a burcusunuz.");
		}
		else if(gun >= 22 && gun <= 31) {
			System.out.println("�kizler burcusunuz.");
		}
	}
	else if(ay == 6) {
		if(gun >= 1 && gun <= 22) {
			System.out.println("�kizler burcusunuz.");
		}
		else if(gun >= 23 && gun <= 30) {
			System.out.println("Yenge� burcusunuz.");
		}
	}
	else if(ay == 7) {
		if(gun >= 1 && gun <= 22) {
			System.out.println("Yenge� burcusunuz.");
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
			System.out.println("Ba�ak burcusunuz.");
		}
	}
	else if(ay == 9) {
		if(gun >= 1 && gun <= 22) {
			System.out.println("Ba�ak burcusunuz.");
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
			System.out.println("O�lak burcusunuz.");
		}
	}
	else if(ay == 1) {
		if(gun >= 1 && gun <= 21) {
			System.out.println("O�lak burcusunuz.");
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
			System.out.println("Bal�k burcusunuz.");
		}
	}
    
    
    

}
}
