import java.util.ArrayList;

public class ListaDeContatos {

	public static void main(String[] args) {

/*
		ArrayList<String> contatos = new ArrayList<>();
		
		
		contatos.add("Cristiano");
		contatos.add("Gustavo");
		contatos.add("Maria");
		contatos.add("Gilberto");
		
		for (String nome : contatos) {
			System.out.println(nome);
		}
		*/
		
		ArrayList<Contato> contatos = new ArrayList<>();
		
		Contato contato1 = new Contato("Cristiano", "cristiano@teste.com.br", "00000000");
		Contato contato2 = new Contato("Gustavo", "gustavo@teste.com.br", "00000000");
		Contato contato3 = new Contato("Maria", "maria@teste.com.br", "00000000");
		Contato contato4 = new Contato("Gilberto", "gilberto@teste.com.br", "00000000");
		
		contatos.add(contato1);
		contatos.add(contato2);
		contatos.add(contato3);
		contatos.add(contato4);
		
		for (Contato c : contatos) {
			System.out.println(c.getNome());
		}
		
		System.out.println("Total de itens na lista " + contatos.size());
		
		contatos.remove(contato2);
		
		
		System.out.println(contatos.contains(contato2));
		
		
		

	}

}
