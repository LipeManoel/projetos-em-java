package agenda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Compromisso {
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String descricao;

    public Compromisso(LocalDate dataInicio, LocalDate dataFim, String descricao) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.descricao = descricao;
    }

    public boolean pertencePeriodo(LocalDate inicioPeriodo, int numeroDias) {
        LocalDate fimPeriodo = inicioPeriodo.plusDays(numeroDias);
        return (dataInicio.isAfter(inicioPeriodo) || dataInicio.isEqual(inicioPeriodo)) &&
               (dataFim.isBefore(fimPeriodo) || dataFim.isEqual(fimPeriodo));
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Compromisso: " + descricao + " | De: " + dataInicio.format(formatter) + " Até: " + dataFim.format(formatter);
    }
}
