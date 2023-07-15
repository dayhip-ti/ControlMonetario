package dayhipti.controlmonetario.service;

import dayhipti.controlmonetario.entity.Perfil;
import dayhipti.controlmonetario.entity.Telefono;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPerfilService {
    Perfil crearTelefono(Perfil perfil);
    List<Perfil> listaTelefono();
    Perfil buscarTelefono(String idPerfil);
    Perfil actualizarTelefono(Perfil perfilActualizar);
    void eliminarTelefono(String idPerfil);
}
