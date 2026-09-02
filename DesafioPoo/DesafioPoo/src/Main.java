import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Roupa> listaRoupas = new ArrayList<>();

        System.out.println("Sistema de Gerenciamento de Estoque de Roupas");

        int opcao= 0;

        while (opcao !=5) {
            System.out.println("\n Menu de opções: ");
            System.out.println("1 - Adicionar Roupa");
            System.out.println("2 - Listar Roupas");
            System.out.println("3 - Atualizar Roupa");
            System.out.println("4 - Remover Roupa");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");

            try{
                opcao = Integer.parseInt(scanner.nextLine().trim());
            } catch(Exception e){
                System.out.println("Entrada inválida, Digite apenas números entre 1 a 5.");
                opcao = 0;
                continue;
            }

            switch (opcao) {
                case 1:

                System.out.println("\nCADASTRAR ROUPA:");
                System.out.println("Nome: ");
                String nome = scanner.nextLine();
                System.out.println("Quantidade: ");
                int quantidade = Integer.parseInt(scanner.nextLine());
                System.out.println("Valor: ");
                double valor = Double.parseDouble(scanner.nextLine());

                Roupa roupa = new Roupa(nome,quantidade,valor);
                listaRoupas.add(roupa);
                break;

                case 2:
                    System.out.println("\nLISTAR ROUPAS:");
                    if (listaRoupas.isEmpty()) {
                        System.out.println("Nenhuma Roupa encontrada");
                    } else {
                        double valorTotal = 0;
                        for (Roupa r : listaRoupas) {
                            r.mostrar();
                            valorTotal += r.valorTotal();
                        }

                        System.out.println("Valor total do estoque: " + valorTotal);
                    }
                    break;
                case 3:
                    System.out.println("\nATUALIZAR ROUPA:");
                    if (listaRoupas.isEmpty()){
                    System.out.println("Nenhum Roupa encontrada para atualizar");}
                    else{
                        System.out.println("Informe o índice do produto a ser atualizado (0 a "  +( listaRoupas.size() - 1) + "): ");
                        int indice = Integer.parseInt(scanner.nextLine());

                        if(indice >=0 && indice < listaRoupas.size()){
                            Roupa r = listaRoupas.get(indice);
                            System.out.println("Novo nome (Atual: " + r.getNome() + "): ");
                            String novoNome = scanner.nextLine();

                            System.out.println("Novo preço (Atual: " + r.getValor() + "): ");
                            Double novoValor = Double.parseDouble(scanner.nextLine());

                            System.out.println("Nova quantidade (Atual: " + r.getQuantidade() + "): ");
                            int novaQuantidade = Integer.parseInt(scanner.nextLine());

                            r.setNome(novoNome);
                            r.setValor(novoValor);
                            r.setQuantidade(novaQuantidade);

                            System.out.println("Roupa atualizada com sucesso!");
                        }else{
                            System.out.println("ìndice inválido");
                        }
                    }break;
                    case 4:
                        System.out.println("\n REMOVER ROUPA:");
                        if (listaRoupas.isEmpty()){
                            System.out.println("Nenhum Roupa encontrada");
                        }else{
                            System.out.println("Informe o índice do produto a ser removido (0 a "  +( listaRoupas.size() - 1) + "): ");
                            int indiceRem = Integer.parseInt(scanner.nextLine());

                            if (indiceRem >= 0 && indiceRem < listaRoupas.size()){
                                Roupa removida = listaRoupas.get(indiceRem);
                                System.out.println("Removido com sucesso!");
                            }else{
                                System.out.println("ìndice inválido");
                            }
                        }break;
                        case 5:
                            System.out.println("Saindo do sistema...");
                            break;

                        default:
                            System.out.println("Opção inválida, Escolha uma opção entre 1 e 5.");
                            break;
            }

            }
        scanner.close();
    }
}
