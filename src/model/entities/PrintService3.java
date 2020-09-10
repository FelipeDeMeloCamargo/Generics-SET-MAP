package model.entities;

import java.util.ArrayList;
import java.util.List;

public class PrintService3<T> { //generics. Tipo gen�rico 

	List<T> list = new ArrayList<>();//instanciei uma lista do tipo integer
	
	public void addValue(T value) {
		list.add(value);
	}
	
	public T first() {
		if(list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		//sen�o
		return list.get(0);//retornar� posicao 0
	}
	
	public void print() {
		System.out.print("[");
		if(!list.isEmpty()) { //se lista n�o estiver vazio fa�a
			System.out.print(list.get(0));//imprimir primeiro da lista	
		}
		for (int i=1; i<list.size();i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
	}
}
