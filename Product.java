public class Product{
	  
	  String product_name;
	  String product_brand;
	  int product_id;
	  int total_no_products;


	  public Product()
	  {
	  	System.out.println("no parmtzed constructor");
	  }

	  public Product(String productname,String product_brand,int product_id,int total_no_products)
	  {
         this.product_name = product_name;
         this.product_brand = product_brand;
         this.product_id = product_id;
         this.total_no_products = total_no_products;
	  }

	  

	  public void displayDetails() { 
        System.out.println("product name: " + product_name);
        System.out.println("product brand: " + product_brand);
        System.out.println("product id: " + product_id);
        System.out.println("total_no_products: " + total_no_products);
    }
}