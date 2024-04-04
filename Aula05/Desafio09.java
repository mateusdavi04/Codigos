package Aula05;

import java.util.Random;

public class Desafio09 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		Aluno[] alunos = new Aluno[3];
		
		for(int i = 0; i < alunos.length; i++) {
			alunos[i] = new Aluno("Aluno " + i, (double) i * random.nextInt(20 - 10) + 20, (double) i * random.nextInt(30 - 10) + 30);
			
			System.out.println("Aluno " + alunos[i].nome + ": media = " + alunos[i].media());
			
		}
		

	}

}

	class Aluno {
		public String nome;
		public double nota1;
		public double nota2;
		
		public Aluno(String nome, double nota1, double nota2) {
			
			this.nome = nome;
			this.nota1 = nota1;
			this.nota2 = nota2;
			
		}
		
		public double media() {
			return (this.nota1 + this.nota2) / 2;
			
		}
		
		public double getNota1() {
			return nota1;
		}
	}