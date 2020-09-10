package application;

import java.util.Arrays;
import java.util.List;

public class Coringas {

	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5,2,10);//criando uma lista já com dados do tipo integer
		printList(myInts);
		
		List<String> myStr = Arrays.asList("Felipe","Arthur", "Ana Paula");
		
		printList(myStr);

	}

	public static void printList(List<?> list) { //sistema de impressão devererá ser coringa(?) para que a Lista receba qualquer tipo
		for(Object obj : list) {
			System.out.println(obj);
		}
	}
}
//Obs lista coringa não adiciona itens