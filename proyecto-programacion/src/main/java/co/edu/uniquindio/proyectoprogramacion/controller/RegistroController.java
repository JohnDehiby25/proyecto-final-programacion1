package co.edu.uniquindio.proyectoprogramacion.controller;

import co.edu.uniquindio.proyectoprogramacion.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class RegistroController {
    private List<Usuario> usuarios = new ArrayList<>();
    public boolean iniciarSesion(String usuario, String contrasena){
        for (Usuario usuario1 : usuarios) {
            if (usuario1.getId().equals(usuario)){
                return true;
            }
        }
        return false;
    }
    public boolean registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        return true;
    }
}

