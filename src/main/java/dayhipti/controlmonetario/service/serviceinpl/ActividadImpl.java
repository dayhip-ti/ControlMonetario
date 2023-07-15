package dayhipti.controlmonetario.service.serviceinpl;

import dayhipti.controlmonetario.entity.Egreso;
import dayhipti.controlmonetario.repository.IEgresoRepository;
import dayhipti.controlmonetario.service.IEgresoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service("actividadImpl")
public class ActividadImpl implements IEgresoService {
    @Autowired
    IEgresoRepository objActividadRepo;
    @Override
    public Egreso crearUsuario(Egreso egreso) {
        return objActividadRepo.save(egreso);
    }

    @Override
    public List<Egreso> listaUsuario() {
        return objActividadRepo.findAll();
    }

    @Override
    public Egreso buscarUsuario(int idegreso) {
        return objActividadRepo.findById(idegreso).orElseThrow(()->new NoSuchElementException("No se encontro Egreso"));
    }

    @Override
    public Egreso actualizarUsuario(Egreso egresoActualizar) {
        return objActividadRepo.save(egresoActualizar);
    }

    @Override
    public void eliminarUsuario(int idUsuario) {
        objActividadRepo.deleteById(idUsuario);
    }


}
