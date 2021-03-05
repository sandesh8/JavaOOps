import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

class Stud implements Comparable<Stud>
{
	int rollno;
	int marks;
	String name;
	
	public Stud(int rollno, int marks, String name)
	{
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Stud [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}
	public int compareTO(Stud s)
	{
		
		return marks>s.marks?1:-1;
		
	}

	@Override
	public int compareTo(Stud o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

public class Collectiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// COllection Interface
	//	1st part
      /* Collection<Integer> values = new ArrayList<>();
       // In Collection we can not add elements in between. thats why we use List.
       values.add(5); // This is not the int type it is the object of integer,( Integer v = new Integer(4);)
       values.add(67);
       values.add(23);
       values.add(123);
       
       Iterator it = values.iterator();
       
       while(it.hasNext())
       {
    	   System.out.println(it.next());
       }
       */
		
		// 2nd pat 
		// LIST Interface we can any number at any place values.add(index, number);
		/*List<Integer> values = new ArrayList<>();
		values.add(345);
		values.add(567);
		values.add(987);
		values.add(46347);
	    values.add("449939");
	
		for(Object i: values)
		{
			System.out.println(multiply);
		}
		*/
		
		
	//	3rd part 
		// COMPARABLE INTERFACE
		/*
		List<Stud> studs = new ArrayList<>();
		studs.add(new Stud(31, 600, "Mahesh"));
		studs.add(new Stud(32, 634, "Vikram"));
		studs.add(new Stud(33, 700, "James"));
		studs.add(new Stud(35, 789, "Vanish"));
		
		Collections.sort(studs);
	   
		for(Stud s: studs)
		{
			System.out.println(s);
		}
		*/
		
		// SET INTERFACE we cannot add duplicate values
		/*
		Set<Integer> elements = new HashSet(); // HashSet never prints the values in particular order. So todo that we can use TreeSet
		// Set<Integer> elements = new TreeSet(); //It prints the values particular order
		elements.add(448);
		elements.add(783);
		elements.add(9857);
		elements.add(448); // this value is not printed because it is repeated.
		
		
		for(int i: elements)
		{
			System.out.println(i);
		}
		*/
		
		// MAP INTERFACE 
		/*
		Map<String, String> maps = new HashMap();
		maps.put("Name: ","Sandesh Kumar");
		maps.put("Course: ","Java");
		maps.put("Place: ","Hyderabad");
		maps.put("Certification: ","Oracle");
		
		// System.out.println(maps.get("Course"));
		
		Set<String> keys = maps.keySet();
		
		 for(String key: keys)
		 {
			 System.out.println(key + " " + maps.get(key));
		 }
		 */
		
		 // Queue Set
		 Queue<String> animal = new PriorityQueue<>();
		 animal.add("Sandesh");
		 animal.add("Shashank");
		 animal.add("Shravan");
		 animal.add("Shravani");
		 System.out.println(animal.poll());
		 System.out.println(animal.poll());
		 System.out.println(animal.poll());
		 System.out.println(animal.poll());
	}

}
