package ec.edu.espam.api.administracionCuentaBancaria.repository;

import ec.edu.espam.api.administracionCuentaBancaria.domain.Movimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimientoRepositorio extends JpaRepository<Movimiento, Long> {
}
