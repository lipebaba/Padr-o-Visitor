package visitor;

public final class Revista implements ItemAcervo {
    private final String titulo;
    private final int edicao;

    public Revista(String titulo, int edicao) {
        this.titulo = titulo;
        this.edicao = edicao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getEdicao() {
        return edicao;
    }

    @Override
    public <R> R aceitar(VisitanteAcervo<R> visitante) {
        return visitante.visitar(this);
    }
}
