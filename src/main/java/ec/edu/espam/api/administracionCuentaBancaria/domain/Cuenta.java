package ec.edu.espam.api.administracionCuentaBancaria.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@Entity (name = "cuenta")
public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "numero")
    @NotEmpty(message = "Número es requerido")
    private String numero;
    @Column(name = "tipo")
    @NotNull(message = "Tipo Cuenta es requerido")
    @Enumerated
    private TipoCuenta tipo;
    @Column(name = "balanceInicial")
    @NotEmpty(message = "Balance Inicial es requerido")
    private BigDecimal balanceInicial;
    @Column(name = "saldo")
    @NotNull(message = "Saldo es requerido")
    private BigDecimal saldo;
    @Column(name = "estado")
    @NotNull(message = "Estado es requerido")
    private Boolean estado;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "idCliente", nullable = false)
    private Cliente cliente;
    @OneToMany(mappedBy = "cuenta")
    private List<Movimiento> movimientos;
    private enum TipoCuenta{
        AHORRO, CORRIENTE
    }

}
