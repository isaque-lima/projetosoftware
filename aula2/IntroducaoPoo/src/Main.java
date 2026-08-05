import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do Produto: ");
        String produto1 = sc.nextLine();
        System.out.println("Digite a quantidade do Produto");
        int quantidade = sc.nextInt();
        System.out.println("Digite o preço do Produto");
        double preco = sc.nextDouble();

        double precoFinal = preco * quantidade;


        System.out.println("Produto: " + produto1
            + "Quantidade: " + quantidade +
              "preco: " + preco +
                "precoFinal: " + precoFinal
        );
    }
}
