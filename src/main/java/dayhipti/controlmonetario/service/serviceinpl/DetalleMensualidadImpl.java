package dayhipti.controlmonetario.service.serviceinpl;

import dayhipti.controlmonetario.entity.DetalleMensualidad;
import dayhipti.controlmonetario.repository.IDetalleMensualidadRepository;
import dayhipti.controlmonetario.service.IDetalleMensualidadService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.NoSuchElementException;

public class DetalleMensualidadImpl implements IDetalleMensualidadService {
    @Autowired
    IDetalleMensualidadRepository objDetalleMensualidadRepo;
    @Override
    public DetalleMensualidad crearDetalleMensualidad(DetalleMensualidad detalleMensualidad) {
        return objDetalleMensualidadRepo.save(detalleMensualidad);
    }

    @Override
    public List<DetalleMensualidad> listaDetalleMensualidad() {
        return objDetalleMensualidadRepo.findAll();
    }

    @Override
    public DetalleMensualidad buscarDetalleMensualidad(int idDetalleMensualidad) {
        return objDetalleMensualidadRepo.findById(idDetalleMensualidad).orElseThrow(()->new NoSuchElementException("No se encontro Detalle de Mensualidad"));
    }

    @Override
    public DetalleMensualidad actualizarDetalleMensualidad(DetalleMensualidad detalleMensualidadActualizar) {
        return objDetalleMensualidadRepo.save(detalleMensualidadActualizar);
    }

    @Override
    public void eliminarDetalleMensualidad(int idDetalleMensualidad) {
        objDetalleMensualidadRepo.deleteById(idDetalleMensualidad);
    }
}
