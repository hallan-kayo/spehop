package br.com.project.model.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Hallan
 */
@Entity
@Table(name = "atendimento")
public class Atendimento implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private int idFuncionario;
    @Column
    private int idPaciente;
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataAtendimento;
    @Column
    private String diagnostico;
    
    public Atendimento(){
        
    }

    public Atendimento(int id, int idFuncionario, int idPaciente, Date dataAtendimento, String diagnostico) {
        this.id = id;
        this.idFuncionario = idFuncionario;
        this.idPaciente = idPaciente;
        this.dataAtendimento = dataAtendimento;
        this.diagnostico = diagnostico;
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

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Date getDataAtendimento() {
        return dataAtendimento;
    }

    public void setDataAtendimento(Date dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    
    
}
