package dayhipti.controlmonetario.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "mes")
public class Mes {
    @Id
    @Column(name = "idMensualidad", nullable = false)
    private String idMensualidad;
}
