# Taller 2 y 3
<center> 
  <h2>Programacion De Bases de Datos</h2>
  <h2>Jose Sebastian Vera<h2>
</center>

# Base de datos basada en el modelo entidad relacion
Programa sql para generar las tablas:
``` sql
CREATE TABLE UserType (
  userTypeID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  name  VARCHAR(255) NOT NULL
);

CREATE TABLE User_ (
  userID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  fristName VARCHAR(255),
  lastName VARCHAR(255) NOT NULL,
  userTypeID INT NOT NULL,
  FOREIGN KEY(userTypeID) REFERENCES UserType(userTypeID)
);

CREATE TABLE Form (
  formID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  ownerID INT NOT NULL,
  formName VARCHAR(255) NOT NULL,
  CONSTRAINT FK_owner FOREIGN KEY(ownerID)
    REFERENCES User(userID)
);

CREATE TABLE Log (
  logID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  message INT NOT NULL,
  dateCreated TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

-- Inputs

CREATE TABLE InputType (
  inpTypeID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  type VARCHAR(255) NOT NULL
);

CREATE TABLE FormInput (
  inputFormId INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  required TINYINT(1) NOT NULL DEFAULT 0,
  label VARCHAR(255) NOT NULL,
  inputType INT NOT NULL,
  formId INT NOT NULL,
  FOREIGN KEY(inputType) REFERENCES InputType(inpTypeID),
  FOREIGN KEY(formId) REFERENCES Form(formID)
);

-- Register

CREATE TABLE Register (
  inputId INT NOT NULL,
  userID INT NOT NULL,
  response VARCHAR(255) NOT NULL,
  FOREIGN KEY(inputId) REFERENCES FormInput(inputFormId),
  FOREIGN KEY(userID) REFERENCES User(userID)
);
```
# Configurar 3 ejempos de formularios
**Nota:** No genero id's deforma automatica para su correcta repeticion.
## Creacion de tipos de usuarios
``` sql
INSERT INTO UserType (userTypeID, name) VALUES 
  (1, "ADMIN"),
  (2, "RESPONDENT")
  (3, "DIGITER"); -- ROLES
```
## Creacion  de usuario
Es nesesario un usuario:
- Con sentencia `INSERT`
``` sql
INSERT INTO User_ (userID, fristName, lastName, userTypeID) VALUES
  (1, "admin", "user", 1),--ADMIN USER
  (2, "digiter", "doe", 3);-- DIGITER USER
```
- Con uso del procedimiento alamcenado definido posteriormente
``` sql 
  CALL _user_admin("ingresar", 1, "admin", "user", 1);
  CALL _user_admin("ingresar", 2, "digiter", "doe", 3);
```
**Nota:** Solo es posible usar un metodo de los mencionados anteriormente, puesto que se repiten los id's.

## Formularios
### Formulario para el registro de usuarios
- Creando el formulario
``` sql
INSERT INTO Form (formID, ownerID, formName) VALUES 
  (1, 1, "User"); -- Con insert
  
CALL _form_admin("ingresar", 1, "User", 1);
```
- Creando los inputs
``` sql
INSERT INTO FormInput (inputFormId, required, label, inputType, formId) VALUES
  (1, 1, "Name", 3, 1), -- name: TEXT, REQUIRED
  (2, 1, "Email", 2, 1), -- Email: EMAIL, REQUIRED,
  (3, 0, "AGE", 1, 1); -- AGE: INT, NOT REQUIRED
```
### Formulario para la insercion de marcas de autos
- Creando el formulario
``` sql
INSERT INTO Form (formID, ownerID, formName) VALUES 
  (2, 1, "Car"); -- Con insert
  
CALL _form_admin("ingresar", 2, "Car", 1);
```
- Creando los inputs
``` sql
INSERT INTO FormInput (inputFormId, required, label, inputType, formId) VALUES
  (4, 1, "MODEL", 3, 2), -- MODEL: TEXT, REQUIRED
  (5, 1, "BRAND", 3, 2); -- BRAND: TEXT, REQUIRED
```
### Formulario para la insercion de Libros
- Creando el formulario
``` sql
INSERT INTO Form (formID, ownerID, formName) VALUES 
  (3, 1, "Book"); -- Con insert
  
CALL _form_admin("ingresar", 3, "Book", 1);
```
- Creando los inputs
``` sql
INSERT INTO FormInput (inputFormId, required, label, inputType, formId) VALUES
  (6, 1, "NAME", 3, 3),  -- NAME: TEXT, REQUIRED
  (7, 1, "PAGES", 1, 3), -- PAGES: INT, REQUIRED
  (8, 1, "AUTHOR", 3, 3); -- AUTHOR: TEXT, REQUIRED
```
# Procedimiento almacenado para administrar formularios

