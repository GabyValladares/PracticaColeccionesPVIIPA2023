CREATE DEFINER=`root`@`localhost` PROCEDURE `ObtenerNombresPersona`(
    IN cedula_param int
)
BEGIN
    DECLARE nombresCompletos VARCHAR(45);

    SELECT CONCAT(nombres, ' ', apellidos) INTO nombresCompletos
    FROM persona
    WHERE cedula = cedula_param;

    IF nombresCompletos IS NOT NULL THEN
        SELECT CONCAT(nombresCompletos);
    ELSE
        SELECT 'No se encontró ningún propietario con la cédula proporcionada.';
    END IF;
END