package eg1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ProductMain {

	public static  void main(String[] args) {
		
		
		
		List<Product> productList = new ArrayList<>();
		
		productList.add(new Product(10, "Louis philipee", "cloth",5201,true));
		productList.add(new Product( 11, "Addidas", "shoes",5200, false));
		productList.add(new Product(12, "RED Lebel", "grocery",2100, false));
		productList.add(new Product(13, "Raymond", "cloth", 3100,true));
		productList.add(new Product(14, "Campus", "shoes",1500, true));
		
		System.out.println("Printing all the product");
		printProductList(productList);
		
	
		
	}

	private static void printProductList(List<Product> productList) {
	
	for(Product material:productList) {
		System.out.println(material);
	}
		
	
		}
	}
	
