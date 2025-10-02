package situacaoProblema;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		Usuario user1 = new Aluno(1, "Vinicius", "vinicius@gmail.com");
		Usuario user2 = new Aluno(2, "Ryan", "ryan@gmail.com");
		Usuario user3 = new Professor(3, "Fiama", "fiama@gmail.com");
		
		Livro book1 = new Livro(123, "Duna", "Frank Herbert", true);
		Livro book2 = new Livro(456, "Harry Pother e a pedra filosofal", "J. K. Rowling", true);
		Livro book3 = new Livro(789, "Admirável Mundo Novo", "Aldous Huxley", false);
		
		Usuario user = null;
		boolean usuarioLogado = false;
		int opcaoCriar;
		
		book3.devolver();
		book3.emprestar(user1);
		book3.emprestar(user2);
		
//			System.out.println("Bem vindo a biblioteca! \n Vamos criar a sua conta, você é: \n 1.Aluno \n 2.Professor");
//			opcaoCriar = scn.nextInt();
//			
//			switch(opcaoCriar) {
//			case 1:
//				System.out.println("Criando conta como aluno...");
//				user = new Aluno(1, "", "");
//				
//				System.out.println("Qual o seu nome?");
//				user.setNome(scn.nextLine());
//				
//				System.out.println("E o seu email?");
//				user.setEmail(scn.nextLine());
//				usuarioLogado = true;
//				break;
//			case 2:
//				System.out.println("Criando conta como professor...");
//				user = new Professor(1, "", "");
//				
//				System.out.println("Qual o seu nome?");
//				user.setNome(scn.nextLine());
//				
//				System.out.println("E o seu email?");
//				user.setEmail(scn.nextLine());
//				usuarioLogado = true;
//				break;
//			default:
//				System.out.println("Selecione uma opção válida!");
//				break;
//			}
//			
//			
//		
//		
//		int opcaoBiblioteca;
//		while (true) {
//			
//			System.out.println("O que deseja fazer? \n 1.");
//			opcaoBiblioteca = scn.nextInt();
//			
//			switch(opcaoBiblioteca) {
//			case 1:
//				break;
//			case 2:
//				break;
//			default:
//				System.out.println("Selecione uma opção válida!");
//				scn.close();
//				break;
//			}
//		}
	}

}
