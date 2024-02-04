CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_BuscarPersona`(IN cedulaI VARCHAR(10))
BEGIN
	select * from persona WHERE concat(cedula,'') LIKE cedulaI
    ;
END