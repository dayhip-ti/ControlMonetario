package dayhipti.controlmonetario.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "egreso")
public class Egreso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_egreso",nullable = false)
    private int idEgreso;
    @Column(name = "nombre_egreso",nullable = false, columnDefinition = "text")
    private String nombreEgreso;
    @Column(name = "saldo",nullable = false, columnDefinition = "real")
    private double saldo;
}
