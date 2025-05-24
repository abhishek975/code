
public class Machine {
	private int code;//Private type members of a class is not accessible by other class members
	protected String name;//Protected type members of a class are accessible only by child class members
	public void start()
{  System.out.println("Machine Started");
} 
	public void stop()
	{ System.out.println("Machine Stopped");
	
}
}
