import java.util.Comparator;
import java.util.TreeSet;
class SortById implements Comparator<Customer>{

	@Override
	public int compare(Customer obj1, Customer obj2) {
		// TODO Auto-generated method stub
		return((Integer)obj1.getId()).compareTo((Integer)obj2.getId());
	}
	
}
 class Customer{
	 private int id;
		private String name;
		private double salary;
		 public Customer(int id,String name,double salary){
			 this.id=id;
			 this .name=name;
			 this.salary=salary;
		 }
		 public String toString(){
			 return "id"+id+"name"+name+"salary"+salary+"\n";
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
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		 
 }
public class TreeSetDemo {
	
	public static void main(String[] args){
		TreeSet<Customer> treeset=new TreeSet<>( new SortById());
		Customer ram=new Customer(101,"naincy",2000);
		Customer shyam=new Customer(102,"puneet",2050);
		Customer karan=new Customer(103,"karan",3000);
		Customer pooja=new Customer(104,"pooja",2100);
		Customer vineeta=new Customer(105,"rolly",200);
		treeset.add(ram);
		treeset.add(vineeta);
		treeset.add(pooja);
		treeset.add(karan);
		treeset.add(shyam);
		System.out.println(treeset);

}

}
