package visitor;

public final class Livro implements ItemAcervo {
    private final String titulo;
    private final String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public <R> R aceitar(VisitanteAcervo<R> visitante) {
        return visitante.visitar(this);
    }
}
