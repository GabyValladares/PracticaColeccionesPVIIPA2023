DELIMITER //
-- Eliminar un vehículo por placa
CREATE PROCEDURE EliminarVehiculo(
    IN p_placa VARCHAR(6)
)
BEGIN
    DELETE FROM vehiculos WHERE placa = p_placa;
END//

-- Buscar un vehículo por placa
CREATE PROCEDURE BuscarVehiculo(
    IN p_placa VARCHAR(6)
)
BEGIN
    SELECT * FROM vehiculos WHERE placa = p_placa;
END//

-- Modificar un vehículo por placa
CREATE PROCEDURE ModificarVehiculo(
    IN p_placa VARCHAR(6),
    IN p_nuevo_color VARCHAR(45),
    IN p_nueva_marca VARCHAR(45),
    IN p_nuevo_tipo VARCHAR(45),
    IN p_nuevo_valor INT,
    IN p_nuevo_idpersona INT
)
BEGIN
    UPDATE vehiculos
    SET color = p_nuevo_color,
        marca = p_nueva_marca,
        tipo = p_nuevo_tipo,
        valor = p_nuevo_valor,
        idpersona = p_nuevo_idpersona
    WHERE placa = p_placa;
END//

DELIMITER ;
