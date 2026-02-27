package agenda.services;

import agenda.model.Consulta;
import agenda.model.StatusConsulta;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgendamentoService {
    Scanner sc = new Scanner(System.in);

    String statusString;
    StatusConsulta status = StatusConsulta.fromString(statusString);

    public Consulta agendarConsulta(
            Integer idPaciente,
            Integer idMedico,
            String dataString) {

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDateTime data =
                LocalDateTime.parse(dataString, formatter);

        return new Consulta(idPaciente, idMedico, StatusConsulta.AGENDADA, data);
    }
}
