DELIMITER //
CREATE PROCEDURE sp_ObtenerNombrePorCedula(
    IN cedula_pmtr INT,
    OUT nombre_res VARCHAR(45)
)
BEGIN
    SELECT nombres INTO nombre_res
    FROM persona
    WHERE cedula = cedula_pmtr;
END//

DELIMITER ;