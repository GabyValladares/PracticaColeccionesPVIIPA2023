CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_CrearPersona`(
IN nombre varchar(45), IN apellido varchar(45), 
IN cedula int, IN usuario varchar(45),
IN clave varchar(45)
)
BEGIN
INSERT INTO persona (nombres,apellidos,cedula,usuario,clave) 
values (nombre,apellido,cedula,usuario,clave);
END