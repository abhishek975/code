
public class Car extends Machine{ //Machine class inherited to Car class
      public void start() {
    	  System.out.println("Car Started");
    	  name="Mercedes";
    	  System.out.println("Car name is "+name);
    	 // System.out.println(code); code is not accessible as in parent class it is defined as private
      }
	
	
}
