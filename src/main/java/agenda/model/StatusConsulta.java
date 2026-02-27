package agenda.model;

public enum StatusConsulta {
        AGENDADA,
        CANCELADA,
        REALIZADA;

    public static StatusConsulta fromString(String value) {
        for (StatusConsulta status : StatusConsulta.values()) {
            if (status.name().equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Status inválido: " + value);
    }
}
