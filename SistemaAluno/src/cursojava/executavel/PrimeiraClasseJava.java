package cursojava.executavel;


	public class PrimeiraClasseJava {
		
	    /*Main é um método auto executavel no JAVA*/
	    public static void main(String[] args) {
	        // TODO code application logic here
	    		        
	        /*Objeto existe na memoria, instancia **/
	    	
	        cursojava.classes.Aluno aluno1 = new cursojava.classes.Aluno();
	        aluno1.nome = "Matheus";	        
	        System.out.println("O aluno está: "+aluno1.getSituacao());
	    }
}