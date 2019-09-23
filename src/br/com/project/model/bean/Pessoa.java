package br.com.project.model.bean;

import java.util.Date;

/**
 *
 * @author Hallan
 */
public class Pessoa {
    
    private int id;
    private int cpf;
    private int rg;
    private String nome;
    private Date dataNascimento;
    private String classificacao;
    private int cartaosus;
    private Endereco endereco;
    private Telefone telefone;

    public Pessoa(int id, int cpf, int rg, String nome, Date dataNascimento, String classificacao, int cartaosus, Endereco endereco, Telefone telefone) {
        this.id = id;
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.classificacao = classificacao;
        this.cartaosus = cartaosus;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public int getCartaosus() {
        return cartaosus;
    }

    public void setCartaosus(int cartaosus) {
        this.cartaosus = cartaosus;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }
    
    
    
}
