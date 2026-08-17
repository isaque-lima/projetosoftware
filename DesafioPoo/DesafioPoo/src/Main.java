import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Roupa> listaRoupas = new ArrayList<>();

        System.out.println("Sistema de Gerenciamento de Estoque de Roupas");

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n Cadastrar Nova Roupa: ");
            System.out.print("Marca: ");
            String marca = scanner.nextLine();

            System.out.print("Tipo (ex: camisa, calça, regata): ");
            String tipo = scanner.nextLine();

            System.out.print("Tamanho (P, M, G): ");
            String tamanho = scanner.nextLine();

            System.out.print("Quantidade: ");
            int quantidade = Integer.parseInt(scanner.nextLine());

            System.out.print("Valor: ");
            double valor = Double.parseDouble(scanner.nextLine());

            Roupa roupa = new Roupa(marca, tipo, tamanho, quantidade, valor);
            listaRoupas.add(roupa);

            roupa.mostrar();

            boolean gerenciarAtual = true;
            while (gerenciarAtual) {
                System.out.println("\nDeseja realizar alguma operação nesta roupa?");
                System.out.println("1 - Adicionar peças ao estoque");
                System.out.println("2 - Remover peças do estoque");
                System.out.println("3 - Prosseguir");
                System.out.print("Opção: ");

                int opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {
                    case 1:
                        System.out.print("Quantidade a adicionar: ");
                        int qtdAdd = Integer.parseInt(scanner.nextLine());
                        roupa.adicionar(qtdAdd);
                        roupa.mostrar();
                        break;
                    case 2:
                        System.out.print("Quantidade a remover: ");
                        int qtdRem = Integer.parseInt(scanner.nextLine());
                        roupa.remover(qtdRem);
                        roupa.mostrar();
                        break;
                    case 3:
                        gerenciarAtual = false;
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            }

            System.out.print("\nDeseja cadastrar outra roupa? (S/N): ");
            String resp = scanner.nextLine().trim();

            if (resp.equalsIgnoreCase("N")) {
                continuar = false;
            }
        }

        // Relatório final sem o cálculo
        System.out.println("Estoque disponível: ");

        double valorTotalFinal = 0;
        for (Roupa r : listaRoupas) {
            r.mostrar();
            valorTotalFinal += r.valorTotal();
        }
        System.out.println("Valor total do estoque: " + valorTotalFinal);

        scanner.close();
    }
}
