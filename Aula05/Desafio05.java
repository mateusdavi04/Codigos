package Aula05;
import java.util.Scanner;

public class Desafio05 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite a sua nota do primeiro bimestre: ");
	double nota1 = scanner.nextFloat();
	
	
	System.out.println("Digite a sua nota do segundo bimestre: ");
	double nota2 = scanner.nextFloat();
	
	
	double media = (nota1 + nota2) / 2;
	
	String valorFormatado = String.format("%.2f", media);
	
	
	System.out.println("Sua media final é: " + valorFormatado );
	
	
	
	
	scanner.close();
	
	

	}
	

}
