CREATE DEFINER=`root`@`localhost` PROCEDURE `AgregarVehiculo`(
    IN placa_param VARCHAR(50),
    IN color_param VARCHAR(45),
    IN marca_param VARCHAR(45),
    IN tipo_param VARCHAR(45),
    IN valor_param double
)
BEGIN
    DECLARE Ultimapersonaid INT;

    SELECT idpersona INTO Ultimapersonaid
    FROM persona
    ORDER BY idpersona DESC
    LIMIT 1;

    INSERT INTO vehiculos (placa, color, marca, tipo, valor, idpersona)
    VALUES (placa_param, color_param, marca_param, tipo_param, valor_param, Ultimapersonaid);
END



CREATE DEFINER=`root`@`localhost` PROCEDURE `ObtenerPropietario`(
    IN cedula_propietario INT
)
BEGIN
    DECLARE nombres_propietario VARCHAR(100);


    SELECT CONCAT(nombres, ' ', apellidos) INTO nombres_propietario
    FROM persona
    WHERE cedula = cedula_propietario;


    SELECT nombres_propietario AS Nombres_Completos;
END



CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ActualizarPersona`(in nI varchar(45), in aI varchar(45),
in cI int,in uI varchar(45),in claI varchar(45))
BEGIN
    Update persona set nombres=nI, apellidos=aI, usuario=uI, clave=claI  where cedula=cI;
END




CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_BuscarPersona`(IN cedulaI VARCHAR(10))
BEGIN
    select * from persona WHERE concat(cedula,'') LIKE cedulaI
    ;
END




CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_CrearPersona`(
    IN nombres_param VARCHAR(100),
    IN apellidos_param VARCHAR(100),
    IN cedula_param INT,
    IN usuario_param VARCHAR(100),
    IN clave_param VARCHAR(100) 
)
BEGIN
    INSERT INTO persona (nombres, apellidos, cedula, usuario, clave)
    VALUES (nombres_param, apellidos_param, cedula_param, usuario_param, clave_param);
END






CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_EliminarPersona`(in cedulaI int)
BEGIN
delete from persona where cedula=cedulaI;
END




CREATE DEFINER=`root`@`localhost` PROCEDURE `VehiculosPropietario`(
    IN cedula_param INT
)
BEGIN
    SELECT v.*
    FROM vehiculos v
    INNER JOIN persona p ON v.idpersona = p.idpersona
    WHERE p.cedula = cedula_param;
END