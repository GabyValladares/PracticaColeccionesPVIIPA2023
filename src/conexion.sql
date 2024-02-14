use conexión;
select*from vehiculos;
insert into persona (nombres,apellidos,cedula,usuario,clave) values 
('Cristian Bladimir ','Arciniega Oviedo','1005452071','CrissPersona','1234');
drop table vehiculos;
CREATE TABLE vehiculos (
    idvehiculos INT AUTO_INCREMENT PRIMARY KEY,
    placa VARCHAR(8),
    color VARCHAR(45),
    marca VARCHAR(45),
    tipo VARCHAR(45),
    valor INT,
    idpersona INT,
    tiene_multas BOOLEAN DEFAULT false, 
    FOREIGN KEY (idpersona) REFERENCES persona(idpersona)
);

DELIMITER //

CREATE PROCEDURE completar_nombres_por_cedula(
    IN cedula_param VARCHAR(45),
    OUT nombres_completos VARCHAR(100)
)
BEGIN
    DECLARE nombres_persona VARCHAR(100);
    
    SELECT CONCAT(nombres, ' ', apellidos) INTO nombres_persona
    FROM persona
    WHERE cedula = cedula_param;
    
    IF nombres_persona IS NOT NULL THEN
        SET nombres_completos = nombres_persona;
    ELSE
        SET nombres_completos = NULL;
    END IF;
END;

DELIMITER ;

DELIMITER //

CREATE PROCEDURE insertar_vehiculo(
    IN cedula VARCHAR(45),
    IN placa VARCHAR(6),
    IN color VARCHAR(45),
    IN aniofab VARCHAR(4),
    IN valor INT,
    IN marca VARCHAR(45),
    IN tipo VARCHAR(45),
    IN tiene_multas CHAR(4)
)
BEGIN
    DECLARE id_persona INT;
    DECLARE id_vehiculo INT;

    SELECT idpersona INTO id_persona
    FROM persona
    WHERE cedula = cedula;

    INSERT INTO vehiculos (placa, color, marca, tipo, valor, idpersona)
    VALUES (placa, color, marca, tipo, valor, id_persona);
    
    SELECT LAST_INSERT_ID() INTO id_vehiculo;

    IF tiene_multas = 'S' THEN
        UPDATE vehiculos
        SET tiene_multas = true
        WHERE idvehiculos = id_vehiculo;
    ELSE
        UPDATE vehiculos
        SET tiene_multas = false
        WHERE idvehiculos = id_vehiculo;
    END IF;
END //

DELIMITER ;
ALTER TABLE vehiculos MODIFY COLUMN tiene_multas BOOLEAN;


