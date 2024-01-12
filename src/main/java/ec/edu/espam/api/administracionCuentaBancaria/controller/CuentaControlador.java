package ec.edu.espam.api.administracionCuentaBancaria.controller;

import ec.edu.espam.api.administracionCuentaBancaria.domain.Cuenta;
import ec.edu.espam.api.administracionCuentaBancaria.service.CuentaServicio;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/cuentas")
public class CuentaControlador {

    private final CuentaServicio cuentaServicio ;

    @GetMapping
    public ResponseEntity<Object> obtenerTodos() {
        return ResponseEntity.ok(cuentaServicio.obtenerTodos());
    }
    @PostMapping
    public ResponseEntity<Cuenta> guardar(@RequestBody @Valid Cuenta cuenta) {
        return new ResponseEntity<>(cuentaServicio.guardar(cuenta), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cuenta> actualizarCuenta(@PathVariable Long id, @RequestBody @Valid Cuenta cuenta) {
        return new ResponseEntity<>(cuentaServicio.actualizar(id, cuenta), HttpStatus.CREATED);
    }


}
