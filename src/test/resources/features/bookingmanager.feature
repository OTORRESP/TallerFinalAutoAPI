Feature: Funcionalidad Gestión de reserva

  @createbooking
  Scenario: Crear booking
    Given el owner con los siguiente detalles
     | firstname | lastname | totalprice  | depositpaid | checkin    | checkout   | additionalneeds |
     | Erick     | Montes   | 111         | true        | 2018-01-01 | 2019-01-01 | Breakfast       |
    When el owner registra el booking
    Then el owner valida el booking

  @updatebooking
  Scenario: Actualizar booking
    Given el owner con los siguiente detalles actualizados
      | id | firstname | lastname | totalprice  | depositpaid | checkin    | checkout   | additionalneeds |
      | 7  | Juan      | Lopez    | depositpaid | true        | 2018-01-01 | 2019-01-01 | Breakfast       |
    When el owner actualiza el booking
    Then el usuario valida sus datos actualizados

  @delete
  Scenario: eliminar booking
    Given el owner con el siguiente detalle
    | id |
    | 11743 |
    When el owner elimina el booking
    Then el owner validac la eliminación
