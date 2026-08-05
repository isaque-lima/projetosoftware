package filmes;

public class Principal {
    public static void main(String[] args) {

        Filme homemAranha = new Filme();

        homemAranha.titulo = "Homem Aranha: Um novo Dia";
        homemAranha.genero = "Ação/Aventura";
        homemAranha.anoLancamento = 2026;
        homemAranha.duracao = 145;
        homemAranha.ValorIngresso = 45;
        homemAranha.qtdIngressos = 5;

        Filme HarryPotter = new Filme();

        HarryPotter.titulo = "Harry Potter e a Câmara Secreta";
        HarryPotter.genero = "Aventura";
        HarryPotter.anoLancamento = 2002;
        HarryPotter.duracao = 140;
        HarryPotter.ValorIngresso = 15;
        HarryPotter.qtdIngressos = 15;

        System.out.println(homemAranha.toString());
        System.out.println(HarryPotter.toString());
    }
}
