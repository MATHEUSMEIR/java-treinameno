package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso{

	private String registro;
	private String nivelCargo;
	private String experiencia;
	private String login;
	private String senha;
	
	public Secretario(String login, String senha) {
		this.login = login;
		this.senha = senha; 
	}
	
	public Secretario() {
	}
	
	//SET E GET
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	
	//to string
	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia + "]";
	}
	
	@Override 
	public double Salario() {
		return 1800.80 * 0.9;
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