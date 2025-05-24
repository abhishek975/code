class Robot{
	public void speak(String text) {
		System.out.println(text);		
	}
	public void jump(int height) {
		System.out.println("Jumping: "+height);
	}
	public void move(String direction, double distance)
	{
		System.out.println("Moving "+distance+" meters in direction "+direction);
	}
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Robot sam=new Robot();
     sam.speak("Hi there");
     sam.jump(7);
     sam.move("North", 20);
     int h=34;
     sam.jump(h);
     String d="East";
     sam.move(d,h);
	}

}
