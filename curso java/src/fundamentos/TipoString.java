package fundamentos;

public class TipoString {

 public static void main(String[] args) {
	System.out.println(" ola pessoal".charAt(0));
	
  String s = "boa tarde";
  System.out.println(s.concat("!!!"));
  System.out.println(s + "!!!");
  System.out.println(s.startsWith("boa"));
  
  var nome = "Lorena";
  var sobrenome = "serafim";
  var idade = 20;
  var salario = 8740;
  
  System.out.printf("O senhor %s %s tem %d.",
 		 nome, sobrenome, idade);
}
}

		