package Java;

public class AustralianTrafic implements CentralTraffic,ContinentalTraffic { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Cannot create object of central traffic as it is an interface because it is an incomplete class 
//that contains only abstract methods without any implementation. Therefore, it cannot be instantiated directly..
//		
//CentralTraffic a= new CentralTrafic() is not allowed.
	CentralTraffic a= new AustralianTrafic();//AustralianTrafic object referring to CentralTraffic methods.
	a.redStop();
	a.FlashYellow();
	a.greenGo();

	AustralianTrafic at=new AustralianTrafic();//AustralianTrafic object referring to AustralianTraffic methods.
	at.walkonsymbol();
	//Cannot create object of continental traffic as it is an interface	
	//ContinentalTraffic ct=new ContinentalTrafic() is not allowed.
	ContinentalTraffic ct=new AustralianTrafic();//AustralianTrafic object referring to ContinentalTraffic methods.
	ct.Trainsymbol();


	}

	@Override
	public void redStop() {
	// TODO Auto-generated method stub
	System.out.println(" redstop implementation");
	}
	public void walkonsymbol()
	{
	System.out.println("walking");
	}
	@Override
	public void FlashYellow() {
	// TODO Auto-generated method stub
	System.out.println(" flash yellow implementation");
	//code
	}

	@Override
	public void greenGo() {
	// TODO Auto-generated method stub
	System.out.println(" Green go implementation");
	}

	@Override
	public void Trainsymbol() {
	// TODO Auto-generated method stub
		System.out.println(" Stop when train is passing");
}
}
