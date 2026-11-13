package visitor;

public interface ItemAcervo {
    <R> R aceitar(VisitanteAcervo<R> visitante);
}
