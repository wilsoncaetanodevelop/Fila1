package mained;

import java.util.Scanner;

public class Main {
    
	public static Pessoa obteerPessoa() {
            
            Scanner sc = new Scanner(System.in);
            
		Pessoa pessoa = new Pessoa();
                
		String aux;
                
		System.out.print("Informe o nome : ");
		aux = sc.nextLine();
		pessoa.setNome(aux);
                
		System.out.print("Informe a Matricula : ");
		aux = sc.nextLine();
		pessoa.setMatricula(aux);
                
		System.out.print("Informe o telefone : ");
		aux = sc.nextLine();
		pessoa.setTelefone(aux);
                
                
		return pessoa;
		
	}
	public static void Menu () {
            
		System.out.println("");
		System.out.println("Digite 1 para 'ENFILEIRAR'");
		System.out.println("Digite 2 para 'DESENFILEIRAR'");
		System.out.println("Digite 3 para 'ENCERRAR'");
		
		
	}
	public static void main(String[] args) {
            
            Scanner sc = new Scanner (System.in);
            
		fila fila = new fila();
		Pessoa pessoa = obteerPessoa();
                
		int opcao;
		

	do {

		System.out.println("Informe o tamanho do Vetor : ");
		fila.setTamanho(opcao=sc.nextInt());
		
	} while (fila.setTamanho(opcao) != true);
		
		
		
		do {
			Menu();
			opcao = sc.nextInt();
			
			switch (opcao) {
			case  1:
				System.out.println(fila.enfileirar(pessoa)); 
				break;
			case 2:
				System.out.println(fila.desenfileirar()); 
				break;
				
				
			
			}
			
		}
                while(opcao != 3);
		
		
		
	}

}
