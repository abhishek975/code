class Frog{
	int age;
	String name;
	public void setAge(int age) { //local variables with same name  as of instance variables closest to 
		//function are given preferences
		System.out.println(age);
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
