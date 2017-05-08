import java.util.ArrayList;

class A{}
class B extends A{}
class c extends A{}
class D{}

public class WildCard {
	//as array list is of type A so it can store only
			//array list type  A here B ,c , D is not of type A
			//so its shows erroer when we add object to array list of type other then A
		
			
	//public  static void show(ArrayList<A> list){}  
	//soln of above problem
	//it accept all those object of arraay list that have extends A its shows error 
	//when we stose object of array list of type D
    //public  static void show(ArrayList<? extends A> list){} 
    //now if we want that we can store the Arrayklist  of type  A as well 
    //as parents of A then 
	//Araylist of type b c d is not the parent of A then ite shows error at b c d
    //public  static void show(ArrayList<? super A> list){}
    //now if we want any generic type array list then
	//if we send object of Array list b then its store b type object
	//if want c and so but at a tym only one type of object can store
    public  static void show(ArrayList<? > list){}
    //if u want u can store mutiple typre of object at a tym in a
    //single array list use
    //public  static void show(ArrayList<Object > list){}
	public static void main(String[] args) {
		
		ArrayList<A> l=new ArrayList<>();
		show(l);
		ArrayList<B> l1=new ArrayList<>();
		show(l1);
		ArrayList<c> l2=new ArrayList<>();
		show(l2);
		ArrayList<D> l3=new ArrayList<>();
		show(l2);
	}

}
