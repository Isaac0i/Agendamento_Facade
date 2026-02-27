package agenda.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consulta {
    private Integer idPaciente;
    private Integer idMedico;
    private StatusConsulta status;
    private LocalDateTime dataConsulta;


    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Integer getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Integer idMedico) {
        this.idMedico = idMedico;
    }

    public LocalDateTime getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDateTime dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public Consulta(Integer idPaciente, Integer idMedico, StatusConsulta status, LocalDateTime dataConsulta) {
        this.idPaciente = idPaciente;
        this.idMedico = idMedico;
        this.status = status;
        this.dataConsulta = dataConsulta;
    }

}
