package br.com.project.model.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Hallan
 */
@Entity
@Table(name = "usuario")
public class Usuario{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String cpf;
    private String senha;
    
    public Usuario(){
        
    }

    public Usuario(int id, String cpf, String senha) {
        this.id = id;
        this.cpf = cpf;
        this.senha = senha;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
