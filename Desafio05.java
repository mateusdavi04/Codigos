package Aula04;
import java.util.Scanner;

public class Desafio05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número e veja se ele é par ou ímpar: ");
		
		int num = scanner.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("O número é par");
		}
		
		
	
		else {
		
			System.out.println("O número é ímpar");
			
				}
		
		scanner.close();
		
	}

}
