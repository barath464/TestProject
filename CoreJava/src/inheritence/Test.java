package inheritence;

public class Test {
public static void main(String[] args) {
	String s = "Bharath";
	System.out.println(s.hashCode());
 s =s.concat("Reddy");
	System.out.println(s);
	System.out.println(s.hashCode());
	
	StringBuilder sb = new StringBuilder("Bharath");
	System.out.println(sb.hashCode());
	sb=sb.append("Reddy");
	System.out.println(sb.hashCode());
	System.out.println(sb);
	
	
	System.out.println("Git Test");
}

}
