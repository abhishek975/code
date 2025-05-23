class Person { // outer classes can only be declared public or package private(default)
	// Instance Variables(State or Attribute);
	String name; //default access modifier
	int age;     //default access modifier

	// Method(behaviour)
	void speak() {
		System.out.println("Hello "+name+" your age is "+this.age);
	}
	int calculateYearsToRetirement() {
		int yearsLeft=65-age;
		return yearsLeft;
		
	}
	int getAge(){ //getter method
		return age;
	}
	String getName() {//getter method
		return name;
	}
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Person person=new Person();
    person.name="Abhi";
    person.age=30;
    System.out.println(person.getName());
	}

}
