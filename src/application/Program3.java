package application;

import java.util.Scanner;

import model.entities.PrintService3;

public class Program3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PrintService3<String> ps = new PrintService3<>();//instanciado o objeto do tipo integer
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			String value = sc.next();
			ps.addValue(value);
		}	

		ps.print();
		System.out.println("First: " + ps.first());
			
			
		
		
		
		sc.close();

	}

}
