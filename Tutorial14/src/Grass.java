import world.Plant;

public class Grass extends Plant {
   //won't work as the access modifier of height is default and not accessible as Grass and plant are in
	//different package , even though Grass inherits from Plant class
	//System.out.println(this.height);
}
