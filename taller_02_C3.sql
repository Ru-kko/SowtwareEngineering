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

-- INITIAL DATA
INSERT INTO UserType (userTypeID, name) VALUES 
  (1, "ADMIN"),
  (2, "RESPONDENT")
  (3, "DIGITER"); -- ROLES

INSERT INTO User_ (userID, fristName, lastName, userTypeID) VALUES
  (1, "admin", "user", 1),--ADMIN USER
  (2, "digiter", "doe", 3);-- DIGITER USER

INSERT INTO InputType (inpTypeID, type) VALUES 
  (1, "INT"),
  (2, "EMAIL"),
  (3, "TEXT"),
  (4, "DATE"); -- INPUT TYPES

-- Form Examples
--- User Register [name, email, age]

INSERT INTO Form (formID, ownerID, formName) VALUES 
  (1, 1, "User");
INSERT INTO FormInput (inputFormId, required, label, inputType, formId) VALUES
  (1, 1, "Name", 3, 1), -- name: TEXT, REQUIRED
  (2, 1, "Email", 2, 1), -- Email: EMAIL, REQUIRED,
  (3, 0, "AGE", 1, 1); -- AGE: INT, NOT REQUIRED

--- Car Register [model, brand]
INSERT INTO Form (formID, ownerID, formName) VALUES 
  (2, 1, "Car");
INSERT INTO FormInput (inputFormId, required, label, inputType, formId) VALUES
  (4, 1, "MODEL", 3, 2), -- MODEL: TEXT, REQUIRED
  (5, 1, "BRAND", 3, 2); -- BRAND: TEXT, REQUIRED

--- BookRegister [Author, Name, Pages] 
INSERT INTO Form (formID, ownerID, formName) VALUES 
  (3, 1, "Book");
INSERT INTO FormInput (inputFormId, required, label, inputType, formId) VALUES
  (6, 1, "NAME", 3, 3),  -- NAME: TEXT, REQUIRED
  (7, 1, "PAGES", 1, 3), -- PAGES: INT, REQUIRED
  (8, 1, "AUTHOR", 3, 3); -- AUTHOR: TEXT, REQUIRED

-- Procedimiento que administre forms

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

-- Vista con todos los labels es inputs del form de usuarios
-- Form Users
CREATE VIEW usersForm AS
	SELECT inp.label, inp.required, ity.type 
		FROM FormInput AS inp 
		INNER JOIN InputType AS ity 
		ON ity.inpTypeID = inp.inputType 
		WHERE inp.formId = 1; 

-- Vista con la cantidad de campos que tiene un formulario
CREATE VIEW inputFormCount AS
  SELECT F.formID, F.formName, COUNT(I.inputFormId) AS inputCount
    FROM Form F
    INNER JOIN FormInput I ON F.formID = I.formID
  GROUP BY F.formID, F.formName;

-- Vista con los valores digitados por un usuario determinado
-- Usuario 2 Digiter, Formulario: 1 User
CREATE VIEW inputResponseUsersFromJonhDoe AS
  SELECT FI.label, FI.inputFormId, R.response FROM Register AS R 
	INNER JOIN FormInput AS FI ON R.inputId = FI.inputFormId
    WHERE FI.formID = 1 AND R.userID = 2;

-- Vista que presente la cantidad de campos de tipo fecha
CREATE VIEW dateInputCount AS
  SELECT F.formID, F.formName, COUNT(I.inputFormId) AS inputCount
    FROM Form F
    INNER JOIN FormInput I ON F.formID = I.formID
    INNER JOIN InputType IT ON IT.inpTypeID = I.inputType
    WHERE IT.type = "DATE"
  GROUP BY F.formID, F.formName;

-- Procedimiento que administre usuarios
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

-- Crear un indice para el nombre de form
ALTER TABLE Form ADD INDEX(formName);

-- Crear triger que realize un log
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
