package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoringasDelimitados {

	public static void main(String[] args) {

		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObj = new ArrayList<Object>();

		copy(myInts, myObj); // copiar lista Myints para myObj
		printList(myObj);
		copy(myDoubles, myObj);// Copiar lista Mydoubles para Myobj
		printList(myObj);
	}
	// instanciar copy

	public static void copy(List<? extends Number> source, List<? super Number> destiny) { 
		//Lista de Origem(source) qualquer tipo que extends Number e a lista Destiny qualquer Lista super de Number no caso Object
		//enviar dados para outra lista
		for(Number number : source) {
			destiny.add(number);
		}
	}
		  
	public static void printList(List<?> list) { //para qualquer lista (coringa)
		for(Object obj : list) {
			System.out.println(obj + " ");
		}
		System.out.println();
	}
}
