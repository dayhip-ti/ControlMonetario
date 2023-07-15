package dayhipti.controlmonetario.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table()
public class DetalleMensualidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mensualidad_detalle",nullable = false)
    private int idMensualidadDetalle;
    @ManyToOne(optional = false,fetch = FetchType.EAGER)
    @JoinColumn(name = "RUT_usuario",columnDefinition = "varchar(12)",nullable = false)
    private Usuario usuario;
    @ManyToOne(optional = false,fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_mensualidad", columnDefinition = "varchar(10)",nullable = false)
    private Mes mes;
    @Column(columnDefinition = "BLOB")
    private byte[] comprobante;
}
