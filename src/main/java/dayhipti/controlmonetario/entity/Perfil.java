package dayhipti.controlmonetario.entity;

import ch.qos.logback.core.model.NamedModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "perfil")
public class Perfil {
    @Id
    @Column(name = "id_perfil", nullable = false)
    private String idPerfil;
    @Column(name = "fecha_creacion", nullable = false)
    private  String idTipoUsuario;

}
