public class ProductDetails {
	

	public static void main(String[] args)
	{


		Product product = new Product("Galaxy S23", "Samsung", 1, 120);
		Product product1 = new Product("Air Jordan 1", "Nike", 2, 80);
		Product product2 = new Product("LG OLED 65 inch TV", "LG", 3, 30);
		Product product3 = new Product("HP Spectre x360", "HP", 4, 95);
		Product product4 = new Product("Whirlpool 300L Fridge", "Whirlpool", 5, 60);
		Product product5 = new Product("Sony Bravia 65 4K TV", "Sony", 6, 45);

		Product product6 = new Product("iphone 12","apple",7,900);
        Product product7 = new Product("sony bravia","sony",8,40);
		Product product8 = new Product("dell12 laptop","dell",9,40);
		Product product9 = new Product("whirloopl 276l","whirloop",10,30);   



		product.displayDetails();
		product1.displayDetails();
		product2.displayDetails();
		product3.displayDetails();
		product4.displayDetails();
		product5.displayDetails();
		product6.displayDetails();




	}
}