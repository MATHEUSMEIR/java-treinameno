package cursojava.executavel;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {

	/* Main é um método auto executavel no JAVA */
	public static void main(String[] args) {
		// TODO code application logic here

		/* Processamento de dados e atribuição ao objeto */
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Informe a idade");
		String numeroCpf = JOptionPane.showInputDialog("Informe o CPF");
		String nomePai = JOptionPane.showInputDialog("Informe nome do pai");
		
		// Objeto existe na memoria, instancia//
		cursojava.classes.Aluno aluno1 = new cursojava.classes.Aluno();

		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setNumeroCpf(numeroCpf);
		aluno1.setNomePai(nomePai);
		
		//Quantidade de disciplina que sera inserido
        for(int cont = 1; cont <= 4; cont++){
            
        String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+cont+": ");
        String notaDisciplina = JOptionPane.showInputDialog("Nota obtida "+cont+": ");
        
		/*Objeto existe na memoria**/
        Disciplina disciplina = new Disciplina();
     
        disciplina.setDisciplina("nomeDisciplina");
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
             aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemove).intValue()-1);
             cont ++;
             continarRemover = JOptionPane.showConfirmDialog(null,"Deseja remover outra disciplina?");
            }
        
		System.out.println("O aluno: " + aluno1.getNome());
		System.out.println("Idade: " + aluno1.getIdade());
		System.out.println("Cpf:" + aluno1.getNumeroCpf());
		System.out.println("Nome pai: " + aluno1.getNomePai());
		System.out.println("Média final: " + aluno1.getMediaNota());
		System.out.println("Está com situação final: " + aluno1.getSituacao());
		System.out.println("toString: " + aluno1);
	}
}