package dayhipti.controlmonetario.service;

import dayhipti.controlmonetario.entity.Mes;

import java.util.List;

public interface IMesService {
    Mes crearMes(Mes mes);
    List<Mes> listaMes();
    Mes buscarMes(String idMes);
    Mes actualizarMes(Mes mesActualizar);
    void eliminarMes(String idMes);
}
