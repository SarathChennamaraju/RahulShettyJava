package Java;
import Java.ParentAircraft;
public class Abstraction extends ParentAircraft{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Abstraction a = new Abstraction();
     a.colour();
     a.engine();
     a.safety();
     
  //   ParentAircraft b = new ParentAircraft(); 
  //   We will not be able to create objects of abstract classes because it is an incomplete class 
//that contains abstract methods without any implementation. Therefore, it cannot be instantiated directly..
	ParentAircraft c = new Abstraction();
	c.safety();
	}	
	@Override //Method overriding of abstract method
	public void colour()  {
		// TODO Auto-generated method stub
		System.out.println("Add Red colour");
	}
	@Override //Method overriding of non-abstract method
    public void engine() {
    	System.out.println("Child class engine");
    	super.engine();
    }
}
