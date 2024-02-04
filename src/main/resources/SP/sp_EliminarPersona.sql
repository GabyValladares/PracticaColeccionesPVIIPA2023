CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_EliminarPersona`(in cedulaI int)
BEGIN
delete from persona where cedula=cedulaI;
END