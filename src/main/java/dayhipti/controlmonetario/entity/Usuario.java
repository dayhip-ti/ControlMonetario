package dayhipti.controlmonetario.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "usuario")
public class Usuario {
    @Column
    private int perfil_adm;
    @Id
    @Column(length = 12,nullable = false)
    private String rut;
    @Column(columnDefinition = "text",nullable = false)
    private String nombre;
    @Column(columnDefinition = "text",nullable = false)
    private String correo;
    @Column(columnDefinition = "text",nullable = false)
    private String clave;
    @Column(columnDefinition = "text",nullable = false)
    private String nivel;
    @Column(columnDefinition = "text",nullable = false)
    private String numeroNivel;
    @Column(columnDefinition = "text",nullable = false, name = "letra_Nivel")
    private String letraNivel;
    @Column(columnDefinition = "text",nullable = false)
    private String escuelas;
    @ManyToOne(optional = false,fetch = FetchType.EAGER)
            @JoinColumn(name = "id_perfil_usuario",nullable = false, columnDefinition = "varchar(2)")
    private Perfil perfil;
    @OneToMany(mappedBy = "usuario",cascade = CascadeType.ALL)
    private List<Telefono> listarTelefonos;
    @OneToMany(mappedBy = "usuario",cascade = CascadeType.ALL)
    private List<DetalleMensualidad> listarMensualidades;

}
