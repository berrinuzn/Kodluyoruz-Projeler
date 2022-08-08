
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Employee employee = new Employee("kemal", 2000.0, 45, 1985) ;
		
	System.out.println(employee.toString()) ;
	System.out.println("Vergi : " + employee.tax());
	System.out.println("Bonus : " + employee.bonus());
	System.out.println("Maaþ Artýþý : " + employee.raiseSalary());
	System.out.println("Vergi ve Bonuslar ile birlikte maaþ : " + ((employee.bonus()-employee.tax())+employee.salary));
	System.out.println("Toplam Maaþ : " + (employee.salary + employee.raiseSalary()));	
		
		
	}

}
