package fundamentos;

import java.util.Scanner;

public class console {
	public static void main(String[] args) {  
		
		System.out.print("bom");
		System.out.print(" dia!!!");
		
   Scanner entrada = new Scanner (System.in);
   
   System.out.print("Digite seu nome");
    String nome = entrada.nextLine();
    System.out.print("Digite seu sobrenome");
    String sobrenome = entrada.nextLine();
    System.out.println("\nNome = " + nome 
    		+ "" + sobrenome);
   
    
	}
}
