/**
Exercicio 1008: 
Meu Perfil: https://www.beecrowd.com.br/judge/pt/profile/716734
*/

import java.util.Locale;
import java.util.Scanner;

//Classe precisa ser alterada para 'Main' no beecrowd!
public class SalarioUri1008 { 

public static <Scaner> void main(String[] args) {
		
	  Locale.setDefault(Locale.US);
	  Scanner sc = new Scanner(System.in);
		
		    int Nfuncionario, Htrabalho;
		    float Vhora, Sal;
		
		    Nfuncionario = sc.nextInt();
		    Htrabalho = sc.nextInt();
		    Vhora = sc.nextFloat();
		
	      Sal = (Htrabalho * Vhora);
		
	    System.out.println("NUMBER = " + Nfuncionario);
	    System.out.printf("SALARY = U$ %.2f\n", Sal);
			
	sc.close();
	} 

}
