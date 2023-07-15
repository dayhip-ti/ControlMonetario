package dayhipti.controlmonetario.service.serviceinpl;

import dayhipti.controlmonetario.entity.Mes;
import dayhipti.controlmonetario.entity.Usuario;
import dayhipti.controlmonetario.repository.IMesRepository;
import dayhipti.controlmonetario.service.IMesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service("mesImpl")
public class MesImpl implements IMesService {
    @Autowired
    IMesRepository objMesRepo;

    @Override
    public Mes crearMes(Mes mes) {
        return objMesRepo.save(mes);
    }

    @Override
    public List<Mes> listaMes() {
        return objMesRepo.findAll();
    }

    @Override
    public Mes buscarMes(String idMes) {
        return objMesRepo.findById(idMes).orElseThrow(()->new NoSuchElementException("No se encontro Mes"));
    }

    @Override
    public Mes actualizarMes(Mes mesActualizar) {
        return  objMesRepo.save(mesActualizar);
    }

    @Override
    public void eliminarMes(String idMes) {
        objMesRepo.deleteById(idMes);
    }
}
