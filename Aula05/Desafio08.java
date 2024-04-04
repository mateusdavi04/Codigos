package Aula05;

public class Desafio08 {

	public static void main(String[] args) {
		
		int[] numeros = { 8, 13, 24, 30, 63 };
		int soma = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
			
		}

		System.out.print("O resultado é: " + soma);
	}

}