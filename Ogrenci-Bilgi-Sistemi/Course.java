
public class Course {

	Teacher teacher ;
	String name ;
	String code ;
	String prefix ;
	double note ;
	double verbal;
	
	public Course(String name, String code, String prefix) {
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		int note = 0 ;
	}
	
	void addTeacher(Teacher teacher) {
		if(teacher.branch.equals(this.prefix)) {
		this.teacher = teacher ;
		printTeacher();
		}else {
			System.out.println("��retmen ve ders b�l�mleri uyu�muyor.");
		}
	}
	
	void printTeacher() {
		this.teacher.print();
	}
	
	
	
	
	
	
}
