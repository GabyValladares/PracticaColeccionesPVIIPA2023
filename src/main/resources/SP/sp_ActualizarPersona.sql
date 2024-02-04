CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ActualizarPersona`(in nI varchar(45), in aI varchar(45),
in cI int,in uI varchar(45),in claI varchar(45))
BEGIN
	Update persona set nombres=nI, apellidos=aI, usuario=uI, clave=claI  where cedula=cI;
END