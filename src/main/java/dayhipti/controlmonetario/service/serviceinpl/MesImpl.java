package dayhipti.controlmonetario.service.serviceinpl;

import dayhipti.controlmonetario.entity.Mes;
import dayhipti.controlmonetario.repository.IMesRepository;
import dayhipti.controlmonetario.service.IMesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("mesImpl")
public class MesImpl implements IMesService {
    @Autowired
    IMesRepository objMesRepo;

    @Override
    public Mes crearMes(Mes mes) {
        return null;
    }

    @Override
    public List<Mes> listaMes() {
        return null;
    }

    @Override
    public Mes buscarMes(String idMes) {
        return null;
    }

    @Override
    public Mes actualizarMes(Mes mesActualizar) {
        return null;
    }

    @Override
    public void eliminarMes(String idMes) {

    }
}
