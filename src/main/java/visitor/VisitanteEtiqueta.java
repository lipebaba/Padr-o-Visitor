package visitor;

public final class VisitanteEtiqueta implements VisitanteAcervo<String> {
    @Override
    public String visitar(Livro livro) {
        return livro.getTitulo() + " — " + livro.getAutor();
    }

    @Override
    public String visitar(Revista revista) {
        return revista.getTitulo() + " — edição " + revista.getEdicao();
    }
}
