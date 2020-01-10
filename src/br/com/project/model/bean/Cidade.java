package br.com.project.model.bean;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

/**
 *
 * @author Hallan
 */

@Entity
@Table(name = "cidade")
public class Cidade implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nome;
    @Column(name = "id_endereco")
    private int idEndereco;
    
    public Cidade(){
        
    }

    public Cidade(String nome, int idEndereco) {
        this.nome = nome;
        this.idEndereco = idEndereco;
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
    @JoinColumn(name = "id_endereco")
    public int getEndereco() {
        return idEndereco;
    }

    public void setEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }
    
    
    
}
