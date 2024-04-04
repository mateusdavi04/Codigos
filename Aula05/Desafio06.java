package Aula05;
import java.util.Scanner;

public class Desafio06 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite o primeiro nome: ");
	String nome1 = scanner.nextLine();
	
	System.out.println("Digite o segundo nome: ");
	String nome2 = scanner.nextLine();
	
	System.out.println("Digite o terceiro nome: ");
	String nome3 = scanner.nextLine();
	
	
	
    String maiorString = nome1; 

   
    if (nome2.length() > maiorString.length()) {
        maiorString = nome2;
    }

    if (nome3.length() > maiorString.length()) {
        maiorString = nome3;
    }

    System.out.println("A string com mais caracteres é: " + maiorString);

    scanner.close();
    
    
}
}

