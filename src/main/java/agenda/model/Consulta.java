package agenda.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consulta {
    private Integer idPaciente;
    private Integer idMedico;
    private String status;
    private LocalDateTime dataConsulta;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
