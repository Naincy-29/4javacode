import java.util.HashSet;

class Student{
	private int rollno;
	private String name;
	private String branch;
	
	public Student(int rollno,String name,String branch){
		this.rollno=rollno;
		this.name=name;
		this.branch=branch;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String toString(){
		return"rollno"+rollno+"name"+name+"branch"+branch;
	}

	@Override
	public int hashCode() {
		if(branch.equals("cs")){
			return 1;
			
		}
		else if(branch.equals("me")){
			return 2;
			
		}
		else{
			return 4;
		}
		
	}
	public boolean equals(Object object){
 		boolean isFound = false;
 		if(object instanceof Student){
 Student std = (Student) object; // Downcasting
 		if(this.rollno == std.rollno && 
 			this.name.equals(std.name)
 				&& this.branch.equals(std.branch)){
 			isFound = true;
 		}
 		}
 			return isFound;
 	}

}

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet <Student> studentset=new HashSet<>();
	 Student ram=new Student(132,"ram","cs");
	 Student jiya=new Student(131,"jiya","it");
	 Student ranu=new Student(159,"ranu","cs");
	 Student kirti=new Student(152,"kirti","cs");
	 Student meena=new Student(151,"meena","it");
	 Student lalu=new Student(154,"lalu","me");
	 Student pinku=new Student(172,"pinku","me");
	 studentset.add(pinku);
	 studentset.add(lalu);
	 studentset.add(meena);
	 studentset.add(kirti);
	 studentset.add(ranu);
	 studentset.add(jiya);
	 studentset.add(ram);
	 System.out.println(ram.hashCode());
	 System.out.println(jiya.hashCode());
	 System.out.println(ranu.hashCode());
	 System.out.println(pinku.hashCode());
	 System.out.println(kirti.hashCode());
	 System.out.println(meena.hashCode());
	 System.out.println(lalu.hashCode());
	 System.out.println(studentset);
		

	}

}
