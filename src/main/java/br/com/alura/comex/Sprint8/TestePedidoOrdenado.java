package br.com.alura.comex.Sprint8;

import br.com.alura.comex.modelo.Cliente;
import br.com.alura.comex.modelo.Endereco;
import br.com.alura.comex.modelo.Pedido;
import java.util.ArrayList;
import java.util.Comparator;

public class TestePedidoOrdenado {
    public static void main(String[] args) {
        Cliente novoCliente = new Cliente("Michael S.");

        Endereco enderecoCliente = new Endereco("Rua ABC", 123, "12345-678", "Bairro XYZ", "São Paulo", "SP", 456);

        novoCliente.cpf = "123.456.789-5";
        novoCliente.email = "best.boss@gmail.com";
        novoCliente.profissao = "Gerente Regional";
        novoCliente.telefone = "(11)99999-0000";
        novoCliente.endereco = null;

        Pedido pedido1 = new Pedido();

        pedido1.setId(1);
        pedido1.setCliente(novoCliente);
        pedido1.setPreco(54.99);
        pedido1.setQuantidade(9);

        Pedido pedido2 = new Pedido();

        pedido2.setId(2);
        pedido2.setCliente(novoCliente);
        pedido2.setPreco(14.99);
        pedido2.setQuantidade(5);

        Pedido pedido3 = new Pedido();

        pedido3.setId(3);
        pedido3.setCliente(novoCliente);
        pedido3.setPreco(16.98);
        pedido3.setQuantidade(25);

        Pedido pedido4 = new Pedido();

        pedido4.setId(4);
        pedido4.setCliente(novoCliente);
        pedido4.setPreco(15.99);
        pedido4.setQuantidade(11);

        Pedido pedido5 = new Pedido();
        pedido5.setId(5);
        pedido5.setCliente(novoCliente);
        pedido5.setPreco(18.99);
        pedido5.setQuantidade(30);

        ArrayList<Pedido> listaPedidos = new ArrayList<>();
        listaPedidos.add(pedido1);
        listaPedidos.add(pedido2);
        listaPedidos.add(pedido3);
        listaPedidos.add(pedido4);
        listaPedidos.add(pedido5);
        listaPedidos.sort(Comparator.comparing(Pedido::getValorTotal));

        System.out.print(listaPedidos);
        listaPedidos.sort(Comparator.comparing(Pedido::getValorTotal).reversed());
    }
}