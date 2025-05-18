package co.edu.uniquindio.proyectoprogramacion.controller;

import co.edu.uniquindio.proyectoprogramacion.model.Administrador;
import co.edu.uniquindio.proyectoprogramacion.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class AdministradorController {
    private final List<Usuario> usuarios = new ArrayList<>();
    public boolean crearAdministrador(Administrador administrador) {
        usuarios.add(administrador);
        return true;
    }
    public List<Usuario> listarUsuarios() {
        return new ArrayList<>(usuarios);
    }
    public void eliminarUsuario(String idusuario) {
       for (int i = 0; i < usuarios.size(); i++) {
           if (usuarios.get(i).getId().equals(idusuario)) {
               usuarios.remove(i);
               break;
           }
       }
    }
}
