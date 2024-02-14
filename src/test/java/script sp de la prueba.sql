use ficha;
DELIMITER //
CREATE PROCEDURE ObtenerUsu_por_cedula(
    IN p_Ced VARCHAR(100)
)
BEGIN
    SELECT nombres, apellidos 
    FROM ficha.persona
    WHERE Cedula = p_Ced;
END //
DELIMITER ;

DELIMITER //
CREATE PROCEDURE sp_guardar_vehiculo(
IN placa varchar(45),
IN color varchar(45), 
IN marca varchar(45), 
IN tipo varchar(45),
IN valor varchar(45)
IN cedeula int;
)
BEGIN
INSERT INTO persona (placa,color,marca,tipo,valor,idpersona) 
values (nombre,apellido,cedula,usuario,clave);
END
DELIMITER ;
