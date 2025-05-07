/* 
 * Proyecto final de sistema de gestion de hospital
 * 
 * Integrantes
 * John Dehiby Morales Guzmán
 * Darwin Castro
 * Miguel Angel Diaz Rodriguez
 * 
 * Version: 1.0 Abril 2025
 */
package co.edu.uniquindio.poo.proyectofinalprogramacion1;

import java.time.LocalDateTime;
import java.util.ArrayList;

public interface HorarioConsulta {
	
	void establecerHorarioDisponible(LocalDateTime horario);
	ArrayList<LocalDateTime> obtenerHorariosDisponibles();


}
