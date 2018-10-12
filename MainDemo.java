
public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoOverloading ob=new DemoOverloading();
		ob.test();
		ob.test(10);
		ob.test(10,20);
		double result=ob.test(123.2);
		System.out.println("ob.test(123.2):"+result);
	}

}
