package visitor;

import java.util.List;

public final class Aplicacao {
    public static void main(String[] args) {
        List<ItemAcervo> acervo = List.of(
                new Livro("Dom Casmurro", "Machado de Assis"),
                new Revista("Ciência Hoje", 42));
        VisitanteEtiqueta etiqueta = new VisitanteEtiqueta();
        VisitantePrazo prazo = new VisitantePrazo();

        for (ItemAcervo item : acervo) {
            System.out.printf("%s | Empréstimo de %d dias%n",
                    item.aceitar(etiqueta), item.aceitar(prazo));
        }
    }
}
