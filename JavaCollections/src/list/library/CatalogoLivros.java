package list.library;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> catalogo;

    public CatalogoLivros() {
        this.catalogo = new ArrayList<>();
    }

    public void adicionarLivros(Livro livro) {
        catalogo.add(livro);
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> authorList = new ArrayList<>();

        if(catalogo.isEmpty()) return authorList;

        for(Livro livro : catalogo) {
            if(livro.getAutor().equalsIgnoreCase(autor)) authorList.add(livro);
        }

        return authorList;
    }

    public List<Livro> pesquisarPorData(int anoInicial, int anoFinal) {
        List<Livro> dataList = new ArrayList<>();

        if(catalogo.isEmpty()) return dataList;

        for(Livro livro : catalogo) {
            if( anoInicial <= livro.getAnoPublicacao()
                    && anoFinal >= livro.getAnoPublicacao())
                dataList.add(livro);
        }

        return dataList;
    }

    public List<Livro> pesquisarPorTituloTodos(String titulo) {
        List<Livro> titleList = new ArrayList<>();

        if(catalogo.isEmpty()) return titleList;

        for(Livro livro : catalogo) {
            if(livro.getTitulo().contains(titulo))
                titleList.add(livro);
        }

        return titleList;
    }

    public Livro pesquisarPorTitulo(String titulo) {

        if(catalogo.isEmpty()) return null;

        for(Livro livro : catalogo) {
            if(livro.getTitulo().contains(titulo))
                return livro;
        }

        return null;
    }


}
