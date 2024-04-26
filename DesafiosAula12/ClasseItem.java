
package DesafiosAula12;

public class ClasseItem {
	public String nome;
    public int quantidade;
    public double preco;
    
    public ClasseItem(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
@Override
    public String toString() {
        return "Item: " + nome + " | Em estoque: " + quantidade + " | Preco: R$" + String.format("%.2f", preco);
    }
}

