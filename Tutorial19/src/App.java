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
     showList(list1); //Won't work because ArrayList<Camera> is not a subclass of ArrayList<Machine>
	}
     
     
     public static void showList(ArrayList<Machine> list) {
    	 for(Machine value:list)
    	 {
    		 System.out.println(value);
    	 }
     }
    
		
}


