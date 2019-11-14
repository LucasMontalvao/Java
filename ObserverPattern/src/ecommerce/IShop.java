package ecommerce;

public interface IShop {
	void addCustomer(Customer cus);
	void desattachCustomer(Customer cus);
	void notifyCustomer(Product product);
}
