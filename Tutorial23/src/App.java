import java.util.Objects;

class Person{
	private int id;
	private String name;
	public Person(int id, String name) {
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return "Person[id "+id+" Name is "+name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Person person1=new Person(4,"Abhi");
   Person person2=new Person(4,"Abhi");
   System.out.println(person1==person2); //== compares whether the references variables are pointing to same object or not
   System.out.println(person1.equals(person2)); //.equals method compares the inner values of the object
	}

}
