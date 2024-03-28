package Aula04;
import java.util.Scanner;


public class Desafio08 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("Digite um número de 1 a 12 correspondente aos meses do ano e veja a qual estação ele pertence: ");
		
		int numero = scanner.nextInt();
		
		String mes = " ";
		
		switch (numero) {
		
		case 12:
		case 1:
		case 2:
			mes = "Verão";
			break;
		
		case 3: 
		case 4:
		case 5:
			mes = "Outono";
			break;
			
		case 6:
		case 7:
		case 8:
			mes = "Inverno";
			break;
			
		case 9:
		case 10:
		case 11:
			mes = "Primavera";
			break;
			
		
		default:
		    mes = "Número inválido";
		    break;
			
		}
		
		
		System.out.println("O mês " + numero + " do ano tem como estação principal: " + mes);
		
		
	}
	
} 