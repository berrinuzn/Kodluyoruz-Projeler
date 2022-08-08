import java.util.Arrays;
import java.util.Scanner;

public class Employee {
	
	static String name ;
	static double salary ;
	static int workHours ;
	static int hireYear ;
	
	public Employee(String name , double salary , int workHours , int hireYear) {
		
		this.name = name ;
		this.salary = salary ;
		this.workHours = workHours ;
		this.hireYear = hireYear ;
		
	}
	
	static double tax() {
		
		double tax = 0 ;
		
		if(salary < 1000) {
			tax = 0 ;
		}
		else if(salary > 1000) {
			tax = salary*0.03 ;
		}
		
		return tax ;

	}
	
	static double bonus() {
		
		double bonus = 0 ;
		
		if(workHours > 40) {
			
			bonus = (workHours - 40)*30 ;
			
		}
		
		return bonus ;
		
	}
	
	static double raiseSalary() {
		
		int workingYears = 2021 - hireYear ;
		
		double raiseSalary = 0 ;
		
		if(workingYears >0 && workingYears < 10) {
			raiseSalary = salary*0.05 ;	
		}
		else if(workingYears > 9 && workingYears < 20) {
			raiseSalary = salary*0.1 ;
		}
		else if(workingYears > 19) {
			raiseSalary = salary*0.15 ;
		}
		
		return raiseSalary ;
		
	}

	public String toString() {
		
		String str = "Adý : " + name + "\n" 
				+ "Maaþý : " + salary + "\n"
				+ "Çalýþma Saati : " + workHours + "\n"
				+ "Baþlangýç Yýlý : " + hireYear ;
		
		return str ;
		
	}

	
}
