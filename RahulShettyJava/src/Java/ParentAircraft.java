package Java;

public abstract class ParentAircraft {

	public void engine() {
		System.out.println("Follow Engine Guidelines");
	}

	public void safety() {
		System.out.println("Follow Safety Guidelines");
	}
	
	public abstract void colour();
}
