package br.com.project.model.bean;

import java.util.Date;
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
@Table(name = "atendimento")
public class Atendimento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private int idFuncionario;
    private int idPaciente;
    private Date dataAtendimento;
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
