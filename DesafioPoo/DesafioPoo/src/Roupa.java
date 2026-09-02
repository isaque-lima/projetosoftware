public class Roupa {
    private String nome;
    private int quantidade;
    private double valor;


    public Roupa(String nome,int quantidade, double valor) {
        this.nome = nome;
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
        System.out.println("Nome: " + this.nome);
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Valor: " + this.valor);
    }

    public String getNome() {
        return nome;
    }

    public Double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
