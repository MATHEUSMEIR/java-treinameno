package cursojava.classes;

	//lasse que representa o aluno e seus dados
	public class Aluno {
	
		 //atributos do aluno
		 public String nome;
	     public int idade;
	     public String numeroCpf;
	     public String nomePai;
	     private double nota1;
	     private double nota2;
	     private double nota3;
	     private double nota4; 
	     
	     //Criar os dados na memoria sando padrão do JAVA
	     //Construtor com parâmetros, objetos para o JAVA
	     //Instancia
	     
		 public Aluno() {
		 // TODO Auto-generated constructor stub
		 }
			
	     public Aluno(String nomePadrao, int idadePadrao, String numeroCpfPadrao, String nomePaiPadrao) {
	    	 nome = nomePadrao;
	    	 idade = idadePadrao; 
	    	 numeroCpf = numeroCpfPadrao;
	    	 nomePai = nomePaiPadrao; 
	     }
	     
	     //Métodos SETTERS e GETTERS do objeto
	    	     
	     /*SET é para adicionar ou receber os dados para os atributos*/
	     public void setNome(String nome) {
	    	 this.nome = nome;
	     }
	     /*GET é para resgatar ou obter o valor do atributo*/
	     public String getNome() {
	    	 return nome;	 
	     }
	     
	     public void setIdade(int idade) {
	    	 this.idade = idade;
	     }
	     
	     public int getIdade() {
	    	 return idade;	 
	     }
	     
	     public void setNumeroCpf(String numeroCpf) {
	    	 this.numeroCpf = numeroCpf;
	     }
	     
	     public String getNumeroCpf() {
	    	 return numeroCpf;	 
	     }
	     
	     public void setNomePai(String nomePai) {
	    	 this.nomePai = nomePai;
	     }
	     
	     public String getNomePai() {
	    	 return nomePai;	 
	     }

		public double getNota1() {
			return nota1;
		}

		public void setNota1(double nota1) {
			this.nota1 = nota1;
		}

		public double getNota2() {
			return nota2;
		}

		public void setNota2(double nota2) {
			this.nota2 = nota2;
		}

		public double getNota3() {
			return nota3;
		}

		public void setNota3(double nota3) {
			this.nota3 = nota3;
		}

		public double getNota4() {
			return nota4;
		}

		public void setNota4(double nota4) {
			this.nota4 = nota4;
		}
     
		//Método para retornar média do aluno
		public double getMediaNota() {
			return (nota1 + nota2 + nota3 + nota4)/4;
		}
		
		public String getSituacao() {
			double media = this.getMediaNota();
			if (media >= 7.0) {
	        	return "Aprovado";
	        } else if (media >= 6.0) {
	        	return "Recuperação";
	        } else {
	        	return "Reprovado";
	        }
	    }
}	