package Aula03;
import java.util.Scanner;

public class Exercicio02 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o nome da pessoa: ");
		String nome = scanner.nextLine();
		
		System.out.print("Digite o signo do " + nome + ": " );
		String signo = scanner.nextLine();  
		
		System.out.print("Digite a idade do " + nome + ": " );
		int idade = scanner.nextInt(); 
		
		
		
		System.out.println ("Seu nome é: " + nome + ", você tem: " + idade + " e seu signo é: " + signo );
		
		scanner.close();
		
			
	}

}
