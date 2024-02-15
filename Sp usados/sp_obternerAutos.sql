DELIMITER //
CREATE PROCEDURE ObtenerAutosPorCedula(IN p_Cedula int)
BEGIN
    DECLARE idpersona INT;

    SELECT idpersona  INTO idpersona
    FROM Personas
    WHERE cedula = p_Cedula;
persona
    SELECT V.placa, V.marca, V.tipo, V.color, V.valor
    FROM vehiculos V
    INNER JOIN persona PV ON V.idpersona = PV.idpersona
    WHERE PV.idpersona = idpersona;
END
DELIMITER //