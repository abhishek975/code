import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class App {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
 String filename="document.txt";
 
 File textfile=new File(filename);   //Reading file
 Scanner in = new Scanner(textfile);
 int value= in.nextInt();
 while(in.hasNextLine()) {
	 String line= in.nextLine();
	 System.out.println(line);
 }
		 in.close();
	}

}
