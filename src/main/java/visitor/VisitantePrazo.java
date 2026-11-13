package visitor;

public final class VisitantePrazo implements VisitanteAcervo<Integer> {
    @Override
    public Integer visitar(Livro livro) {
        return 14;
    }

    @Override
    public Integer visitar(Revista revista) {
        return 7;
    }
}
