
class Plant{
	public static final int ID=7; //When we want to make class variables visible to outside world then
	//we should make it final so that no other class can change the working of this class
	private String name; //Always make class variables private
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getData() {
		String data="some stuff "+calculateGrowthForecast();
		return data;
	}
	private int calculateGrowthForecast() {
		return 9;
	}
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
