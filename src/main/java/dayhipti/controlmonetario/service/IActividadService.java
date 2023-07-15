package dayhipti.controlmonetario.service;

import dayhipti.controlmonetario.entity.Actividad;
import dayhipti.controlmonetario.entity.Usuario;

import java.util.List;

public interface IActividadService {
    Actividad crearUsuario(Actividad actividad);
    List<Usuario> listaUsuario();
    Actividad buscarUsuario(int idActividad);
    Actividad actualizarUsuario(Actividad actividadActualizar);
    void eliminarUsuario(int idUsuario);
}
