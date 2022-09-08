CREATE DATABASE IF NOT EXISTS supermarkert;

USE supermarkert;

-- Client table

CREATE TABLE IF NOT EXISTS cliente(
    ID_cliente INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(125) NOT NULL,
    direccion VARCHAR(100),
    telefono BIGINT,
    Ciudad VARCHAR(20)
);

-- Product 

CREATE TABLE IF NOT EXISTS producto(
    ID_producto INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    descripcion TEXT(500),
    precio INT
);

-- Sells

CREATE TABLE IF NOT EXISTS ventas(
    ID_ventas INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    cantidad INT NOT NULL,
    ID_cliente INT NOT NULL,
    CONSTRAINT sell_customer FOREIGN KEY(ID_cliente) REFERENCES cliente(ID_cliente),
    ID_producto INT NOT NULL,
    CONSTRAINT product_reference FOREIGN KEY(ID_producto) REFERENCES producto(ID_producto)
);


-- INSERTING

--- CLient
 
INSERT INTO cliente(nombre, direccion, telefono, Ciudad) VALUES
	("PEPE", "Calle 22", 3224548216, "BOGOTA"), -- 1
	("Luiz", "Diagonal 34", 3138956321, "BOGOTA"), -- 2	
	("JUAN", "Calle 45", 3217957280, "BOGOTA"), -- 3
	("Maria", "Calle 72", 3254211408, "BOGOTA"), -- 4
	("Raul", "Carrera 22", 3126542518, "BOGOTA"), -- 5
	("Jose", "Diagonal 24", 3542653515, "BOGOTA"), -- 6 
	("Vladimir", "Carrera 25", 3244625362, "BOGOTA"), -- 7 
	("Nicolas", "Calle 54", 3224653595, "BOGOTA"), -- 8 
	("Sergio", "Carrera 25", 3152658345, "BOGOTA"), -- 9 
	("Andres", "Calle 22", 3245612458, "BOGOTA"), -- 10
	("Julian", "Calle 24", 35268523491, "BOGOTA"); -- 11

--- Product

INSERT INTO producto(descripcion, precio) VALUES
	("Gaseosa personal", 1800), -- 1
	("Gaseosa familiar", 4500), -- 2
	("Docena de huevos", 5200), -- 3
	("Litro de aceite", 9300), -- 4
	("Libra de arroz", 1400), -- 5
	("Kilo de azucar", 7350), -- 6
	("Paquete de dulces", 4500), -- 7
	("Nuggets congelados", 15200), -- 8
	("Chupeta", 300), -- 9
	("Libra de sal", 3000); -- 10

--- Sells

INSERT INTO ventas(ID_ventas, ID_producto, ID_cliente, cantidad) VALUES
	(1, 1, 2, 4),
	(2, 9, 2, 4),
	(3, 3, 3, 1),
	(4, 1, 2, 1),
	(5, 6, 7, 1),
	(6, 5, 4, 1),
	(7, 10, 9, 1),
	(8, 2, 1, 1),
	(9, 8, 11, 1),
	(10, 5, 5, 1);


-- Getting Data

SELECT * FROM producto;
SELECT nombre, direccion FROM cliente;