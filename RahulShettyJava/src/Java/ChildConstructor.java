package Java;

public class ChildConstructor extends ParentConstructor{
	
	public ChildConstructor() {
		super();// calls parent class constuctor.Super should be the first line in constructor
		System.out.println("I am from child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildConstructor a= new ChildConstructor();
		
	}

}
