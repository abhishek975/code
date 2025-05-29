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
     ArrayList<Machine> list = new ArrayList<Machine>();
     
     list.add(new Machine());
     list.add(new Machine());
     
     ArrayList<Camera> list1 = new ArrayList<Camera>();
     list1.add(new Camera());
     list1.add(new Camera());
     showList(list1); 
	}
     
     
     public static void showList(ArrayList<?> list) {
    	 for(Machine value:list)  //Won't Work because we don't know which type of object is passed
    		 //into wildcard
    	 {
    		 System.out.println(value);
    	 }
     }
    
		
}


