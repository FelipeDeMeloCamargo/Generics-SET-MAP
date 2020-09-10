package application;

import java.util.Arrays;
import java.util.List;

public class Coringas {

	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5,2,10);//criando uma lista j� com dados do tipo integer
		printList(myInts);
		
		List<String> myStr = Arrays.asList("Felipe","Arthur", "Ana Paula");
		
		printList(myStr);

	}

	public static void printList(List<?> list) { //sistema de impress�o deverer� ser coringa(?) para que a Lista receba qualquer tipo
		for(Object obj : list) {
			System.out.println(obj);
		}
	}
}
//Obs lista coringa n�o adiciona itens