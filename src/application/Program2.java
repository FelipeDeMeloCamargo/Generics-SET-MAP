package application;

import java.util.Map;
import java.util.TreeMap;

public class Program2 {

	public static void main(String[] args) {

		Map<String, String> cookies = new TreeMap<>(); // tipo mais devagar porém ordenado pelo CopareTo

		cookies.put("username", "Maria"); // chave e valor
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "997112222");

		cookies.remove("email");
		cookies.put("phone", "992078203"); //o map validará que há um phone e sobre escreverá o anterior
		
		System.out.println("Contain 'phone' key " + cookies.containsKey("phone")); //existe a chave phone?
		System.out.println("Phone number " + cookies.get("phone")); //retorna phone
		System.out.println("Email: " + cookies.get("Email")); //retorna email se houver
		System.out.println("Size: " + cookies.size());

		System.out.println("All cookies:");
		for (String key : cookies.keySet()) {// impressao dos cookies
			System.out.println(key + ": " + cookies.get(key));
		}
	}

}
