DELIMITER //
CREATE PROCEDURE VehiculosPersonas(
    IN p_cedula INT
)
BEGIN
    SELECT p.cedula, p.nombres, v.placa, v.color, v.marca, v.tipo, v.valor
    FROM persona p
    INNER JOIN vehiculos v ON p.idpersona = v.idpersona
    WHERE p.cedula = p_cedula;
END //
DELIMITER ;


DELIMITER //
CREATE PROCEDURE CrearVehiculo(
    IN p_placa VARCHAR(6),
    IN p_color VARCHAR(45),
    IN p_marca VARCHAR(45),
    IN p_tipo VARCHAR(45),
    IN p_valor INT,
    IN p_cedula_persona INT
)
BEGIN
    DECLARE v_id_persona INT;
    
    -- Obtener el ID de la persona asociada a la cédula proporcionada
    SELECT idpersona INTO v_id_persona FROM persona WHERE cedula = p_cedula_persona;
    
    -- Verificar si la persona existe
    IF v_id_persona IS NULL THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'La persona con la cédula proporcionada no existe en la base de datos.';
    ELSE
        -- Insertar el nuevo vehículo en la tabla vehiculos
        INSERT INTO vehiculos (placa, color, marca, tipo, valor, idpersona)
        VALUES (p_placa, p_color, p_marca, p_tipo, p_valor, v_id_persona);
    END IF;
END //
DELIMITER ;