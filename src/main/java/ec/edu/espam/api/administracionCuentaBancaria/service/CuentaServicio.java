package ec.edu.espam.api.administracionCuentaBancaria.service;

import ec.edu.espam.api.administracionCuentaBancaria.domain.Cuenta;

import java.util.List;

public interface CuentaServicio {


    public List <Cuenta> obtenerTodos();
    Cuenta guardar (Cuenta cuenta);

    Cuenta actualizar(Long id, Cuenta cuenta);
}
