package cursojava.executavel;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {
		
	    /*Main é um método auto executavel no JAVA*/
	    public static void main(String[] args) {
	        // TODO code application logic here
	    		        
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
	        		
    		
	        aluno1.nome = "Matheus";	        
	        System.out.println("O aluno está: "+aluno1.getSituacao());
	    }
}