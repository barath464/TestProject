package inheritence;

public class Child1 extends Parent {
	
	int id=89;
	String address;
	
	public static void main(String[] args) {
		Parent child1 = new Child1();
		System.out.println(child1.id);
	}

	public Child1(int id, String address) {
		this.id = id;
		this.address = address;
	}
	
	public void display() {
		System.out.println("Child Display");
	}

	public Child1() {
		// TODO Auto-generated constructor stub
	}

}
