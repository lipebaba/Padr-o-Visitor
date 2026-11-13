package visitor;

public interface VisitanteAcervo<R> {
    R visitar(Livro livro);
    R visitar(Revista revista);
}
