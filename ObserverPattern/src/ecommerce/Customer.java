package ecommerce;

public class Customer implements ICustomer{
	private String notification;
	private String name;
	
	public Customer(String name) {
		this.name = name;
	}

	@Override
	public void notifyCustomer(Product prod, String shopName) {
		notification = "Hello " + this.name + ", we got a new product: " + prod.getName() + ". Come check in our store " + shopName;
		System.out.println(notification);
	}
	
}
