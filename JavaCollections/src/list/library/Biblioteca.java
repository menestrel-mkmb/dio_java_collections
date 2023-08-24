package list.library;

public class Biblioteca {
    public static void main(String[] args) {
        Livro mochileiro1 = new Livro("Mochileiro das Galáxias 1", "Adam", 2000);
        Livro mochileiro2 = new Livro("Mochileiro das Galáxias 2", "Adam", 2001);
        Livro mochileiro3 = new Livro("Mochileiro das Galáxias 3", "Adam", 2002);
        Livro mochileiro4 = new Livro("Mochileiro das Galáxias 4", "Adam", 2003);
        Livro mochileiro5 = new Livro("Mochileiro das Galáxias 5", "Adam", 2004);

        Livro deusDelirio = new Livro("Deus um delírio", "Dawkins", 2010);


        CatalogoLivros catalogoBiblioteca = new CatalogoLivros();

        catalogoBiblioteca.adicionarLivros(mochileiro1);
        catalogoBiblioteca.adicionarLivros(mochileiro2);
        catalogoBiblioteca.adicionarLivros(mochileiro3);
        catalogoBiblioteca.adicionarLivros(mochileiro4);
        catalogoBiblioteca.adicionarLivros(mochileiro5);
        catalogoBiblioteca.adicionarLivros(deusDelirio);

        System.out.println("\nPesquisa por autor: ");
        System.out.println(catalogoBiblioteca.pesquisarPorAutor("Adam"));

        System.out.println("\nPesquisa por título: ");
        System.out.println(catalogoBiblioteca.pesquisarPorTitulo("Mochileiro"));

        System.out.println("\nPesquisa por todos os títulos: ");
        System.out.println(catalogoBiblioteca.pesquisarPorTituloTodos("Deus"));

        System.out.println("\nPesquisa por data: ");
        System.out.println(catalogoBiblioteca.pesquisarPorData(2002, 2012));
    }
}
