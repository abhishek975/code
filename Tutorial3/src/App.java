class Person { // outer classes can only be declared public or package private(default)
	// Instance Variables(State or Attribute);
	String name; //default access modifier
	int age;     //default access modifier

	// Method(behaviour)
	void speak() {
//		age=20;
		System.out.println(age);
		System.out.println("Hello "+name+" your age is "+this.age);
	}
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person();// Creating an instance
		person1.name = "Abhi"; // Accessing using Dot operator
		person1.age = 25;
        person1.speak();
		
		Person person2 = new Person();
		person2.name = "Rakesh";
		person2.age = 26;
		person2.speak();

		System.out.println(person1.age);
	}

}
