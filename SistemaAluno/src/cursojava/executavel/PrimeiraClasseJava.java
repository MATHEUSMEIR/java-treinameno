package cursojava.executavel;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {
		
	    /*Main é um método auto executavel no JAVA*/
	    public static void main(String[] args) {
	        // TODO code application logic here
	    	
	    	/*Processamento de dados e atribuição ao objeto*/
	        String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
	        int idade = JOptionPane.showInputDialog("Informe a idade");
		    String numeroCpf = JOptionPane.showInputDialog("Informe o CPF");
		    String nomePai = JOptionPane.showInputDialog("Informe nome do pai");
		    
		    /*
		     String nota1 = JOptionPane.showInputDialog("Informe a nota do 1° bimestre");
		     double nota2 = JOptionPane.showInputDialog("Informe a nota do 2° bimestre");
		     double nota3 = JOptionPane.showInputDialog("Informe a nota do 3° bimestre");
		     double nota4 = JOptionPane.showInputDialog("Informe a nota do 4° bimestre");
		    */ 

	    	//Objeto existe na memoria, instancia//
	    	cursojava.classes.Aluno aluno1 = new cursojava.classes.Aluno();
	        		
    		
	        aluno1.setNome (nome);
	        aluno1.setIdade(Integer.valueOf(idade));
	        aluno1.setNumeroCpf (numeroCpf);
	        aluno1.setNomePai (nomePai);
	        aluno1.setNota1 (Double.parseDouble(nota1));
	        aluno1.setNota2 (Double.parseDouble(nota2));
	        aluno1.setNota3 (Double.parseDouble(nota3));
	        aluno1.setNota4 (Double.parseDouble(nota4));
	        
	        //
	        System.out.println("O aluno: "+aluno1.getNome());
	        System.out.println("Idade: "+aluno1.getIdade());
	        System.out.println("Cpf:"+aluno1.getNumeroCpf());
	        System.out.println("Nome pai: "+aluno1.getNomePai());
	        System.out.println("");
	        System.out.println("Média final: "+aluno1.getMediaNota());
	        System.out.println("Está com situação final: "+aluno1.getSituacao());
	        System.out.println("toString: " + aluno1);
	        break;
	    }
}