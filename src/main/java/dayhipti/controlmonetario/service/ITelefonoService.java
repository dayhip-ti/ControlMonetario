package dayhipti.controlmonetario.service;

import dayhipti.controlmonetario.entity.Telefono;
import dayhipti.controlmonetario.entity.Usuario;

import java.util.List;

public interface ITelefonoService {
    Telefono crearTelefono(Telefono telefono);
    List<Telefono> listaTelefono();
    Telefono buscarTelefonoId(String idTelefono);
    Telefono actualizarTelefono(Telefono telefonoActualizar);
    void eliminarTelefono(String idTelefono);
}
