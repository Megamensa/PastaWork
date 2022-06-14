package Agendamento;

import java.util.Date;
import java.util.List;

import Medico.Medico;
import Paciente.Paciente;

public class agendamento {

    private Long id;
    private List<Date> hora;
    private Medico medico;
    private Paciente paciente;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public List<Date> getHora() {
        return hora;
    }
    public void setHora(List<Date> hora) {
        this.hora = hora;
    }
    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    

    
}
