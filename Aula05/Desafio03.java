package Aula05;
import java.util.Scanner;

public class Desafio03 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite o nome de uma cidade: ");
	
	
	String cidade = scanner.nextLine();
	
	
	
	if (cidade.equals("Curitiba")) {
		System.out.println("Cidade certa");
		
	}
	
	else {
		System.out.println("Cidade errada");
	}
	
	
	scanner.close();
	
	


	}
	

}
