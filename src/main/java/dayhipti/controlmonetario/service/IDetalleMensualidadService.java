package dayhipti.controlmonetario.service;

import dayhipti.controlmonetario.entity.DetalleMensualidad;

import java.util.List;

public interface IDetalleMensualidadService {
    DetalleMensualidad crearDetalleMensualidad(DetalleMensualidad detalleMensualidad);
    List<DetalleMensualidad> listaDetalleMensualidad();
    DetalleMensualidad buscarDetalleMensualidad(int idDetalleMensualidad);
    DetalleMensualidad actualizarDetalleMensualidad(DetalleMensualidad detalleMensualidadActualizar);
    void eliminarDetalleMensualidad(int idDetalleMensualidad);
}
