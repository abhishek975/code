import ocean.Fish; //Importing fish class from ocean package
import ocean.plant.Algae;//Importing Algae class from ocean.plant package
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Fish fish=new Fish();
          Algae algae=new Algae();
          
        //  fish.name="Tino"; Not accessible as it is default access modifier
          fish.age=10;
          System.out.println(fish.age);
	}

}
