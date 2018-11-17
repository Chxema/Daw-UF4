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

	public static boolean primo (int valor) { 
               boolean rest;
	       int cont=0;
	       for (int x=1;x<=valor;x++){
		       if (valor%x==0){
			       cont++;
	               }
	       }
	       if (cont==2) return 1;
	       return 0;
	}   
	
	public static double factorial(int valor) {
		double resultado=1;
		for (int i=valor;i>=1;i--) {
			resultado=resultado*i;
		}
		return resultado;
	}
}
