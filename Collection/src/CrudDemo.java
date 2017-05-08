import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;
final class EmployeeOperation{
	private EmployeeOperation(){}
	 static final ArrayList<Employee> employeelist=new ArrayList<>();
	 
	 public static void add(int id,String name, double Salary){
		 Employee emp=new Employee(id,name,Salary);
		 employeelist.add(emp);
		 System.out.println("Record added.....");
	 }
	 
	 public static boolean remove(Employee emp){
		 
		 int index=employeelist.indexOf(emp);
				 if(index>=0){
					 employeelist.remove(index);
					 return true;
				 }
				 else{
					 return false;
				 }
	 }
	 
	 public static boolean update(Employee emp){
		
		 int index=employeelist.indexOf(emp);
				 if(index>=0){
					 employeelist.set(index, emp);
					 emp.setName("amit");
					 emp.setSalary(100000);
					 return true;
				             }
					 else
					 {
						 return false;
				
				      }
			}
	 public static boolean search(Employee emp){
		
		 return employeelist.contains(emp);
				
			}
	 static  double totalsalary=0.0;
	 public  static double totalsalary(){
		 ListIterator<Employee> iterator=employeelist.listIterator();
		 while(iterator.hasNext()){
			 Employee obj=iterator.next();
			 totalsalary=totalsalary+obj.getSalary();
		
		 }
		return totalsalary;
	 }
}
class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private double Salary;
	Employee(int id,String name,double Salary){
		this.id=id;
		this.name=name;
		this.Salary=Salary;
	}
	@Override
	public String toString(){
		return "id"+id+"name"+name+"Salary"+Salary;
		
		
	}
	public boolean equals(Object object){
		 		boolean isFound = false;
		 		if(object instanceof Employee){
		 Employee emp = (Employee) object; // Downcasting
		 		if(this.id == emp.id && 
		 			this.name.equals(emp.name)
		 				&& this.Salary == emp.Salary){
		 			isFound = true;
		 		}
		 		}
		 			return isFound;
		 	}
		 	
	public int getId() {
		return id;
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
	@Override
	public int compareTo(Employee emp) {
	
			return this.name.compareTo(emp.name);
		
		
		}
		
	
	
	
}
public class CrudDemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		while(true){
			System.out.println("1-add");
			System.out.println("2-remove");
			System.out.println("3-update");
			System.out.println("4-total salary");
			System.out.println("5-read");
			System.out.println("6-search");
			System.out.println("7-exit");
			System.out.println(" 8-sort by id");
			
			System.out.println("9-sort by name");
			System.out.println("enter ur choice");
			int choice=scanner.nextInt();
		
			
		
		if(choice==1){
			System.out.println("enter th id of employee");
			int id=scanner.nextInt();
			System.out.println("enter the name of employee");
			String name=scanner.next();
			System.out.println("enter the salaryof empoyee");
			double Salary=scanner.nextDouble();
			EmployeeOperation.add(id, name, Salary);
			
		}
		else
		if(choice==2){
			System.out.println("enter th id of employee");
			int id=scanner.nextInt();
			System.out.println("enter the name of employee");
			String name=scanner.next();
			System.out.println("enter the salaryof empoyee");
			double Salary=scanner.nextDouble();
			Employee emp=new Employee(id,name,Salary);
			if(EmployeeOperation.remove(emp)){
				System.out.println("record deleted..........");
				System.out.println(EmployeeOperation.employeelist);
			}
			else
				System.out.println("record not found....");
			
		}
			
		else
		if (choice==3){
		System.out.println("enter th id of employee");
		int id=scanner.nextInt();
		System.out.println("enter the name of employee");
		String name=scanner.next();
		System.out.println("enter the salaryof empoyee");
		double Salary=scanner.nextDouble();
		Employee emp=new Employee(id, name ,Salary);
		if(EmployeeOperation.update(emp)){
			System.out.println("record updated..........");
			System.out.println(EmployeeOperation.employeelist);
		}
		else
			System.out.println("record not found");
			
		}
		else
        if (choice==4){
        	System.out.println(EmployeeOperation.totalsalary());
			
		}
        else
        if (choice==5){
        	System.out.println(EmployeeOperation.employeelist);
	
        }
        else
        if(choice==6){
        	System.out.println("enter th id of employee");
    		int id=scanner.nextInt();
    		System.out.println("enter the name of employee");
    		String name=scanner.next();
    		System.out.println("enter the salaryof empoyee");
    		double Salary=scanner.nextDouble();
    		Employee emp=new Employee(id,name,Salary);
    		if(EmployeeOperation.search(emp)){
    			System.out.println("record foundrd..........");
    			
    		}
    		else 
    			System.out.println("record not found");
        	
        }
        else
        if (choice==7){
        System.out.println("exit..............");
	
         }
       if(choice ==8){
	Collections.sort(EmployeeOperation.employeelist);
	
       }
		}
	}

}

