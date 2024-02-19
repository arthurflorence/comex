package br.com.alura.comex.Sprint8;

import br.com.alura.comex.modelo.Cliente;
import br.com.alura.comex.modelo.Endereco;
import br.com.alura.comex.modelo.Pedido;
import br.com.alura.comex.modelo.Produto;

public class TestePedido {

    public static void main(String[] args) {

        Cliente novoCliente = new Cliente ("João");

        Endereco enderecoCliente = new Endereco("Rua ABC", 123, "12345-678", "Bairro XYZ", "São Paulo", "SP", 456);

        novoCliente.cpf = "123.456.789-0";
        novoCliente.email = "bananinha@gmail.com";
        novoCliente.profissao = "Desenvolvedor";
        novoCliente.telefone = "(01)2345-6789";

        Produto novoProduto = new Produto();

        novoProduto.setNome("Copo Térmico");
        novoProduto.setDescricao("Copo ideal para manter seu café aquecido");
        novoProduto.setPrecoUnitario(24.99);
        novoProduto.setQuantidade(19);

        Pedido novoPedido = new Pedido();

        novoPedido.setId(1);
        novoPedido.setCliente(novoCliente);
        novoPedido.setPreco(24.99);
        novoPedido.setQuantidade(18);

        System.out.println(novoPedido);
    }
}