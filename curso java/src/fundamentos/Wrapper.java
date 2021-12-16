package fundamentos;

import java.util.Scanner;

public class Wrapper {
	
public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);
	//Byte//
	Byte b = 100;
	Short s = 1000;
	Integer i = Integer.parseInt(entrada.
			next()); 
	// intereger é o primitivo do int, aqui to transformando o primitivo em string//
	Long l = 1000000L;
	System.out.println(b);
	System.out.println(i * 3);
	entrada.close();
}
}
