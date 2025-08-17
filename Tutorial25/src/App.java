import java.util.*;
public class App {
   public static void main(String args[]) {
	   //List Interfaces:- Indexed Collection, Order is preserved, Duplicates are allowed 
	ArrayList<String> names= new ArrayList<String>();
	 names.add("banana");
	 names.add("apple"); 
	 names.add("banana");
	 System.out.println(names);
	 names.remove("banana");
	 System.out.println(names);
	 System.out.println(names.size());
	 names.add(1,"Hello");
//	 names.clear();
	 System.out.println(names);
	 //unsafe type collection :- Can store different type of objects within the same list
	 LinkedList list=new LinkedList();
	 list.add("Hello");
	 list.add(2.34);
	 System.out.println(list); 
	 
	 Vector<String> vector=new Vector<>();
	 vector.addAll(names);
	 System.out.println(vector);
	 
	 //Set :- Non Indexed Collection, Order is not preserved, Duplicates are not allowed
	 HashSet<String> nms= new HashSet<String>();
	 nms.add("Hello");
	 nms.add("Harry");
	 nms.add("Truth");
	 nms.add("Shanky");
	 System.out.println(nms);
	 
	 //LinkedHashSet :- Order is preserved
	 LinkedHashSet<String> str=new LinkedHashSet<String>();
	 str.add("Hi");
	 str.add("Bye");
	 str.add("Tye");
	 str.add("tight");
	 System.out.println(str);
	 
	 //TreeSet:- Ascending Order is maintained
	 TreeSet<String> str1=new TreeSet<String>();
	 str1.add("Hi");
	 str1.add("Bye");
	 str1.add("tye");
	 str1.add("tight");
	 System.out.println(str1);
	 
	 //for each loop
	 for(String n:names)
	 {
		 System.out.println(n);
	 }
	 Integer arr[]= {1,2,3,4};
	 
   }
}
