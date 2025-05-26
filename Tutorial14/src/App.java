import world.Field;
import world.Plant;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plant plant = new Plant();
   System.out.println(plant.ID);
   //Won't work--> type is private
   //System.out.println(plant.type);
   Field field=new Field();
   //Wont work as size is protected but its class is present in another package
   //System.out.println(plant.size);
   //Won't work as App and plant are in different package
  // System.out.println(plant.height);
	}

}
