package co.edu.uniquindio.proyectoprogramacion.controller;

import co.edu.uniquindio.proyectoprogramacion.model.CitaMedica;
import co.edu.uniquindio.proyectoprogramacion.model.Notificacion;
import co.edu.uniquindio.proyectoprogramacion.model.Paciente;

import java.util.ArrayList;
import java.util.List;

public class PacienteController {
    private List<Paciente> pacientes = new ArrayList<>();
    private List<CitaMedica> citas = new ArrayList<>();
    private List<Notificacion> notificaciones = new ArrayList<>();

    public boolean registrarPaciente(Paciente paciente) {
       pacientes.add(paciente);
        return true;
    }
    public List<CitaMedica> obtenerCitas(String idpaciente) {
        List<CitaMedica> resultado = new ArrayList<>();
        for (CitaMedica cita : citas) {
            if (cita.getIdPaciente().equals(idpaciente)) {
                resultado.add(cita);
            }
        }
        return resultado;
    }
    public List<Notificacion> obtenerNotificaciones(String idpaciente) {
        List<Notificacion> resultado = new ArrayList<>();
        for (Notificacion notificacion : notificaciones) {
            resultado.add(notificacion);
        }
        return resultado;
    }
}

