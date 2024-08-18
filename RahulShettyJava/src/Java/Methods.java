package Java;

public class Methods {
	
	public static void main(String[] args) {

		Methods d = new Methods();//method present in same class

		String name = d.getData();//catchin the return statement into name variable.

		System.out.println(name);

		anotherMethod d1 = new anotherMethod();//method present in another class

		d1.getUserData();

		getData2();//since method is static no need to create object
		
		}

		public String getData()
		
		{
		System.out.println ("hello world");

		return "rahul shetty";
		
		}

		public static String getData2()

		{

		System.out.println ("hello world");

		return "rahul shetty";

		}
		
		}

