
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Plant plant1=new Plant();
   Tree tree=new Tree();
   Plant plant2 = tree;
   plant2.grow(); //grow() method of Tree class going to be executed because plant2 variable is pointing to 
   //object of Tree class.
 //  plant2.shreddingLeaves(); Won't work because plant2 is 'Plant' type of reference variable and 
   //we can only access methods which are defined in Plant class(or overridden in its sub class)
   
   
	}

}
