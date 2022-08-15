import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	   
	Teacher t1 = new Teacher("Mahmut Hoca" , "TRH", 4567890) ;	
	Teacher t2 = new Teacher("Graham Bell", "FZK", 567890) ;
	Teacher t3 = new Teacher("Külyutmaz", "BIO", 111);
	
	Course tarih = new Course("Tarih", "101", "TRH");
	tarih.addTeacher(t1);
	
	Course fizik = new Course("Fizik", "102", "FZK");
	fizik.addTeacher(t2);
	
	Course biyo = new Course("Biyoloji", "101", "BIO");
	biyo.addTeacher(t3);
	
	Student s1 = new Student(tarih, fizik, biyo, "Ýnek Þaban", "123", "4");
	s1.addBulkExamNote(100, 78, 50);
	s1.addBulkVerbalGrade(100, 70, 60);
	s1.isPass();
	
	
	Student s2 = new Student(tarih, fizik, biyo, "Güdük Necmi", "444", "4");
	s2.addBulkExamNote(50, 30, 70);
	s2.addBulkVerbalGrade(60, 50, 90);
	s2.isPass();
	
	    
	}	
}