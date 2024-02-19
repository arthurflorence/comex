package br.com.alura.comex.modelo;

public class Produto {
    String nome;
    String descricao;
    double precoUnitario;
    int quantidade;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString () {
        return ">> Dados do Produto <<" + "\n" +
                "Nome: " + nome + "\n" +
                "Valor: R$" + precoUnitario + "\n" +
                "Quantidade: " + quantidade + "\n" +
                "Descrição: " + descricao + "\n";
    }
}