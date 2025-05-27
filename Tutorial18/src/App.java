import java.util.ArrayList;

class Animal{
	
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Before Java 5
		ArrayList list = new ArrayList();
		list.add("apple");
		list.add("banana");
		list.add("orange");
		String fruit= (String)list.get(1);
		System.out.println(fruit);
		
		//Modern Style
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("cat");
		strings.add("dog");
		String animal=strings.get(1);
		System.out.println(animal);
		
		//Java 7
		ArrayList<Animal> someList= new ArrayList<>();
		
		
	}

}
