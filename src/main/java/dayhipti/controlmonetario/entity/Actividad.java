package dayhipti.controlmonetario.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "actividad")
public class Actividad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_actividad",nullable = false)
    private int idActividad;
    @Column(name = "nombre_actividad",nullable = false,columnDefinition = "text")
    private String nombreActividad;
    @Column(name = "monto_recaudado",nullable = false,columnDefinition = "real")
    private double montoRecaudado;
}
