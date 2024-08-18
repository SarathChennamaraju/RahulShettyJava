package Java;

public class ChildClass extends ParentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ChildClass a = new ChildClass();
   a.Brakes();
   a.engine();
   a.engine(5);
   a.engine("started");
   a.Gear();
   
   ParentClass b = new ParentClass();
   b.Brakes();
   b.Gear();
   }
//Here we can make objects of both classes unlike interfaces or abstract classes.
//Multiple inheritance is not possible and can be achieved only through interfaces.
/*For Method Overloading,
	1.Either the argument data type should be different.
	2.Or argument count should be different.
	*/
	public void engine() {
		System.out.println("Engine is implemented");
	}
	public void engine(int a)//Method Overloading with different argument count
	{
		System.out.println("Engine is implemented with one parameter"+" "+a);
	}
	public void engine(String a) {//Method overloading with different argument data type.
		System.out.println("Engine is "+a);
	}
	@Override      //Method overriding 
	public void Brakes() {
		System.out.println("Child class brakes is implemented");
	}
	@Override
	public void Gear() {
		System.out.println("Child Class Gear is implemented");
	}
}