``` sql
DELIMITER //
CREATE PROCEDURE _form_admin( 
  IN pOperation ENUM("ingresar", "actualizar", "borrar"),
  IN pIdForm INT, 
  IN pFormName VARCHAR(255), 
  IN pUserID INT)
BEGIN
  IF pOperation = "ingresar" THEN
    INSERT INTO Form (
      formID, ownerID, formName
    ) VALUES ( pIdForm, pUserID, pFormName );
  ELSEIF pOperation = "actualizar" THEN
    UPDATE Form
      SET formName = pFormName,
          ownerID = pUserID
      WHERE formID = pIdForm;
  ELSEIF pOperation = "borrar" THEN
    DELETE FROM Form
      WHERE formID = pIdForm;
  END IF;
END //
```
# Vista que muestre todos los campos con sus respectivos labels
``` sql
CREATE VIEW usersForm AS
	SELECT inp.label, inp.required, ity.type 
		FROM FormInput AS inp 
		INNER JOIN InputType AS ity 
		ON ity.inpTypeID = inp.inputType 
		WHERE inp.formId = 1; 
```
**Resultado:** <br>
![](/temp/users_view.png)

# Vista que presente la cantidad de campos configurados para un formulario
Mostrara una tabla la cual contendra el id del formulario,  el nombre de este, y la cantidad
``` sql
CREATE VIEW inputFormCount AS
  SELECT F.formID, F.formName, COUNT(I.inputFormId) AS inputCount
    FROM Form F
    INNER JOIN FormInput I ON F.formID = I.formID
  GROUP BY F.formID, F.formName;
```
**Resultado:** <br>
![](/temp/inp_count.png) <br>

# Una vista con los valores digitados por un usuario
Se tomaran los valores digitados por el usuario con id 2 en el formulario con id 1
``` sql
CREATE VIEW inputResponseUsersFromJonhDoe AS
  SELECT FI.label, FI.inputFormId, R.response FROM Register AS R 
	INNER JOIN FormInput AS FI ON R.inputId = FI.inputFormId
    WHERE FI.formID = 1 AND R.userID = 2;
```

# Vista que indique la cantidad de campos tipo fecha que puede tener un campo determinado
``` sql
CREATE VIEW dateInputCount AS
  SELECT F.formID, F.formName, COUNT(I.inputFormId) AS inputCount
    FROM Form F
    INNER JOIN FormInput I ON F.formID = I.formID
    INNER JOIN InputType IT ON IT.inpTypeID = I.inputType
    WHERE IT.type = "DATE"
  GROUP BY F.formID, F.formName;
```
**Resultado** <br>
![](/temp/text_count.png) <br>
**Nota:** Al no tener ningun formulario con inputs de tipo date para replicar lo anterior es nesesario cambiar la linea No° 6 donde dice `INT` a `TEXT`

# Procedimiento que permita administrar la tabla usuario

``` sql
DELIMITER //
CREATE PROCEDURE _user_admin( 
  IN pOperation ENUM("ingresar", "actualizar", "borrar"),
  IN pIdUser INT, 
  IN pFristName VARCHAR(255), 
  IN pLastName VARCHAR(255), 
  IN pType INT)
BEGIN
  IF pOperation = "ingresar" THEN
    INSERT INTO User_ (
      fristName, lastName, userTypeID
    ) VALUES ( pFormName, pLastName, pType );
  ELSEIF pOperation = "actualizar" THEN
    UPDATE User_
      SET fristName = pFristName,
          lastName = pLastName,
          userTypeID = pUserID
      WHERE userID = pUserID;
  ELSEIF pOperation = "borrar" THEN
    DELETE FROM User_
      WHERE userID = pUserID;
  END IF;
END //

```

# Crear un indice para la tabla usuario
``` sql
ALTER TABLE Form ADD INDEX(formName);
```

# Crear un trigger que realice un log al crear formularios
``` sql
DELIMITER //
CREATE TRIGGER _log_oninsert AFTER INSERT ON Form
FOR EACH ROW BEGIN
  DECLARE creatorName VARCHAR(255);

  SELECT CONCAT(fristName, ' ', lastName) INTO creatorName
    FROM User_
    WHERE userID = NEW.ownerID;

  INSERT INTO Log (message) VALUES
    (CONCAT(
      "INFO: Se incerto un formulario con el id: ",
      NEW.formID,
      ", denominado: ",
      NEW.formName,
      ", creado por: ",
      creatorName
    ));
END;//
```