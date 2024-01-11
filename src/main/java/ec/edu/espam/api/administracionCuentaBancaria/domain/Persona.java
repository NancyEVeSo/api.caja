package ec.edu.espam.api.administracionCuentaBancaria.domain;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Persona {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id", nullable = false)
    private Long id;
    @Column(name = "identificacion")
    @NotEmpty(message = "Identificacion es requerido")
    private String identificacion;
    @Column(name = "nombre")
    @NotEmpty(message = "Nombre es requerido")
    private String nombre;
    @Column(name = "genero")
    @NotEmpty(message = "Genero es requerido")
    private String genero;
    @Column(name = "direccion")
    @NotEmpty(message = "Direccion es requerido")
    private String direccion;
    @Column(name = "telefono")
    @NotEmpty(message = "Telefono es requerido")
    private  String telefono;
    @Column(name = "edad")
    @NotNull(message = "Edad es requerido")
    private Integer edad;

}
