package ec.edu.espam.api.administracionCuentaBancaria.repository;

import ec.edu.espam.api.administracionCuentaBancaria.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepositorio extends JpaRepository <Cliente, Long>{

}
