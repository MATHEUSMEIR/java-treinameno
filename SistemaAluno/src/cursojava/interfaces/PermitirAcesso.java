package cursojava.interfaces;

//Interface para Autenticar
public interface PermitirAcesso {
	
	public boolean autenticar(String login, String senha);
	
	public boolean autenticar();
}