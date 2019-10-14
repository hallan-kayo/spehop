package br.com.project.model.bean;

/**
 *
 * @author Hallan
 */
public class Endereco {
    
    private int id;
    private String rua;
    private int numero;
    private String bairro;

    public Endereco(int id, String rua, int numero, String bairro) {
        this.id = id;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
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
    
    
}