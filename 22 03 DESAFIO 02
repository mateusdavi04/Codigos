package Aula04;
import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua altura em metros: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite o seu sexo (M para masculino e F para feminino): ");
        char sexo = scanner.next().charAt(0);

        double pesoideal = 0; 

        if (sexo == 'M' ) {
            pesoideal = 72.7 * altura - 58;
        } 
        else if (sexo == 'F' ) {
            pesoideal = 62.1 * altura - 44.7;
        } 
        else {
            System.out.println("Sexo não reconhecido.");
        }

        if (pesoideal != 0) {
            System.out.println("Seu peso ideal é: " + pesoideal + " kg");
        }
    }
}
