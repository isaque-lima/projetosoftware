package filmes;

public class Filme {
    String titulo;
    String genero;
    int anoLancamento;
    int duracao;

    int qtdIngressos;
    double ValorIngresso;

    @Override
    public String toString() {
        return "\nFilme{"+
                "\nTitulo='" + titulo +
                "\nGenero: " + genero +
                "\nAnoLancamento: " + anoLancamento +
                "\nDuracao: " + duracao +
                "\nQuantidade de ingressos: " + qtdIngressos +
                "\nValor do ingresso: " + ValorIngresso;



    }


}
