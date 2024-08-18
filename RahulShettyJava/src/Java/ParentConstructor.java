package Java;

public class ParentConstructor {
	String name;//instance variable
	String address;//instance variable
	static String city = "Bangalore";//instance and static variable.
	//static variables are called as class variables.
	
	//public ParentConstructor(String name, String address, String city) { 
		//parameters inside cunstructors are local variables.
	public ParentConstructor(String name, String address) { 
		//super();
		this.name = name;
		this.address = address;
		System.out.println(name + " " +address+ " " + city);
	}

	public ParentConstructor() {
		System.out.println("I am from parent class constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentConstructor a= new ParentConstructor("Sarath","Banashankari");
		
	}
}
