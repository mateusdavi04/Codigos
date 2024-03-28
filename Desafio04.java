package Aula04;
import java.util.Scanner;

public class Desafio04 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número e veja se ele é positivo ou negativo: ");
		int num = scanner.nextInt();
		
		if (num > 0) {
			System.out.println("O número é positivo");
		}
		
		else if (num < 0 ) {
			System.out.println("O numero é negativo");
		}
		
	
		else {
		
			System.out.println("O número é 0");
			
				}
		
		scanner.close();
		
	}

}