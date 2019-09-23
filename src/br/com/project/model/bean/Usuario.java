package br.com.project.model.bean;

/**
 *
 * @author Hallan
 */
public class Usuario {
    
    private int id;
    private int idFuncionario;
    private String senha;

    public Usuario(int id, int idFuncionario, String senha) {
        this.id = id;
        this.idFuncionario = idFuncionario;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
