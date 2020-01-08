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
@Table(name = "endereco")
public class Endereco {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String rua;
    private int numero;
    private String bairro;
    private String cep;

    public Endereco(String rua, int numero, String bairro,String cep) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    public String getCep(){
        return cep;
    }
    
    public void setCep(String cep){
        this.cep = cep;
    }
}