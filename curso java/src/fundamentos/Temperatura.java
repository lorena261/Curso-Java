package fundamentos;

public class Temperatura {
public static void main(String[] args) {
	//( �F - 32) x 5/9 = �c //
	int �F = 86;
	final int regulador = 32;
	final double multiplicador = 5/9.0;
	double �C = (�F - regulador) * multiplicador;
	System.out.println(�C + "�c");
}
}
