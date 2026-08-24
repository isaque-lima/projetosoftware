package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Entidades.Filmes> filmes = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("**** LISTA DE OPÇÕES ");
            System.out.println("1. Adicionar Filmes");
            System.out.println("2. Sair do programa");
            System.out.println("Digite a opção desejada: ");
            String opcao = input.nextLine();

            switch(opcao){
                case "1":
                    System.out.println("Digite o nome do filme: ");
                    String nome = input.nextLine();

                    System.out.println("Digite o genero do Filme: ");
                    String genero = input.nextLine();

                    System.out.println("Digite a duração do Filme: ");
                    int duracao = input.nextInt();

                    System.out.println("Digite o valor do Filme: ");
                    double valor = input.nextDouble();

                    filmes.add(new Entidades.Filmes(nome, genero, duracao, valor));
                    break;

                case "2":
                    System.out.println("Saindo do programa ");
                    return;
            }
        }
    }
}
