package dayhipti.controlmonetario.service.serviceinpl;

import dayhipti.controlmonetario.entity.Usuario;
import dayhipti.controlmonetario.repository.IUsuarioRepository;
import dayhipti.controlmonetario.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service("usuarioImpl")
public class UsuarioImpl implements IUsuarioService {
    @Autowired
    IUsuarioRepository objUsuarioRepo;

    @Override
    public Usuario crearUsuario(Usuario usuario) {
        return objUsuarioRepo.save(usuario);
    }

    @Override
    public List<Usuario> listaUsuario() {
        return objUsuarioRepo.findAll();
    }

    @Override
    public Usuario buscarUsuario(String idUsuario) {
        return objUsuarioRepo.findById(idUsuario).orElseThrow(()->new NoSuchElementException("No se encontro Usuario"));
    }

    @Override
    public Usuario actualizarUsuario(Usuario usuarioActualizar) {
        return objUsuarioRepo.save(usuarioActualizar);
    }

    @Override
    public void eliminarUsuario(String idUsuario) {
        objUsuarioRepo.deleteById(idUsuario);
    }
}
