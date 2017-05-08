import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		//HashMap<String,Integer> phnbook=new HashMap<>();
		//for sorted order use treemap
		//TreeMap<String,Integer> phnbook=new TreeMap<>();
		//if a single person has more than one phone no
		TreeMap<String, ArrayList<Integer>> phnbook=new TreeMap<>();
		ArrayList<Integer> ramphno=new ArrayList<>();
		ramphno.add(525411);
		ramphno.add(825411);
		ramphno.add(75411);
		ArrayList<Integer> jiyano=new ArrayList<>();
		jiyano.add(325411);
		jiyano.add(1125411);
		ArrayList<Integer> punno=new ArrayList<>();
		punno.add(5475411);
		punno.add(45475411);
		punno.add(65475411);
		ArrayList<Integer> nano=new ArrayList<>();
		nano.add(00525411);
		
		phnbook.put("naincy", nano);
		phnbook.put("rolly", jiyano);
		
		phnbook.put("puneet", punno);
		phnbook.put("ram", ramphno);
		System.out.println(phnbook);
	}

}
