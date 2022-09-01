import java.util.Locale;
import java.util.Scanner;

public class mediaponderada {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/**
		 * Nota A tem peso 3.5
		 * Nota B tem peso 7.5
		 * SOMA DOS PESOS 11
     * Imprimir 5 casas decimais após o ponto
		 * */
     
		double x, y, media;

		x = sc.nextDouble();
		y = sc.nextDouble();
		media = (x * 3.5 + y * 7.5) / 11.0;
		
	System.out.printf("MEDIA = %.5f\n", media);

	sc.close();
	  }
}
