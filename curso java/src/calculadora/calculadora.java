package calculadora;

import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// Saldo do salario//
		System.out.println("Qual o mes da demiss�o?:");
		Integer mes = Integer.parseInt(entrada.next());
		System.out.println("Qual o dia da demiss�o?:");
		Integer diasTrabalhados = Integer.parseInt(entrada.next());
		System.out.println("Qual seu ultimo salario?:");
		Integer salario = Integer.parseInt(entrada.next());
		
		// salario diario//
		double sD = salario / 30;
		double saldo = sD * diasTrabalhados;
		System.out.println("Saldo a receber:" + saldo);

		// decimo terceiro//
		double Dt = (salario / 12) * mes;
		System.out.println("D�cimo a receber:" + Dt);
		entrada.close();
		
		//f�rias//
		double valorProporcional = (salario / 12) * mes;
		double abono = valorProporcional / 3;
		double ferias = valorProporcional + abono;
		System.out.println("f�rias a receber:" + ferias);
		
		// rescis�o//
		
		double rescisao = ferias + Dt + saldo;
		System.out.println("total a receber pela rescis�o:" 
		+ rescisao);
	}
	

}
