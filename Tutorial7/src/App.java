class Machine{
	private String name;
	private int age;
	Machine(){
		System.out.println("Constructor Running");
		
	}
	Machine(int age)
	{ this(); //calling constructor using this keyword , Note:- 'this' keyword should be the first line of block 
		this.age=age;
		System.out.println("Machine age is "+this.age);
	}
	Machine(int age,String name)
	{  this(20);//calling parameterized constructor using this keyword
		this.age=age;
		this.name=name;
		System.out.println("Machine name "+this.name+" and machine age "+this.age);
		
	}
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Machine m= new Machine();
        new Machine(); //No need of having reference variable to create new object
        new Machine(30);
        new Machine(40,"T-rex");
        
		
		
	}

}
