package fundamentos;

public class Temperatura {
public static void main(String[] args) {
	//( ºF - 32) x 5/9 = ºc //
	int ºF = 86;
	final int regulador = 32;
	final double multiplicador = 5/9.0;
	double ºC = (ºF - regulador) * multiplicador;
	System.out.println(ºC + "ºc");
}
}
