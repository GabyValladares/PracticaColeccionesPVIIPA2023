CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_InicioSesion`(
IN us VARCHAR(45), IN cl VARCHAR(45),
OUT respuesta int
)
BEGIN
DECLARE reg INT;
SET reg=0;
select  COUNT(*) INTO reg from persona WHERE usuario=us AND clave=cl;
	IF(reg>0)	
then 
	set respuesta=1;
else
	set respuesta=0;
end if;
END