class Frog{
	int age;
	String name;
	public void setAge(int age) { //local variables with same name  as of instance variables closest to 
		//function are given preferences
		this.age=40;
		System.out.println(age);  // By using this keyword, we are referring to the instance variables
		//of current object
	}
	public void setName(String name) {
		this.name="Rhino";
		System.out.println("Local variabel Name is "+name);
				System.out.println("Instance Name is "+this.name);
	}
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Frog f1=new Frog();
//       f1.age=30;
       System.out.println("Local Variable age is ");
       f1.setAge(10);
       System.out.println("Instance Variable age is "+ f1.age);
       f1.setName("Reco");
	}

}
