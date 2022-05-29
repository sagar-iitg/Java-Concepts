package finalkeyword;

public class Main {

	public static void main(String[] args) {
		final Customer c = new Customer();
		System.out.println(c.getName());
		c.setName("nan");
		System.out.println(c.getName());
	}
}
