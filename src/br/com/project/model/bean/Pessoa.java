package br.com.project.model.bean;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Hallan
 */
@Entity
@Table(name = "pessoa")
public class Pessoa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String cpf;
    private String rg;
    private String nome;
    private String dataNascimento;
    private String classificacao;
    private String cartaoSus;
    @ManyToOne
    private Endereco endereco;
    @ManyToOne
    private Telefone telefone;
    
    public Pessoa(){
        
    }

    public Pessoa(String cpf, String rg, String nome, String dataNascimento, String classificacao, String cartaosus, Endereco endereco, Telefone telefone) {
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.classificacao = classificacao;
        this.cartaoSus = cartaosus;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getCartaosus() {
        return cartaoSus;
    }

    public void setCartaosus(String cartaosus) {
        this.cartaoSus = cartaosus;
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
