

DELIMITER //

CREATE PROCEDURE ObtenerNombresCompletos (IN cedula_param INT)
BEGIN
    DECLARE nombres_completos VARCHAR(100);
    
    SELECT CONCAT(nombres, ' ', apellidos) INTO nombres_completos
    FROM persona
    WHERE cedula = cedula_param;
    
    SELECT nombres_completos AS Nombres_Completos;
END//
DELIMITER ;
CALL ObtenerNombresCompletos(1004454581);
