class Frog{
	int age;
	String name;
	public void setAge(int age) { //local variables with same name  as of instance variables closest to 
		//function are given preferences
		
		System.out.println(this.age);  // By using this keyword, we are referring to the instance variables
		//of current object
	}
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Frog f1=new Frog();
       f1.age=30;
       f1.setAge(10);
	}

}
