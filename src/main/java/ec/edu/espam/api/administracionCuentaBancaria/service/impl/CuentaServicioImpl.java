package ec.edu.espam.api.administracionCuentaBancaria.service.impl;


import ec.edu.espam.api.administracionCuentaBancaria.domain.Cuenta;
import ec.edu.espam.api.administracionCuentaBancaria.repository.CuentaRepositorio;
import ec.edu.espam.api.administracionCuentaBancaria.service.CuentaServicio;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CuentaServicioImpl implements CuentaServicio {

    private final CuentaRepositorio cuentaRepositorio;


    @Override
    public List<Cuenta> obtenerTodos() {
        return cuentaRepositorio.findAll();
    }
    @Override
    public Cuenta guardar(Cuenta cuenta) {
        return cuentaRepositorio.save(cuenta);
    }

    @Override
    public Cuenta actualizar(Long id, Cuenta cuenta) {
        Cuenta cuentaExistente = cuentaRepositorio.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("No se encuentra la cuenta con el id: " + id));

        cuentaExistente.setNumero(cuenta.getNumero());
        cuentaExistente.setTipo(cuenta.getTipo());
        cuentaExistente.setBalanceInicial(cuenta.getBalanceInicial());
        cuentaExistente.setSaldo(cuenta.getSaldo());
        cuentaExistente.setEstado(cuenta.getEstado());

        return cuentaRepositorio.save(cuentaExistente);
    }



}
