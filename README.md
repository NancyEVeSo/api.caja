# api.caja
MAESTRIA DE DISEÑO WEB Y APP MOVILES - Creación del proyecto Spring Boot  
Se requiere crear los servicios para administrar los movimientos de cuentas de una caja de ahorro, para
lo cual se debe tener en cuenta las siguientes entidades:

## Persona

- Implementar la clase persona con los siguientes datos: nombre, género, edad, identificación,
dirección, teléfono.

- Debe manera su clave primaria (PK)

## Cliente

- El Cliente debe manejar una entidad, que herede de la clase persona.

- Un cliente tiene: clienteId, contraseña, estado.

- El cliente debe tener una clave única. (PK)
## Cuenta.

- Cuenta debe manejar una entidad.

- Una cuenta tiene: número de cuenta, tipo cuenta, saldo Inicial, estado.

- Debe manejar su Clave única.

## Movimientos

- Movimientos debe manejar una entidad.

- Un movimiento tiene: Fecha, tipo movimiento, valor, saldo.

- Debe manejar su Clave única.

  ## Funcionalidades

Los API’s debe tener las siguientes operaciones:

- Podrá crear, editar, actualizar y eliminar registros (Entidades: Cliente, Cuenta y Movimiento).

- Los endpoints a crear son:

          /cuentas
          
          /clientes
          
          /movimientos

- Los valores cuando son crédito son positivos, y los débitos son negativos. Debe almacenarse el
saldo disponible en cada transacción dependiendo del tipo de movimiento. (suma o resta)

- Si el saldo es cero, y va a realizar una transacción débito, debe desplegar mensaje “Saldo no
disponible”

- Generar reporte (Estado de cuenta) especificando un rango de fechas y un cliente, visualice las
cuentas asociadas con sus respectivos saldos y el total de débitos y créditos realizados durante
las fechas de ese cliente. (resultado en Json) Por ejemplo:
                                                          (/reportes?fecha=rango fechas)
