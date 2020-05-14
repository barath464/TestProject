package inheritence;

public class Parent {
int id;
String name;

public void display() {
	System.out.println("id "+id+ " Name "+name);
}

public static void main(String[] args) {
	Parent child1 = new Child1();
	System.out.println(child1.id);
	child1.display();
}
}
