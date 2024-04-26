
package DesafiosAula12;

import java.util.ArrayList;
import java.util.List;

public class ClasseEstoque {

	 public List<ClasseItem> itens = new ArrayList<>();
	    
	    public ClasseEstoque() {}
	    
	    public void adicionarItem(ClasseItem item) {
	        itens.add(item);
	    }
	    
	    public void listarItens() {
	        if(itens.isEmpty()) {
	            System.out.println("Estoque vazio.");
	        } else {
	            System.out.println("\n Itens em estoque:");
	            for(var item: itens) {
	                System.out.println(" - " + item.toString());
	            }
	        }
	    }
	}
