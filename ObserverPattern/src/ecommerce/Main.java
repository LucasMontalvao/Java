package ecommerce;

public class Main {

	public static void main(String[] args) {
		Shop Kabum = new Shop("Kabum");
		Customer cus1 = new Customer("Lucas");
		Customer cus2 = new Customer("Walter");
		Customer cus3 = new Customer("Ana");
		Product prod = new Product("Notebook 15' Acer", 4500, "Novo modelo de notebook da Acer, tela mais fina bla, bla, bla");
		
		Kabum.addCustomer(cus1);
		Kabum.addCustomer(cus2);
		Kabum.addCustomer(cus3);
		
		Kabum.addProduct(prod);
	}

}
