package programa;

import loja.Produto;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Adicione dados do produto: \n");
        System.out.print("Nome: ");
        String nome = leia.nextLine();
        System.out.print("Preço do produto: ");
        double preco = leia.nextDouble();
        System.out.print("Quantidade do produto: ");
        int qtd = leia.nextInt();

        Produto produto = new Produto(nome, preco, qtd); //a partir estou obrigando o programador a informar
        //os dados do produto no momento da instaciação dele. Ou seja, o construtor serve para proteger que
        // o programador faça besteira de criar um produto sem preço ou nome, etc

        System.out.println("Produto: "+produto);

        System.out.print("\nAdicione o número de produtos que você quer adicionar: ");
        qtd = leia.nextInt();
        produto.addProduto(qtd);
        System.out.println("Dados atualizados" +
                ": "+ produto);
        System.out.print("Quantos produtos você quer remover do estoque: ");
        qtd = leia.nextInt();
        produto.retiraProduto(qtd);

        System.out.println("Dados atualizados"+ produto);

        leia.close();

    }
}