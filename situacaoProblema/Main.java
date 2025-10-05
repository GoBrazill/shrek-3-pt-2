package situacaoProblema;


public class Main {

	public static void main(String[] args) {

		Usuario user1 = new Aluno(1, "Vinicius", "vinicius@gmail.com");
		Usuario user2 = new Aluno(2, "Ryan", "ryan@gmail.com");
		Usuario user3 = new Professor(3, "Fiama", "fiama@gmail.com");

		Livro book1 = new Livro("a1", "Duna", "Frank Herbert", true);
		Livro book2 = new Livro("b2", "Harry Pother e a pedra filosofal", "J. K. Rowling", true);
		Livro book3 = new Livro("c3", "Admirável Mundo Novo", "Aldous Huxley", false);
		

//		fiquei mais de uma hora fazendo gambiarra pra verificar se o usuario existia e desisti e fiz com o copilot essa gambiarra de merda
		Biblioteca b = new Biblioteca();
		b.adicionarUsuario(user1);
		b.adicionarUsuario(user2);
		b.adicionarUsuario(user3);
		
		b.adicionarLivro(book1);
		b.adicionarLivro(book2);
		b.adicionarLivro(book3);
		
		b.emprestarLivro(user1, book1.getCodigo());
		b.emprestarLivro(user2, book2.getCodigo());
		b.emprestarLivro(user3, book3.getCodigo());
		
	}

}
