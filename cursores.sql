--- La universidad comprensar tiene varias sedes a nivel nacional. 
--- En cada sede tienen organizadas una zona en las se encuentran los salones

-- crear un cursor en la tabla universidad, en la cual se, maneja la siguientes columnas:
-- --idUniversidad
-- --nombre
-- --activo
-- --clase
-- --obsevacion
CREATE DATABASE taller_2;

CREATE TABLE Universidad (
  idUniversidad INT NOT NULL AUTO_INCREMENT PRiMARY KEY,
  nombre VARCHAR(255) NOT NULL,
  activo TINYINT(1),
  clase ENUM("A", "B", "C"),
  obsevacion VARCHAR(255)
);

CREATE TABLE Sede (
  idSede INT NOT NULL AUTO_INCREMENT PRiMARY KEY,
  idUniversidad INT NOT NULL,
  locacion VARCHAR(255) NOT NULL,
  FOREIGN KEY(idUniversidad) REFERENCES Universidad(idUniversidad)
);

CREATE TABLE Zona (
  idZona INT NOT NULL AUTO_INCREMENT PRiMARY KEY,
  idSede INT NOT NULL,
  nombreZona VARCHAR(255) NOT NULL,
  FOREIGN KEY(idSede) REFERENCES Sede(idSede)
);

CREATE TABLE Salon (
  idSalon INT NOT NULL AUTO_INCREMENT PRiMARY KEY,
  aforo INT NOT NULL,
);

-- Cursor
DELIMITER //
DROP PROCEDURE IF EXISTS _set_observacion//
CREATE PROCEDURE _set_observacion()
BEGIN
  DECLARE var_id_universidad INT;
  DECLARE var_clase ENUM("A", "B", "C");
  
  DECLARE cursorA CURSOR FOR SELECT idUniversidad, clase FROM Universidad;
  
  OPEN cursorA;
  bucle: LOOP

    FETCH cursorA INTO var_id_universidad, var_clase;

    IF var_clase = "A" THEN
      UPDATE Universidad SET obsevacion='Alta Calidad' WHERE idUniversidad=var_id_universidad;
    ELSEIF var_clase = "B" THEN
      UPDATE Universidad SET obsevacion='Media Categoria' WHERE idUniversidad=var_id_universidad;
    ELSEIF var_clase = "C" THEN
      UPDATE Universidad SET obsevacion='Fundacion Educativa' WHERE idUniversidad=var_id_universidad;
    END IF;
  END LOOP bucle;
  CLOSE cursorA;
END //

CALL _set_observacion();
DELIMITER;


