package visitor;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public final class VisitanteAcervoTest {
    public static void main(String[] args) {
        ItemAcervo livro = new Livro("Dom Casmurro", "Machado de Assis");
        ItemAcervo revista = new Revista("Ciência Hoje", 42);
        VisitanteEtiqueta etiqueta = new VisitanteEtiqueta();
        VisitantePrazo prazo = new VisitantePrazo();

        verificar("etiqueta do livro", "Dom Casmurro — Machado de Assis", livro.aceitar(etiqueta));
        verificar("etiqueta da revista", "Ciência Hoje — edição 42", revista.aceitar(etiqueta));
        verificar("prazo do livro", 14, livro.aceitar(prazo));
        verificar("prazo da revista", 7, revista.aceitar(prazo));

        List<ItemAcervo> acervo = List.of(revista, livro);
        List<Integer> prazos = acervo.stream()
                .map(item -> item.aceitar(prazo))
                .collect(Collectors.toList());
        verificar("prazos em acervo misto", List.of(7, 14), prazos);

        System.out.println("5 testes passaram.");
    }

    private static void verificar(String caso, Object esperado, Object obtido) {
        if (!Objects.equals(esperado, obtido)) {
            throw new AssertionError(caso + ": esperado " + esperado + ", obtido " + obtido);
        }
    }
}
