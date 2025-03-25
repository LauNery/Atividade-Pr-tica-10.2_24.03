package ArrayList_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class Lista2_Exercício3 {

	public static void main(String[] args) {

		HashSet<Integer> dados = new HashSet<Integer>();

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número: ");

			dados.add(scanner.nextInt());
		}

		System.out.println("\nListar os dados Set: ");

		Iterator<Integer> iterator = dados.iterator();

		while (iterator.hasNext()) {  
			System.out.println(iterator.next());

		}
		scanner.close();
	}
}
