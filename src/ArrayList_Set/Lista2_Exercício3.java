package ArrayList_Set;

import java.util.*;
import java.util.Iterator;
import java.util.Set;

public class Lista2_Exercício3 {

	public static void main(String[] args) {

		
		HashSet<Double> dados = new HashSet<Double>(); 
		
		dados.add(2.0); 
		dados.add(5.0);
		dados.add(1.0);
		dados.add(3.0); 
		dados.add(4.0);
		dados.add(9.0);
		dados.add(7.0);
		dados.add(8.0);
		dados.add(10.0);
		dados.add(6.0);
		
		System.out.println("\nListar os dados Set: ");
		
		for(Double dado: dados) {
		System.out.println(dados);
		 
		System.out.println("\nListar todos os dados Iterator: ");
		
		Iterator<Double> iterator = dados.iterator();
		
		while(iterator.hasNext()){
			   System.out.println(iterator.next());
			   
			}
			}
					
			
	}
}






