class Person{
	//Instance Variables(State or Attribute);
	String name;
    int age;  
    //Method(behaviour)
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Person person1=new Person();//Creating an instance
      person1.name="Abhi"; //Accessing using Dot operator
      person1.age=25;
      
      Person person2=new Person();
      person2.name="Rakesh";
      person2.age=26;
      
      System.out.println(person1.age);
	}

}
