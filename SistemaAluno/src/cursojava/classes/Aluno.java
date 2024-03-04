package cursojava.classes;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

import cursojava.constantes.StatusAluno;
import cursojava.classes.Disciplina;

//classe que representa o aluno e seus dados
public class Aluno extends Pessoa{

	// atributos do aluno
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatricula;
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public int getNumDisciplina;

	// Criar os dados na memoria sando padrão do JAVA
	// Construtor com parâmetros, objetos para o JAVA
	// Instancia

	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public Aluno(String nomePadrao, int idadePadrao, String numeroCpfPadrao, String nomePaiPadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
		numeroCpf = numeroCpfPadrao;
		nomePai = nomePaiPadrao;
	}

	// metodos SET e GET da disciplina
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	// Métodos SETTERS e GETTERS da super classe

	/* SET é para adicionar ou receber os dados para os atributos */
	public void setNome(String nome) {
		super.nome = nome;
	}

	/* GET é para resgatar ou obter o valor do atributo */
	public String getNome() {
		return nome;
	}

	public void setIdade(int idade) {
		super.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public void setNumeroCpf(String numeroCpf) {
		super.numeroCpf = numeroCpf;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNomePai(String nomePai) {
		super.nomePai = nomePai;
	}

	public String getNomePai() {
		return nomePai;
	}
	
	//SET E GET do objeto atual dentro da classe
	  public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatricula() {
		return serieMatricula;
	}

	public void setSerieMatricula(String serieMatricula) {
		this.serieMatricula = serieMatricula;
	}
	
	// Método para retornar média do aluno
	
	  public double getMediaNota() { 
	 	double somaNota = 0.0;
	  	for (Disciplina disciplina : disciplinas) {
		 		 somaNota += disciplina.getNota();
	  	}
	 
	 return somaNota / disciplinas.size();
	 
	 }

	public String getSituacao() { double media = this.getMediaNota(); 
	  if (media >= 7.0) 
	  	{ return StatusAluno.APROVADO; } 
	  else if (media >= 6.0) 
	  	{ return StatusAluno.RECUPERACAO;} 
	  else 
	  	{ return StatusAluno.REPROVADO; } 
	  }
	 

	@Override
	public int hashCode() {
		return Objects.hash(nome, numeroCpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(numeroCpf, other.numeroCpf);
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", numeroCpf=" + numeroCpf + ", nomePai=" + nomePai + "]";
	}

	public void setNumDisciplina(Integer valueOf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double Salario() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}