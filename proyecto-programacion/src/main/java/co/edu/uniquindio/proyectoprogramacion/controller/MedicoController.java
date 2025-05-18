package co.edu.uniquindio.proyectoprogramacion.controller;

import co.edu.uniquindio.proyectoprogramacion.model.HistorialMedico;
import co.edu.uniquindio.proyectoprogramacion.model.HorarioConsulta;
import co.edu.uniquindio.proyectoprogramacion.model.Medico;

import java.util.ArrayList;
import java.util.List;

public class MedicoController {
    private List<Medico> medicos = new ArrayList<Medico>();
    private List<HorarioConsulta> horarios = new ArrayList<>();
    private List<HistorialMedico> historiales = new ArrayList<>();

    public boolean registrarMedico(Medico medico) {
        medicos.add(medico);
        return true;
    }
    public List<HorarioConsulta> obtenerHorarios(String idMedico){
        List<HorarioConsulta> obtenerHorarios = new ArrayList<>();
        for (HorarioConsulta horarioConsulta : horarios) {


            }
        return obtenerHorarios;
    }


}




