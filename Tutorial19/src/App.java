import java.util.ArrayList;

class Machine{
	public String toString()
{ return "I am a Machine";
}
	public void start() {
		System.out.println("Machine starting");
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
     showList(list); 
     showList(list1); 
	}
     
     
     public static void showList(ArrayList<? extends Machine> list) {//Whatever I pass to wildcard should extends Machine 
    	 for(Machine value:list)   
    	 {
    		 System.out.println(value);
    		 value.start();
    	 }
     }
    
     public static void showList1(ArrayList<? super Camera> list) { 
    	 for(Machine value:list)   //Won't work because super classes of camera need not to necessarily have Camera functions
    	 {
    		 System.out.println(value);
    		 value.start();
    	 }
     }
		
}


