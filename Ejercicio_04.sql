-- Procedures - Mysql - MariaDB
DELIMITER //
--                Name             Argumets ...
CREATE PROCEDURE _add_product( IN pCode VARCHAR(50), IN pProductName VARCHAR(100))
BEGIN
  INSERT INTO producto (
    Codigo
    NombreProducto
  ) VALUES ( pCode, pProductName );
END //

-- -- Usage
SET @p0='58'; SET @p1='FOO BAR'; CALL _add_product(@p0, @p1);

-- ________________________________________________________

CREATE TABLE Producto (
  IdProduct INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  ProductName VARCHAR(255) NOT NULL
  -- ...
);

CREATE TABLE User_ (
  IdUser INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL
  --  ...
);

CREATE TABLE Factura (
  IdFactura INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  createDate TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  IdUser INT NOT NULL,
  FOREIGN KEY(IdUser) REFERENCES User_(IdUser)
);

CREATE TABLE Factura_Product (
  IdProduct INT NOT NULL,
  IdFactura INT NOT NULL,
  Cuantity INT NOT NULL,
  FOREIGN KEY(IdProduct) REFERENCES Producto(IdProduct),
  FOREIGN KEY(IdFactura) REFERENCES Factura(IdFactura)
);

DELIMITER //
CREATE PROCEDURE _add_product( IN _arg_name VARCHAR(255))
BEGIN
  INSERT INTO Producto (
    ProductName
  ) VALUES ( _arg_name );
END //

DELIMITER //
CREATE PROCEDURE _add_user( IN _arg_name VARCHAR(255))
BEGIN
  INSERT INTO User_ (
    name
  ) VALUES ( _arg_name );
END //

DELIMITER //
CREATE PROCEDURE _add_factura( IN _arg_IdUser INT)
BEGIN
  INSERT INTO Factura (
    IdUser
  ) VALUES ( _arg_IdUser );
END //

CALL _add_user('Jonh Doe');
CALL _add_product('FooBar');
