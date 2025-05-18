package co.edu.uniquindio.proyectoprogramacion.controller;

import co.edu.uniquindio.proyectoprogramacion.model.CitaMedica;

import java.util.ArrayList;
import java.util.List;

public class CitaMedicaController {
  private List<CitaMedica> citas = new ArrayList<>();
  public boolean agendarCita(CitaMedica cita) {
        citas.add(cita);
        return true;
  }
  public List<CitaMedica> obtenerCitasPaciente(String idPaciente) {
      List<CitaMedica> resultado = new ArrayList<>();
      for (CitaMedica cita : citas) {
          if (cita.getIdPaciente().equals(idPaciente)) {
              resultado.add(cita);
          }
      }
      return resultado;
  }
  public boolean cancelarCita(String idCita) {
      for (int i = 0; i < citas.size(); i++) {
          citas.remove(i);
          return true;
      }
      return false;
  }
}
