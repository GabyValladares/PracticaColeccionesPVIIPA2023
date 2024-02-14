DELIMITER //

CREATE PROCEDURE ListarVehiculosPorCedula(
    IN cedula VARCHAR(20) -- Parámetro de entrada
)
BEGIN
    SELECT v.placa, v.color, v.marca, v.tipo, v.valor
    FROM vehiculos v
    INNER JOIN persona p ON v.idpersona = p.idpersona
    WHERE p.cedula = cedula; -- Uso del parámetro de entrada
END//

DELIMITER ;


INSERT INTO vehiculos (placa, color, marca, tipo, valor, idpersona) 
VALUES ('ABC123', 'Rojo', 'Toyota', 'Camioneta', 20.000, 1);
