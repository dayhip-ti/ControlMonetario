package dayhipti.controlmonetario.service;

import dayhipti.controlmonetario.entity.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service()
public interface IUsuarioService {
    Usuario crearUsuario(Usuario usuario);
    List<Usuario> listaUsuario();
    Usuario buscarUsuario(int idUsuario);
    Usuario actualizarUsuario(Usuario usuarioActualizar);
    void eliminarUsuario(int idUsuario);
}
