package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PrimeiraClasseJava {

	/* Main é um método auto executavel no JAVA */
	public static void main(String[] args) {
		// TODO code application logic here
		
		//Lista para junção dos alunos em um Array
        List<Aluno> alunos = new ArrayList<Aluno>();
        
        for (int qtd = 1; qtd <= 2; qtd++){
	    
	    /* Processamento de dados e atribuição ao objeto */
	    String nome = JOptionPane.showInputDialog("Qual o nome do aluno "+qtd+"? ");
	    String idade =JOptionPane.showInputDialog("Qual a idade? ");
	    String numeroCpf = JOptionPane.showInputDialog("Qual o número de CPF? ");
	    String nomePai = JOptionPane.showInputDialog("Qual o nome do pai? ");
	    
		// Objeto existe na memoria, instancia//
		cursojava.classes.Aluno aluno1 = new cursojava.classes.Aluno();

		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setNumeroCpf(numeroCpf);
		aluno1.setNomePai(nomePai);
		
		//Quantidade de disciplina que sera inserido
        for(int cont = 1; cont < 3; cont++){
            
        String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+cont+": ");
        String notaDisciplina = JOptionPane.showInputDialog("Nota obtida "+cont+": ");
		/*Objeto existe na memoria**/
        Disciplina disciplina = new Disciplina();
     
        disciplina.setDisciplina(nomeDisciplina);
        disciplina.setNota(Double.parseDouble(notaDisciplina));
          
        aluno1.getDisciplinas().add(disciplina);
        }

       //Escolha para remover alguma disciplina 
       int escolha = JOptionPane.showConfirmDialog(null, "Desseja remover alguma disciplina?");
        
        if(escolha == 0){
            int continarRemover = 0;
            int cont = 1;
        
            while(continarRemover == 0){
       
        	
             String disciplinaRemove = JOptionPane.showInputDialog("Qual disciplina deseja remover?");
             aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemove).intValue()-cont);
             cont++;
             continarRemover = JOptionPane.showConfirmDialog(null,"Deseja remover outra disciplina?");
            }
        }
        
        
        alunos.add(aluno1);
        }        
            
        for (Aluno aluno : alunos){
        	
        if(aluno.getNome().equalsIgnoreCase("Matheus")){
	    alunos.remove(aluno);
	    break;
		    }else{
		    	/*Devolução de dados*/            
				System.out.println("O aluno: " + aluno.getNome());
				System.out.println("Idade: " + aluno.getIdade());
				System.out.println("Cpf:" + aluno.getNumeroCpf());
				System.out.println("Nome pai: " + aluno.getNomePai());
				System.out.println("Média final: " + aluno.getMediaNota());
				System.out.println("Está com situação final: " + aluno.getSituacao());
				System.out.println("toString: " + aluno);
		        System.out.println("disciplinas " + aluno.getDisciplinas());
			  }
	    }
        
        for (Aluno aluno : alunos){
        	
        	System.out.println("Alunos que sobraram na lisa");
        	System.out.println(aluno.getMediaNota());
        	System.out.println("Suas materias são:");
        	
        	for (Disciplina disciplina : aluno.getDisciplinas()) {
        		System.out.println(disciplina.getDisciplina());
        	}        	
        }
	}
}