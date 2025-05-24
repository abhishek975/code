class Thing{
	public String name;
	public static String description;
	public static final int count=0; //For final keyword to use, we have to initialize it at its declaration itself
	public void showName() { //Non static methods can access static members because it do not require creation of object
		System.out.println("Object name : "+name+", "+description+" is description");
	}
	public static void showDescription() { 
		System.out.println("Description is: "+description);
		//System.out.println(name);//Static method cannot access non static member because intializing the 
		//non static data members require creation of object.So might be the case, that we are accessing 
		//non static data  member through static method before the creation of its object.
	}
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Thing.description="Good Boy"; 
       Thing thing1=new Thing();
       thing1.name="Abhi";
       Thing.showDescription();//Can directly access the static members with the classname without creating its object
       thing1.showName();
       
       
	}

}
