package ec.edu.espam.api.administracionCuentaBancaria.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.java.Log;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity(name = "movimiento")
public class Movimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "fecha")
    @NotNull(message = "Fecha es requerido")
    private LocalDate fecha;
    @Column(name = "tipo")
    @NotNull(message = "Tipo es requerido")
    @Enumerated(EnumType.STRING)
    private TipoMovimiento tipo;
    @Column(name = "monto")
    @NotNull(message = "Monto es requerido")
    private BigDecimal monto;
    @Column(name = "balance")
    @NotNull(message = "Balance es requerido")
    private BigDecimal balance;
    @NotNull(message = "Cuentas es requerido")
   @ManyToOne(fetch = FetchType.LAZY)
    private Cuenta cuentas;
    public enum TipoMovimiento{
        DEBITO, CREDITO;
    }

}
