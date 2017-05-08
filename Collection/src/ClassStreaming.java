import java.util.ArrayList;

class Doctor{
	private int id;
	private String name;
	private double Salary;
	public Doctor(int id,String name,double Salary){
		this.id=id;
		this.name=name;
		this.Salary=Salary;
		
		}
	
		 public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

		public String toString(){
				return "id"+id+"name"+name+"Salary"+Salary;
	}
	
}
public class ClassStreaming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Doctor> list=new ArrayList<>();
		for(int i=0; i<=10;i++){
			Doctor dr=new Doctor(i,"name"+i,1000*i);
			list.add(dr);
		}
	//	double totalSum = list.stream()
	//			.filter((e)->e.getSalary()>20000)
	//			.mapToDouble((x)->x.getSalary()).sum();
		//	System.out.println("Total Sum is "+totalSum);
		double totalSum = list.parallelStream()
				.filter((e)->e.getSalary()>2000)
				.mapToDouble((x)->x.getSalary()).sum();
				System.out.println("Total Sum is "+totalSum);
			
		// Double sum=list.stream().filter((Current)->Current.getSalary()>5000).mapToDouble((Current)->Current.getSalary()).sum();

//System.out.println(sum);
	}

}
