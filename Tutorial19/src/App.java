import java.util.ArrayList;

class Machine{
	public String toString()
{ return "I am a Machine";
}
	}
class Camera extends Machine{
	public String toString()
{ return "I am a Camera";
}
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<String> list = new ArrayList<>();
     
     list.add("One");
     list.add("Two");
     showList(list);
	}
     
     
     public static void showList(ArrayList<String> list) {
    	 for(String value:list)
    	 {
    		 System.out.println(value);
    	 }
     }
    
		
}


