package dayhipti.controlmonetario.entity;

import ch.qos.logback.core.model.NamedModel;
import jakarta.persistence.*;
import jdk.dynalink.linker.LinkerServices;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "perfil")
public class Perfil {
    @Id
    @Column(name = "id_perfil", nullable = false, columnDefinition = "varchar",length = 2)
    private String idPerfil;
    @Column(name = "id_tipo_usuario",nullable = false,columnDefinition = "text")
    private  String idTipoUsuario;
    @Column(name = "fecha_creacion", nullable = false)
    @OneToMany(mappedBy = "perfil",cascade = CascadeType.ALL)
    private List<Usuario> listarUsuarios;
}
