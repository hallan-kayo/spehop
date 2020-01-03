package br.com.project.model.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Hallan
 */

@Entity
public class Pais {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
//    private Estado estado;
    
    public Pais(){
        
    }

    public Pais(int id, String nome, Estado estado) {
        this.id = id;
        this.nome = nome;
//        this.estado = estado;
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

//    public Estado getEstado() {
//        return estado;
//    }

//    public void setEstado(Estado estado) {
//        this.estado = estado;
//    }
    
    
}
