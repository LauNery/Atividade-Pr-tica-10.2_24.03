package ArrayList_Set;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista1_Exercício1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	    ArrayList<String> cores = new ArrayList<>();
	    
	    for(int i = 1; i <= 5; i++) {
	    System.out.println("Digite a " + i + "ª cor");
	    cores.add(scanner.nextLine());
	    } 
	
	    for(String cor: cores) {
			System.out.println(cor);	
		}
	   cores.sort(null);
	   
	   System.out.println("_______________________");
		for(String cor: cores) {
		    System.out.println(cor);
		    
		} 

}
}







