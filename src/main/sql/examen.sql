CREATE TABLE persona (
  idpersona INT NOT NULL AUTO_INCREMENT,
  nombres VARCHAR(45) NOT NULL,
  apellidos VARCHAR(45) NOT NULL,
  cedula INT NOT NULL,
  usuario VARCHAR(45) NOT NULL,
  clave VARCHAR(45) NOT NULL,  
  PRIMARY KEY (idpersona));

CREATE TABLE vehiculos (
  idvehiculos INT NOT NULL AUTO_INCREMENT,
  placa VARCHAR(6) NOT NULL,
  color VARCHAR(45) NOT NULL,
  marca VARCHAR(45) NOT NULL,
  tipo VARCHAR(45) NOT NULL,
  valor INT NOT NULL,
  idpersona INT NOT NULL,
  PRIMARY KEY (idvehiculos),
   INDEX (idpersona),
    FOREIGN KEY (idpersona) REFERENCES persona(idpersona));


DELIMITER //
CREATE PROCEDURE `sp_CrearPersona` (
IN nombre varchar(45), IN apellido varchar(45), 
IN cedula int, IN usuario varchar(45),
IN clave varchar(45)
)
BEGIN
INSERT INTO persona (nombres,apellidos,cedula,usuario,clave) 
values (nombre,apellido,cedula,usuario,clave);
END // 
DELIMITER ;

DELIMITER //
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_EliminarPersona`(in cedulaI int)
BEGIN
delete from persona where cedula=cedulaI;
END // 
DELIMITER ;

DELIMITER //
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_BuscarPersona`(IN cedulaI VARCHAR(10))
BEGIN
	select * from persona WHERE concat(cedula,'') LIKE cedulaI
    ;
END// 
DELIMITER ;

DELIMITER //
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ActualizarPersona`(in nI varchar(45), in aI varchar(45),
in cI int,in uI varchar(45),in claI varchar(45))
BEGIN
	Update persona set nombres=nI, apellidos=aI, usuario=uI, clave=claI  where cedula=cI;
END// 
DELIMITER ;


DELIMITER //

CREATE PROCEDURE `sp_CrearVehiculo` (
    IN p_placa VARCHAR(6), 
    IN p_color VARCHAR(45), 
    IN p_marca VARCHAR(45), 
    IN p_tipo VARCHAR(45), 
    IN p_valor INT, 
    IN p_idpersona INT
)
BEGIN
    INSERT INTO vehiculos (placa, color, marca, tipo, valor, idpersona) 
    VALUES (p_placa, p_color, p_marca, p_tipo, p_valor, p_idpersona);
END //

CREATE PROCEDURE `sp_EliminarVehiculo` (IN p_idvehiculo INT)
BEGIN
    DELETE FROM vehiculos WHERE idvehiculos = p_idvehiculo;
END //

CREATE PROCEDURE `sp_BuscarVehiculo` (IN p_placa VARCHAR(6))
BEGIN
    SELECT * FROM vehiculos WHERE placa LIKE p_placa;
END //

CREATE PROCEDURE `sp_ActualizarVehiculo` (
    IN p_idvehiculo INT, 
    IN p_placa VARCHAR(6), 
    IN p_color VARCHAR(45), 
    IN p_marca VARCHAR(45), 
    IN p_tipo VARCHAR(45), 
    IN p_valor INT, 
    IN p_idpersona INT
)
BEGIN
    UPDATE vehiculos 
    SET placa = p_placa, color = p_color, marca = p_marca, tipo = p_tipo, valor = p_valor, idpersona = p_idpersona
    WHERE idvehiculos = p_idvehiculo;
END //

DELIMITER ;
