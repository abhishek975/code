package world;

public class Plant {
	//Bad Practice because we should hide the instance variable from outside world
   public String name;
   //Acceptable Practice because we have made it constant so no one can change it
   public final static int ID=8;
   
   private String type;
   protected String size;
   int height;
   public Plant() {
	   this.name="Freddy";
	   this.type="plant";
	   this.size="medium";
	   this.height=8;
   }
}
