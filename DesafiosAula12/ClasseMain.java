
package DesafiosAula12;

import java.util.Scanner;

public class ClasseMain {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClasseEstoque estoque = new ClasseEstoque();
        
        boolean execucao = true;
        
        while(execucao) {
            System.out.println("\n Selecione uma opcao: \n");
            System.out.println(" 1 - Cadastrar item");
            System.out.println(" 2 - Listar itens");
            System.out.println(" 3 - Sair \n");
            
            int opcao = sc.nextInt();
            sc.nextLine();
            
            switch(opcao) {
                case 1 -> {
                    System.out.print("Nome do item: ");
                    String nome = sc.nextLine();
                    
                    System.out.print("Quantidade: ");
                    int quantidade = sc.nextInt();
                    
                    System.out.print("Preco: ");
                    double preco = sc.nextDouble();
                    
                    ClasseItem item = new ClasseItem(nome, quantidade, preco);
                    
                    estoque.adicionarItem(item);
                }
                case 2 -> estoque.listarItens();
                case 3 -> execucao = false;
                default -> System.out.println("Opcao invaida");
            }
        }
        
        sc.close();
    }
}
