package world;

public class Oak extends Plant {
   public Oak()
   {  //Won't work --> type is private
	  // type="tree";
	   //This works because size is protected and Oak is subclass
	   this.size="Large";
	   //Default access specifier . This works because Oak and plant are in same package
	   this.height=10;
   }	
}
