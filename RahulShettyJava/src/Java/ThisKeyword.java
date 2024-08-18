package Java;

public class ThisKeyword {
	int a = 2;

	public void getData() {
		int a = 3;
		System.out.println(a);
		System.out.println(this.a);
		// this refers to current object - object scope lies in class level.
		//super vs this
		//super brings the value from parent class while this bring data belonging to current class.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword th = new ThisKeyword();
		th.getData();
	}

}
