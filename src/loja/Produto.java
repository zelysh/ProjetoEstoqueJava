package loja;

public class Produto {
    public String nome;
    public double preco;
    public int qtd;

    public Produto(String nome, double preco, int qtd){//construtor
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    public double totalValor(){
        return preco * qtd;
    }

    public void addProduto(int qtd){
        this.qtd += qtd;
    }

    public void retiraProduto(int qtd){
        this.qtd -= qtd;
    }

    public String toString(){
        return nome+ ", R$"+String.format("%.2f", preco)+ ", "+qtd+ " unidades, total: R$"+String.format("%.2f", totalValor());
    }
}
