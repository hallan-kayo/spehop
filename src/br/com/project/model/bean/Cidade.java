package br.com.project.model.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Hallan
 */

@Entity
public class Cidade {
    
    @Id
    private int id;
    private String nome;
    private Endereco endereco;
    
    public Cidade(){
        
    }

    public Cidade(int id, String nome, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
    
}
