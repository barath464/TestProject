package test;

public class InterfaceTest implements Interface1, Interface2 {
int firstInterface=65;
	@Override
	public void secondInterfaceMethod() {
		System.out.println(" secondInterfaceMethod executed");

	}

	@Override
	public void firstInterfaceMethod() {
		System.out.println(" firstInterfaceMethod executed");
	}
	
	public static void main(String[] args) {
		Interface1 test = new InterfaceTest();
		System.out.println(test.firstInterface);
	}

}
