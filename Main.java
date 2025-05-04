package java8;

import java.util.ArrayList;
import java.util.Arrays;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product> products=new ArrayList<>(Arrays.asList
				(new Product(1001, "sugar", 44),
				new Product(8974,"salt", 22),
				new Product(3546, "pepper", 850),
	            new Product(4566,"Rice Bag", 1800),
	            new Product(1003, "coffee", 567),
	            new Product(1878,"cooking oil", 1768),
	            new Product(1008,"chocolate",90)));
//		Product ref=products.stream().filter(product->product.getProName().startsWith("Dukes")).findFirst()
//				.orElse(new Product(0, "No value can be returned because of nothing present", 0));
//products.stream().forEach(pro->System.out.println(pro));
//System.out.println("data after mapping");
//products.stream().
//map(pro->pro.getProPrice()+pro.getProPrice()*10/100)
//.forEach(pr->System.out.println(pr));

	}


}
