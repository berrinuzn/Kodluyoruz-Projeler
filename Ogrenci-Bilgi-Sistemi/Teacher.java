
public class Teacher {

	String name ;
	int mpno ;
	String branch ;
	
	public Teacher(String name, String branch , int mpno) {
		this.name = name;
		this.mpno = mpno;
		this.branch = branch;
	}
	
	void print() {
		
		System.out.println("Ad� : " + this.name);
		System.out.println("Telefonu : " + this.mpno);
		System.out.println("B�l�m� : " + this.branch);
		
	}
	
}
