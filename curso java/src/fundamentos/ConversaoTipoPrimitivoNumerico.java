package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
public static void main(String[] args) {
	
	double a = 1; //implicita
	System.out.println(a);
	
	float b =(float) 1.12345; // explícita (cast)
	System.out.println(b);
	
	int c = 4;
	byte d = (byte) c; // explicita (cast)
	System.out.println(d);
	
	double e = 1.9999;
	int f = (int) e;
	System.out.println(f);
}
}
