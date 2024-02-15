delimiter //
CREATE PROCEDURE sp_InsertarVehiculo(
    IN cedula_param INT,
    IN placa_param VARCHAR(6),
    IN color_param VARCHAR(45),
    IN marca_param VARCHAR(45),
    IN tipo_param VARCHAR(45),
    IN valor_param INT
)
BEGIN
    INSERT INTO vehiculos (placa, color, marca, tipo, valor, idpersona)
    VALUES (placa_param, color_param, marca_param, tipo_param, valor_param, 
            (SELECT idpersona FROM persona WHERE cedula = cedula_param));
    SELECT 'Vehículo guardado exitosamente.' AS mensaje;
END;
delimiter //