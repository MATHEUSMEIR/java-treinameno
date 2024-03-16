package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {

	/* Main é um método auto executavel no JAVA */
	public static void main(String[] args) {
		
		//Erro no Sistema entra aqui
		try {
		
		//Variavel de login e senha para usuario acessar o cóodigo
		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");
		
		//travar somente para quem for autorizado 
		//Condição para permitir acesso do secretário
		if(new FuncaoAutenticacao(new Secretario(login, senha)).autenticar()) { //if TRUE acesso liberado
				
		//Lista para junção dos alunos em um Array
        List<Aluno> alunos = new ArrayList<Aluno>();
        
        HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
        
        //loop de repetição para saber quantos alunos serão calculados
        for (int qtd = 1; qtd <= 1; qtd++){
	    
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
        
		/*Objeto Disciplina existe na memoria**/
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
        
        //adicionando aluno
        alunos.add(aluno1);
        }  
        
        maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
        maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
        maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
        
        //Situação do aluno separada por lista
        for (Aluno aluno : alunos) {
			if(aluno.getSituacao().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			}
			else if(aluno.getSituacao().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
			}
			else {
				maps.get(StatusAluno.REPROVADO).add(aluno);
			}
		}
        
        System.out.println("---------------ALUNOS APROVADOS------------------");
        for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
        System.out.println(aluno.getNome() + " ficou com situação final: "+ aluno.getSituacao() + " " + aluno.getMediaNota());
        }
        
        System.out.println("---------------ALUNOS RECUPERAÇÃO------------------");
        for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
        System.out.println(aluno.getNome() + " ficou com situação final: "+ aluno.getSituacao() + " " + aluno.getMediaNota());
        }
        
        System.out.println("---------------ALUNOS REPROVADOS------------------");
        for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
        System.out.println(aluno.getNome() + " ficou com situação final: "+ aluno.getSituacao() + " " + aluno.getMediaNota());
        }
      }
		//Caso o login ou senha esteja errado 
		else {
			JOptionPane.showMessageDialog(null, "Acesso Negado");
		}
		//Exception no Sistema
		}catch(Exception e) {

			StringBuilder saida = new StringBuilder(); 
			
			e.printStackTrace();//Imprime erro no console
			System.out.println("Menssagem ou causa do erro: " + e.getMessage());
			
			//For para mostrar Class, Metodo e Linha do erro
			for(int cont =0; cont <= e.getStackTrace().length; cont++) {
				saida.append("/n Class do erro: " + e.getStackTrace()[cont].getClassName());
				saida.append("/n Metodo do erro: " + e.getStackTrace()[cont].getMethodName());
				saida.append("/n Linha do erro: " + e.getStackTrace()[cont].getLineNumber());
				saida.append("/n Nome do erro: " + e.getClass().getName());
			}
			
			JOptionPane.showMessageDialog(null, saida.toString());
		}
	}
}