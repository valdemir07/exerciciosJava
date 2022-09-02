/**
Exercicio - Calculo Área do Círculo
area = n.raio²

n = 3.14159 | Imprimir resultado com 4 casas decimais após o ponto decimal
*/

package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner (System.in); 
		
double raio, area, n;
		
	raio = sc.nextFloat();
	n = 3.14159;
      
	area = n * (Math.pow(raio,2)); //area = n * (raio * raio);

System.out.printf ("A = %.4f\n", area);
sc.close();
	}
}
