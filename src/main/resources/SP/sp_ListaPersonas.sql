CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_listaPersonas`()
BEGIN
select *from persona;
END