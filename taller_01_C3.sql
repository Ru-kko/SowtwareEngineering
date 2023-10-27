CREATE TABLE  Asociacion(
  IdAsociacion INT NOT  NULL PRIMARY KEY AUTO_INCREMENT,
  asociacionName VARCHAR(255) NOT NULL
);

CREATE TABLE Zoologico (
  idZoologico INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  zooName VARCHAR(255) NOT NULL,
  idAsociacion INT NOT NULL,
  fundationDate DATE NOT NULL,
  categorizado TINYINT(1) NOT NULL,
  FOREIGN KEY(idAsociacion) REFERENCES Asociacion(IdAsociacion)
);

CREATE TABLE Familia (
  idFamilia INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  familiaName VARCHAR(255) NOT NULL
);

CREATE TABLE Especie (
  idEspecie INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  idFamilia INT NOT NULL,
  especieName VARCHAR(255) NOT NULL,
  FOREIGN KEY(idFamilia) REFERENCES Familia(idFamilia)
);

CREATE TABLE zoo_especie (
  idZoologico INT NOT NULL,
  idEspecie INT NOT NULL,
  FOREIGN KEY(idEspecie) REFERENCES Especie(idEspecie),
  FOREIGN KEY(idZoologico) REFERENCES Zoologico(idZoologico)
);

-- SP que administre familias

DELIMITER //
CREATE PROCEDURE _manage_family( IN pAction ENUM("POST", "PUT", "DELETE"), IN pFamilyID INT, IN pName VARCHAR(255))
BEGIN
  IF pAction = "POST" THEN
    INSERT INTO Familia (idFamilia, familiaName) VALUES ( pFamilyID, pName );
  ELSEIF pAction = "PUT" THEN
    UPDATE Familia
      SET familiaName = pName
      WHERE idFamilia = pFamilyID;
  ELSEIF pAction = "DELETE" THEN
    DELETE FROM Familia
      WHERE idFamilia = pFamilyID;
  END IF;
END //

-- SP que registre zoos. La columna categorizado depende del año de fundacion, si el año <= 1980 no es categorizado

DELIMITER //
CREATE PROCEDURE _insert_zoo(IN pZooName VARCHAR(255), IN pAsociacion INT, IN pFundacion DATE)
BEGIN
  IF YEAR(pFundacion) <= 1980 THEN
    INSERT INTO Zoologico (zooName,idAsociacion,fundationDate,categorizado) 
      VALUES (pZooName, pAsociacion, pFundacion, 0);
  ELSE
    INSERT INTO Zoologico (zooName,idAsociacion,fundationDate,categorizado) 
      VALUES (pZooName, pAsociacion, pFundacion, 1);
  END IF;
END //

-- Vista que presente todas la especias de una familia espesifica

CREATE VIEW felinos AS
  SELECT idEspecie, especieName, familiaName FROM Especie AS e
    INNER JOIN Familia AS f ON f.idFamilia = e.idFamilia
    WHERE f.familiaName = "Felino";

-- Vista que presente todos los animales con toda su data

CREATE VIEW animales AS
  SELECT ez.idZoologico, z.zooName, e.especieName, f.familiaName  FROM zoo_especie AS ez
    INNER JOIN Zoologico AS z ON z.idZoologico = ez.idZoologico
    INNER JOIN Especie AS e ON e.idEspecie = ez.idEspecie
    INNER JOIN Familia AS f ON f.idFamilia = e.idFamilia;
