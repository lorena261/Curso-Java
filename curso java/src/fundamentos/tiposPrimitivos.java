package fundamentos;

public class tiposPrimitivos {

  public static void main(String[] args) {
	// informações do funcionario 
	  
	  //tipos inteiros 
	  byte AnosDeEmpresa = 23;
	  short NumerosDeVoo = 542;
		int Id = 2345678;
		long PontosAcumulados = 3_187_321_160L;
		double VendasAcumuladas = 1_606_201_920.02;
		boolean EstaDeFerias = false;
	System.err.println(AnosDeEmpresa * 365);
				System.out.println(NumerosDeVoo / 2);
				System.out.println(PontosAcumulados / VendasAcumuladas);
				System.out.println("Ferias?" + EstaDeFerias);
}
}
