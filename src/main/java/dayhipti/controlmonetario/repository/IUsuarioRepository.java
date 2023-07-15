package dayhipti.controlmonetario.repository;

import dayhipti.controlmonetario.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository<Usuario,String> {
}
