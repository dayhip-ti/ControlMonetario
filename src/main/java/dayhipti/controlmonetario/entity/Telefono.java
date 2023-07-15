package dayhipti.controlmonetario.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "telefono")
public class Telefono {
    @Id
    @Column(name = "numero_tel",columnDefinition = "text",nullable = false)
    private String  numeroTelefono;
    @ManyToOne(optional = false,fetch = FetchType.EAGER)
    @JoinColumn(name = "rut_usuario_tel",nullable = false)
    private Usuario usuario;
}
