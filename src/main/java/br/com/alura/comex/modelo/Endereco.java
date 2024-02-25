package br.com.alura.comex.modelo;
public class Endereco {
     String nomeRua;
    int numero;
    String cep;
    String bairro;
    String cidade;
    String estado;
    int complemento;


    public Endereco(String nomeRua, int numero, String cep, String bairro, String cidade, String estado,int complemento){
        this.nomeRua=nomeRua;
        this.numero=numero;
        this.bairro=bairro;
        this.cidade=cidade;
        this.estado=estado;
        this.complemento=complemento;
    }
    @Override
    public String toString() {
        return ">> Dados do Endereço <<" + "\n" +
                "Nome da Rua: " + "\n" +
                "Cep: " + cep + "\n" +
                "Cidade: " + cidade + "\n" +
                "Estado: " + estado + "\n" +
                "Número: " + numero + "\n" +
                "Complemento: " + complemento + "\n";

    }
}
