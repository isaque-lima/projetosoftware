public class Roupa {
    private String marca;
    private String tipo;
    private String tamanho;
    private int quantidade;
    private double valor;


    public Roupa(String marca, String tipo,String tamanho,  int quantidade, double valor) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public double valorTotal(){
        return this.quantidade * this.valor;
    }

    public void adicionar(int quantidade){
        if(quantidade > 0){
            this.quantidade += quantidade;
            System.out.println("Quantidade adicionada: " + quantidade);
        }else {
            System.out.println("Quantidade inválida");
        }
    }
    public void remover(int quantidade){
        if(quantidade <= 0){
            System.out.println("Quantidade inválida para remover");
        }else if(quantidade > this.quantidade){
            System.out.println("Erro, não é possível remover");
        }else {
            this.quantidade -= quantidade;
            System.out.println("Quantidade removida: " + quantidade);
        }
    }

    public void mostrar(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Valor: " + this.valor);
    }
}
