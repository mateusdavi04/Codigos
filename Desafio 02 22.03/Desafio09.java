package Aula04;
import java.util.Scanner;

public class Desafio09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int valor = 24;
		
		int numero;
		
		do {
			System.out.println("Digite um numero de 1 a 100: ");
			numero = scanner.nextInt();
			scanner.nextLine();
		if (numero < valor) {
			System.out.println("O valor é maior que o numero escohido.");
		}
			else if (numero > valor) {
		System.out.println("O valor é menor que o numero escolhido.");
			}
			
		} while (numero != valor);
		
		System.out.println("O número esta correto!! O valor é :" + valor);
		
	}
	
	
	
}
