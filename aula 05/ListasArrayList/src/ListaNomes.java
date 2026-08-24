public class ListaNomes {

    public static void main(String[] args) {

        String[] nomes = new String[5];
        nomes[0] = "Juan";
        nomes[1] = "Maria";
        nomes[2] = "Pedro";
        nomes[3] = "Antonio";
        nomes[4] = "Edu";

        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);
        System.out.println(nomes[3]);
        System.out.println(nomes[4]);

        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }

        for(String nome : nomes){
            System.out.println(nome);
        }
    }
}
