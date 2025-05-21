package co.edu.uniquindio.proyectoprogramacion.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public interface HorarioConsulta {

    static Thread getMedico() {
        return null;
    }

    void establecerHorarioDisponible(LocalDateTime horario);
    ArrayList<LocalDateTime> obtenerHorariosDisponibles();


}