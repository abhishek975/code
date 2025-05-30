class Machine{
	public void start() {
		System.out.println("Machine starting...");
	}
}
interface Plant{
	public void grow();
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Machine machine1=new Machine() { //Anonymous class, which extends machine class . This class 
    	   //is a child of Machine so we can override the methods.
    	   @Override
    	   public void start() {
    		   System.out.println("Machine already started");
    	   }
       };
       
       Plant plant1=new Plant() { //Anonymous class implements Plant interface
    	   public void grow() {
    		   System.out.println("Plant is growing");
    	   }
       };
       machine1.start();
       plant1.grow();
	}

}
