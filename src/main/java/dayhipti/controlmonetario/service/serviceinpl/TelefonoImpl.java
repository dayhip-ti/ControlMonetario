package dayhipti.controlmonetario.service.serviceinpl;

import dayhipti.controlmonetario.entity.Telefono;
import dayhipti.controlmonetario.repository.ITelefonoRepository;
import dayhipti.controlmonetario.service.ITelefonoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service("telefonoImpl")
public class TelefonoImpl implements ITelefonoService{
    @Autowired
    ITelefonoRepository objTelefonoRepo;

    @Override
    public Telefono crearTelefono(Telefono telefono) {
        return objTelefonoRepo.save(telefono);
    }

    @Override
    public List<Telefono> listaTelefono() {
        return objTelefonoRepo.findAll();
    }

    @Override
    public Telefono buscarTelefonoId(String idTelefono) {
        return objTelefonoRepo.findById(idTelefono).orElseThrow(()->new NoSuchElementException("No se encontre Telefono"));
    }

    @Override
    public Telefono actualizarTelefono(Telefono telefonoActualizar) {
        return objTelefonoRepo.save(telefonoActualizar);
    }

    @Override
    public void eliminarTelefono(String idTelefono) {
        objTelefonoRepo.deleteById(idTelefono);
    }
}
