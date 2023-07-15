package dayhipti.controlmonetario.service.serviceinpl;

import dayhipti.controlmonetario.entity.Egreso;
import dayhipti.controlmonetario.repository.IEgresoRepository;
import dayhipti.controlmonetario.service.IEgresoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("egresoImpl")
public class EgresoImpl implements IEgresoService {
    @Autowired
    IEgresoRepository objEgresoRepository;

    @Override
    public Egreso crearUsuario(Egreso egreso) {
        return null;
    }

    @Override
    public List<Egreso> listaUsuario() {
        return null;
    }

    @Override
    public Egreso buscarUsuario(int idegreso) {
        return null;
    }

    @Override
    public Egreso actualizarUsuario(Egreso egresoActualizar) {
        return null;
    }

    @Override
    public void eliminarUsuario(int idUsuario) {

    }
}
