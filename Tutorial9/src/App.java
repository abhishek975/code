
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String info=""; //New string object is created  in heap every time, we are assigning info and it is not 
     //appending within the same string object
     info+="My name is";
     info+=" ";
     info+="Abhi";
     System.out.println(info);
     //To append within the same string object we have to use String Builder
     //String Builder objects are not thread safe
     StringBuilder s= new StringBuilder();
     s.append("Hi");
     s.append(" there.");
     s.append("My name is Abhi.").append(" I am a good boy");
     System.out.println(s);
     
	}

}
