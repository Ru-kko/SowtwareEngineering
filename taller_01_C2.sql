CREATE DATABASE Taller_01;
USE Taller_01;

CREATE TABLE Cliente (
  idCliente INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  documento BIGINT NOT NULL UNIQUE,
  nombre VARCHAR(100),
  apellido VARCHAR(100),
);

CREATE TABLE Producto (
  idProducto INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(100) NOT NULL
);

CREATE TABLE Factura (
  idFactura INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  idCliente INT NOT NULL,
  cupon VARCHAR(100),
  descuento TINYINT,
  fecha TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  FOREIGN KEY(idCliente) REFERENCES Cliente(idCliente)
);

CREATE TABLE Factura_Producto (
  idFactura INT NOT NULL,
  idProducto INT NOT NULL,
  FOREIGN KEY(idFactura) REFERENCES idFactura(idFactura),
  FOREIGN KEY(idProducto) REFERENCES Producto(attribute),
  PRIMARY KEY(idFactura, idProducto)
);

-- consulta que permita buscar todas las facturas de un cliente espesifico filtrado por documento y rango de tiempo

SELECT idFactura, cupon, fecha, descuento FROM Factura AS f 
  INNER JOIN Cliente AS c ON f.idCliente = c.idCliente 
  WHERE c.documento = 1024486403 AND
  (fecha BETWEEN "2023-08-01" AND "2023-09-01");

-- consulta que presente tod  la informacion de los productos adquiridos en una factura filtrada por numero de factura

SELECT idFactura, p.nombre FROM Factura_Producto AS pf 
  INNER JOIN Factura AS f ON f.idFactura = pf.idFactura 
  INNER JOIN Producto AS p ON p.idProducto = pf.idProducto
  WHERE f.idFactura = 1;

-- trigger en la tabla factura que permita configurar si hay descuento o no antes de incertar el
-- registro, si la columna de cupon no es nula el descuento es 1 de lo contrari es 0

DELIMITER //
CREATE TRIGGER _set_discount BEFORE INSERT ON Factura
FOR EACH ROW BEGIN
  IF NEW.cupon = NULL THEN
    SET NEW.descuento = 0;
  ELSE
    SET NEW.descuento = 1;
  END IF;
END;//


-- Functions

-- ASCII retorna el numero ASCCI del primer digito
SELECT ASCII("Jon doe") AS numerASCII; -- J -> 74

-- CHARACTER_LENGTH y CHARA_LENGTH
-- retorna la longitud de una cadena
SELECT CHARA_LENGTH("fizz") AS len; -- fizz -> 4
SELECT CHARACTER_LENGTH("fizz") AS len; -- fizz -> 4


-- CONCAT
-- concatena dos o mas cadenas
SELECT CONCAT("frist", "second", "third") AS concat; --> "fristsecondthird"

-- CONCAT_WQ
-- concatena con un separador
SELECT CONCAT_WS("-", "frist", "second", "third") AS concat; --> "frist-second-third"

-- FIELD
-- retorna la posicion primera de en valor en una lista

SELECT FIELD(10, 1, 3, 11, 10) AS fielOfTen; --> 4
SELECT FIELD("c", "b", "c", "d", "c") AS fielOfTen; --> 2

-- FORMAT
-- retorna el numero de decimales redondeando al mas cercano

SELECT FORMAT(1254.215, 2) AS withTwoDecimals; --> 1254.21
SELECT FORMAT(1254.219, 2) AS withTwoDecimals; --> 1254.22

-- INSERT
-- Remplaza una cantidad de caracteres con los caracteres de un segundo string
SELECT INSERT("W3Schools.com", 1, 9, "Example"); --> Example.com
SELECT INSERT("W3Schools.com", 1, 5, "Example"); --> Example3Schools.com

-- (LOWER, LCASE) y (UPPER, UCASE)
-- Transforma en mayusculas o minusculas segun la funcion
SELECT LOWER("aAbB") AS minusculas; --> aabb
SELECT UPPER("aAbB") AS mayusculas; --> AABB
SELECT UCASE("aAbB") AS mayusculas2; --> AABB

-- INSTR, LOCATE, POSITION
-- Retorna la primera posicion de un valor en un string
SELECT INSTR("hello-world", "-") AS minusPos; --> 6
SELECT LOCATE("hello-world", "-") AS minusPos; --> 6
SELECT POSITION("hello-world", "-") AS minusPos; --> 6

-- LEFT RIGTH
-- extra n numero de caracteres desde la izquierda o derecha
SELECT LEFT("abcde", 2) AS fristTwo; --> ab
SELECT RIGTH("abcde", 2) AS fristTwo; --> de

-- LPAD RPAD
-- agerga una cadena una cantidad de veces hasta la longitud n desde la izquierda o derecha
SELECT LPAD("FIZZBUZZ", 20, "ABC"); --> ABCABCABCABCFIZZBUZZ
SELECT RPAD("FIZZBUZZ", 20, "ABC"); --> FIZZBUZZABCABCABCABC

-- MID
-- extrae una parte de una cadena empezando desde cualquier posicion
SELECT MID("abcdefghi", 5, 3) AS ExtractString; --> efg

-- Repeat
-- Repite un string n veces

SELECT REPEAT("a", 3); --> aaa

-- REPLACE
-- Remplaza los caracteres iguales con otra cadena

SELECT REPLACE("Jonh Doe", "Doe", "Jonh"); --> Jonh Jonh

-- REVERSE
-- Crea un string con los caracteres en reversa
SELECT REVERSE("abc"); --> cba


-- SUBSTRING
-- extrae una parte de una cadena en cualquier posicion
SELECT SUBSTRING("FOOBAR", 2, 4); --> OOBA
SELECT SUBSTR("FOOBAR", 2, 4); --> OOBA
