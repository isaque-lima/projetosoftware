public class Filme {
    String titulo;
    String autor;
    String genero;
    int duracao;
    double valor;
    int qtdIngressos;


    public Filme(String titulo, String autor, String genero, int duracao, double valor, int qtdIngressos) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.duracao = duracao;
        this.valor = valor;
        this.qtdIngressos = qtdIngressos;
    }

    public void decrementaIngresso(int ingressos){

        if (ingressos > 0 && ingressos <= this.qtdIngressos){
            this.qtdIngressos -= ingressos;
        } else {
            System.out.println("Quantidade inválida");
        }
    }

    @Override
    public String toString() {
        return "Título='" + titulo +
                "\nAutor='" + autor +
                "\nGenero='" + genero +
                "\nDuracao=" + duracao +
                "\nValor do Ingresso=" + valor +
                "\nQuantidade de Ingressos Disponíveis: " + qtdIngressos;

    }

    public double compraIngresso(int ingressos){
        if (ingressos > 0 && ingressos <= this.qtdIngressos){
            return this.valor * ingressos;
        }else {
            return 0;
        }
    }
}

