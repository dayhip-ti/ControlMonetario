package dayhipti.controlmonetario.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "actividad")
public class Actividad {
    @Id
    @Column(name = "id_actividad",nullable = false)
    private int idActividad;
    @Column(name = "nombre_actividad",nullable = false)
    private String nombreActividad;
    @Column(name = "monto_recaudado",nullable = false)
    private double montoRecaudado;
}
