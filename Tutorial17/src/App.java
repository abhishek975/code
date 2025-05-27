class Machine{
	public void start() {
		System.out.println("Machine Started");
	}
	
}
class Camera extends Machine {
	public void start() {
		System.out.println("Camera Started");
		
	}
	public void snap() {
		System.out.println("Photo Taken");
	}
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Machine machine1=new Machine();
        Camera camera1=new Camera();
        machine1.start();
        camera1.start();
        
        //Upcasting
        Machine machine2=new Camera();
        machine2.start(); //Object Slicing
     //   machine2.snap(); Won't work because with the help of Machine type reference variables 
        //we can access only methods defined within the Machine(Parent) class
		
        //Downcasting
        Machine machine3=new Camera();
        Camera camera2=(Camera)machine3;
		camera2.snap();
		camera2.start();
		
		
	}

}
