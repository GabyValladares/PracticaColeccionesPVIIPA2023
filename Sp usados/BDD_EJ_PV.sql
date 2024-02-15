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
