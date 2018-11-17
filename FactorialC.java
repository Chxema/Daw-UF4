package factorial.jar;

import java.util.Scanner;

public class FactorialC {

	public static void main(String[] args) {
		int numero=0;
		double resultado=0;
		Scanner lector = new Scanner(System.in);
		System.out.print("Dime un número: ");
		numero=lector.nextInt();
		lector.close();
		if (numero>=0) {
			if (numero==0) {
				System.out.println("El factorial de: "+numero+" es "+1);
			}else {
				resultado=factorial(numero);
				System.out.println("El factorial de: "+numero+" es "+(int)resultado);
			}
		}
	}

	
	public static double factorial(int valor) {
		double resultado=1;
		for (int i=valor;i>=1;i--) {
			resultado=resultado*i;
		}
		return resultado;
	}
}
