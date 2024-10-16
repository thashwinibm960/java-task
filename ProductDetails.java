public class ProductDetails {
	

	public static void main(String[] args)
	{


		Product product = new Product("iphone 15","apple",1,100);
		Product product1 = new Product("nike air max 270","nike",2,50);
		Product product2 = new Product("sony bravia 55 4k tv","sony",3,40);
		Product product3 = new Product("dell xps 13 laptop","dell",4,90);
		Product product4 = new Product("whirloopl 265l","whirloop",5,70);
		Product product5 = new Product("sony bravia 55 8k tv","sony",6,40);

		Product product6 = new Product("iphone 12","apple",7,900);
       Product product7 = new Product("sony bravia","sony",8,40);
		Product product8 = new Product("dell12 laptop","dell",9,40);
		Product product9 = new Product("whirloopl 276l","whirloop",10,30);   



		product.displayProductDetails();
		product1.displayProductDetails();
		product2.displayProductDetails();
		product3.displayProductDetails();
		product4.displayProductDetails();
		product5.displayProductDetails();
		product6.displayProductDetails();




	}
}