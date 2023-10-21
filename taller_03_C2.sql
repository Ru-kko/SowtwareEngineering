CREATE TABLE Club (
  idClub INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  nombreClub VARCHAR(255) NOT NULL,
  estado ENUM("Active", "Inactive") NOT NULL DEFAULT "Active"
);

CREATE TABLE PrecioClub (
  idPrecio INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  fecha TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  precio DECIMAL(4,2) NOT NULL,
  idClub INT NOT NULL,
  FOREIGN KEY(idClub) REFERENCES Club(idClub)
);

CREATE TABLE Socio (
  idSocio INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  nombrerSocio VARCHAR(255) NOt NULL
);

CREATE TABLE Barco (
  idBarco INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  matricula INT NOT NULL,
  amarre INT NOT NULL,
  CONSTRAINT fk_club
    FOREIGN KEY(amarre) REFERENCES Club(idClub)
);

CREATE TABLE Salida (
  idSalida INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  fecha TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  idClub INT NOT NULL,
  precio INT NOT NULL, --TODO make trigger to set current club price
  CONSTRAINT fk_destino FOREIGN KEY (idClub)
    REFERENCES Club(idClub),
  FOREIGN KEY(precio) REFERENCES PrecioClub(idPrecio)
);

CREATE TABLE SocioViaje (
  idSalida INT NOT NULL,
  idSocio INT NOT NULL,
  PRIMARY KEY(idSalida, idSocio),
  FOREIGN KEY(idSalida) REFERENCES Salida(idSalida),
  FOREIGN KEY(idSocio) REFERENCES Socio(idSocio)
);

DELIMITER //
CREATE PROCEDURE _club( 
  IN pOperation ENUM("ingresar", "actualizar", "borrar"),
  IN pIdClub INT, 
  IN pNombreClub VARCHAR(255), 
  IN pState ENUM("Active", "Inactive"))
BEGIN
  IF pOperation = "ingresar" THEN
    INSERT INTO Club (
      idClub, nombreClub, estado
    ) VALUES ( pIdClub, pNombreClub, pState );
  ELSEIF pOperation = "actualizar" THEN
    UPDATE Club
      SET nombreClub = pNombreClub,
          estado = pState
      WHERE idClub = pIdClub;
  ELSEIF pOperation = "borrar" THEN
    DELETE FROM Club
      WHERE idClub = pIdClub;
  ENDIF;
END //
