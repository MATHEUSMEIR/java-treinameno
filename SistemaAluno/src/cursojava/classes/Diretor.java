package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

public class Diretor extends Pessoa implements PermitirAcesso{

	private String registroEducacao;
	private String tempoDirecao;
	private String titulacao;
	private String login;
	private String senha;
	
	public Diretor(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	public Diretor(){
	}
	
	//SET E GET
	public String getRegistroEducacao() {
		return registroEducacao;
	}
	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	public String getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(String tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
		
	//to string 
	}
	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + "]";
	}
	@Override
	public double Salario() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public boolean autenticar(String login, String senha) {
		this.login = login;
		this.senha = senha;
		return autenticar();
	}
	
	//Método que permite o acesso apos a auticação caso a senha e login esteja corrreto
	@Override
	public boolean autenticar() {
		return login.equals("admin") && senha.equals("admin");
	}
}
