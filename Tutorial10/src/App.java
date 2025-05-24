class Frog{
	int age;
	public String toString() {
		return "Age is "+age;
	}
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Object obj= new Object();  //Every class is directly or indirectly extended from this object class
      System.out.println(obj.getClass());
      Frog frog1=new Frog();
      frog1.age=10;
       System.out.println(frog1); 
       System.out.println(frog1.toString());
	}

}
