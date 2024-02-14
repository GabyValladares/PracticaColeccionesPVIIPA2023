CREATE DEFINER=`root`@`localhost` PROCEDURE `InsertarDatosVehiculo`(
    IN cedula_param int,
    IN placa_param varchar(6),
    IN color_param varchar(45),
    IN marca_param varchar(45),
    IN tipo_param varchar(45),
    IN valor_param int
)
BEGIN

    INSERT INTO ejemplopoo_vehiculos (placa, color, marca, tipo, valor, idpersona)
    VALUES (placa_param, color_param, marca_param, tipo_param, valor_param, cedula_param);
    
    SELECT 'Los datos del vehículo se han insertado correctamente.';
END