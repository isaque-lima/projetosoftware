import java.util.ArrayList;

public class ArrayListNomes {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Alberto");
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Maria");

        nomes.add(2, "Julio");


        System.out.println("O tamanho da lista é: " + nomes.size());

        System.out.println("Segundo nome da lista é:" + nomes.get(1));

        nomes.set(1, "Rick");

        System.out.println(nomes.indexOf("Pedro"));

        nomes.remove(1);
        nomes.remove(nomes.indexOf("Carlos"));

        for(String nome : nomes){
            System.out.println(nome);
        }

        nomes.removeIf(nome -> nomes.contains("a"));
    }
}
