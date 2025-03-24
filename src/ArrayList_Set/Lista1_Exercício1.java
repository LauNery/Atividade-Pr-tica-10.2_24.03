package ArrayList_Set;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista1_Exercício1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	    ArrayList<String> cores = new ArrayList<>();
	    
	    for(int i = 0; i < 5; i++);
	    System.out.println("Digite a primeira cor: ");
	    cores.add(scanner.nextLine());
	    
	    cores.add("Azul");
	    cores.add("Verde");
	    cores.add("Amarelo");
	    cores.add("Vermelho");
	    cores.add("Laranja");
	    
	    System.out.println(cores);
	
	    for(String cor: cores) {
			System.out.println(cor);	
		}
	   cores.sort(null);
	   
	   System.out.println("_______________________");
		for(String cor: cores) {
		    System.out.println(cor);
		} 
		System.out.println("Digite a cor: ");
		System.out.println("A posição da cor é: " + cores.indexOf(scanner.nextLine()));

}
}






