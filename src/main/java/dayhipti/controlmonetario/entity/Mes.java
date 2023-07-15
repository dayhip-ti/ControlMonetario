package dayhipti.controlmonetario.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "mes")
public class Mes {
    @Id
    @Column(name = "idMensualidad", nullable = false, length = 12)
    private String idMensualidad;
    @Column(name = "fecha", nullable = false,columnDefinition = "text")
    private String fecha;
    @OneToMany(mappedBy = "mes",cascade = CascadeType.ALL)
    private List<DetalleMensualidad> listarMensualidades;

}
