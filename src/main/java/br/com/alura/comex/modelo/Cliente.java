package br.com.alura.comex.modelo;

public class Cliente {
    public String nome;
    public String cpf;
    public String email;
    public String profissao;
    public String telefone;
    public Endereco endereco;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCPF() {
        return cpf;
    }
    public void setCPF(String CPF) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao =profissao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    @Override
    public String toString() {
        return ">>> Dados do CLoentes <<<" + "\n" +
                "Nome: " + nome + "\n" +
                "CPF: " + cpf + "\n" +
                "E-mail: " + email + "\n" +
                "Telefone: " + telefone + "\n" +
                "Endreço: " + endereco + "\n";
        }
    }
