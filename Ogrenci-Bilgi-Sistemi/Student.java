
public class Student {

	Course c1 ;
	Course c2 ;
	Course c3 ;
	String name ;
	String stuNo ;
	String classes ;
	double average ;
	boolean isPass ;
	
	public Student(Course c1, Course c2, Course c3, String name, String stuNo, String classes) {
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.name = name;
		this.stuNo = stuNo;
		this.classes = classes;
		this.average = 0.0 ;
		this.isPass = false ;
	}
	
	
	void addBulkExamNote(int note1, int note2 , int note3) {
		if(note1 >= 0 && note1 <= 100) {
			c1.note = note1*0.8 ;
		}
		if(note2 >= 0 && note2 <= 100) {
			c2.note = note2*0.8 ;
		}
		if(note3 >= 0 && note3 <= 100) {
			c3.note = note3*0.8 ;
		}
	}
	
	void addBulkVerbalGrade(int n1 , int n2 , int n3) {
		if(n1 >= 0 && n1 <= 100) {
			c1.verbal = n1*0.2 ;
		}
		if(n2 >= 0 && n2 <= 100) {
			c2.verbal = n2*0.2 ;
		}
		if(n3 >= 0 && n3 <= 100) {
			c3.verbal = n3*0.2 ;
		}
	}
	
	
	void printNote() {
		System.out.println(c1.name + " notu\t:" + c1.note + " sözlü notu\t:" + c1.verbal);
		System.out.println(c2.name + " notu\t:" + c2.note + " sözlü notu\t:" + c2.verbal);
		System.out.println(c3.name + " notu\t:" + c3.note + " sözlü notu\t:" + c3.verbal);
		System.out.println("Ortalamanýz : " + this.average);
	}
	
	void isPass() {
		System.out.println("******************");
		this.average = (( (this.c1.note + this.c1.verbal) ) + ( this.c2.note + this.c2.verbal ) + ( this.c3.note + this.c3.verbal ))/3.0 ;
		if(this.average > 55) {
			System.out.println("Hababam sýnýfý uyanýyor !");
			this.isPass = true;
		}
		else {
			System.out.println("Hababam sýnýfý sýnýfta kaldý !");
			this.isPass = false;
		}
		printNote();
	}
	
	
	
}
