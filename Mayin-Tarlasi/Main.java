import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	
	System.out.println("May�n tarlas� oyununa ho� geldiniz !");
	
	System.out.print("Sat�r giriniz : ");
	int row = sc.nextInt();
	
	System.out.print("S�tun giriniz : ");
	int col = sc.nextInt();
		
	MineSweeper m = new MineSweeper(row,col);	
	m.run();
		
	}

}
