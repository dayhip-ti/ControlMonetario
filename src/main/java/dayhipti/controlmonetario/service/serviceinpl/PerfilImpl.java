package dayhipti.controlmonetario.service.serviceinpl;

import dayhipti.controlmonetario.entity.Perfil;
import dayhipti.controlmonetario.repository.IPerfilRepository;
import dayhipti.controlmonetario.service.IPerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("perfilImpl")
public class PerfilImpl implements IPerfilService {
    @Autowired
    IPerfilRepository objPerfilRepo;

    @Override
    public Perfil crearTelefono(Perfil perfil) {
        return null;
    }

    @Override
    public List<Perfil> listaTelefono() {
        return null;
    }

    @Override
    public Perfil buscarTelefono(String idPerfil) {
        return null;
    }

    @Override
    public Perfil actualizarTelefono(Perfil perfilActualizar) {
        return null;
    }

    @Override
    public void eliminarTelefono(String idPerfil) {

    }
}
