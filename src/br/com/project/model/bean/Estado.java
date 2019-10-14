package br.com.project.model.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Hallan
 */

@Entity
public class Estado {
    
    @Id
    private int id;
    private String nome;
    private Cidade cidade;
    
    private Estado(){
        
    }

    public Estado(int id, String nome, Cidade cidade) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
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

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    
    
}
