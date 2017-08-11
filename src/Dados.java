import java.util.ArrayList;

public class Dados {
	
	ArrayList<Contato> contatos = new ArrayList<>();
	
	public void cadastraContato(Contato contato) {
		contatos.add(contato);
		
	}
	
	public String numeroDeContatos() {
		
		return contatos.size() + "";
	}
	
	

}
