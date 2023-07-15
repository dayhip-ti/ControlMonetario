package dayhipti.controlmonetario.service.serviceinpl;

import dayhipti.controlmonetario.entity.Egreso;
import dayhipti.controlmonetario.repository.IEgresoRepository;
import dayhipti.controlmonetario.service.IEgresoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service("egresoImpl")
public class EgresoImpl implements IEgresoService {
    @Autowired
    IEgresoRepository objEgresoRepository;

    @Override
    public Egreso crearUsuario(Egreso egreso) {
        return objEgresoRepository.save(egreso);
    }

    @Override
    public List<Egreso> listaUsuario() {
        return objEgresoRepository.findAll();
    }

    @Override
    public Egreso buscarUsuario(int idegreso) {
        return objEgresoRepository.findById(idegreso).orElseThrow(()->new NoSuchElementException("No se encontro al Usuario"));
    }

    @Override
    public Egreso actualizarUsuario(Egreso egresoActualizar) {
        return  objEgresoRepository.save(egresoActualizar);
    }

    @Override
    public void eliminarUsuario(int idEgreso) {
        objEgresoRepository.deleteById(idEgreso);
    }
}
