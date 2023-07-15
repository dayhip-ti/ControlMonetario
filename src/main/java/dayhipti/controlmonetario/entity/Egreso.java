package dayhipti.controlmonetario.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "egreso")
public class Egreso {
    @Id
    @Column(name = "id_egreso",nullable = false)
    private int idEgreso;
    @Column(name = "nombre_egreso",nullable = false)
    private String nombreEgreso;
    @Column(name = "saldo",nullable = false)
    private double saldo;
}
