package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import model.entities.Product;

public class ParaTestes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV",1800.0));
		list.add(new Product("Notebook",2000.0));
		list.add(new Product("Tablet",400.0));
		
		//cookies.remove("email");`
		
		Collections.sort(list);
		
		System.out.println("All cookies");
		for(Product key : list) {
			System.out.println(key);
		}
		
		sc.close();
	}
}
	