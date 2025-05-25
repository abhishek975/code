
public class Person extends Machine implements Info  {
//Classes are extends
//Interface implements
//Either you override the Interface method in the Parent class(need not to implement the interface by Parent class)
//Or you override within the child class itself but it is mandatory to override the method	
 private String name;
 public Person(String name) {
	 this.name=name;
	 }
 public void greet() {
	 System.out.println("Hello "+name);
 }
@Override
public void showInfo() {
	// TODO Auto-generated method stub
	
}

}
