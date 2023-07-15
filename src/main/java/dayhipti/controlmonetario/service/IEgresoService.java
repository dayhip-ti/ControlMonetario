package dayhipti.controlmonetario.service;

import dayhipti.controlmonetario.entity.Actividad;
import dayhipti.controlmonetario.entity.Egreso;
import dayhipti.controlmonetario.entity.Usuario;

import java.util.List;

public interface IEgresoService {
    Egreso crearUsuario(Egreso egreso);
    List<Egreso> listaUsuario();
    Egreso buscarUsuario(int idegreso);
    Egreso actualizarUsuario(Egreso egresoActualizar);
    void eliminarUsuario(int idUsuario);
}
