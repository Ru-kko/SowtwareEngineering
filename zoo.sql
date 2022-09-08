create database if not exists zoo;

use zoo;

/*          Zones            */
CREATE TABLE IF NOT EXISTS zonas(
    id int PRIMARY KEY NOT NULL auto_increment,
    nombre_zona VARCHAR(25) NOT NULL 
);

--  Adding zones
INSERT INTO zonas(id, nombre_zona) VALUES
    (1, "Norte"),
    (2, "Sur"),
    (3, "Centro"),
    (4, "Oriente"),
    (5, "Occidente");


/*          Zoos             */
CREATE TABLE IF NOT EXISTS  zoo(
    id int not null auto_increment primary key,
    nombre varchar(150) not null,
    ciudad varchar(50) not null,
    direccion varchar(150) not null,
    telefono bigint,
    size int,
    presupuesto int,
    zona int NOT NULL,
    CONSTRAINT zoo_location FOREIGN KEY(zona) REFERENCES zonas(id)
);

-- Adding Zoos

INSERT INTO zoo (nombre, ciudad, direccion, zona) VALUES
    ("Acuario Mundo Marino Santa Marta", "Santa Marta", "unknow", 1),
    ("Zoologico De Barranquilla", "Barranquilla", "unknow", 1),
    ("Aviario Nacional De La Isla Baru", "Baru", "unknow", 1),
    ("Oceanario Islas Del Rosario", "Islas Del Rosario", "unknow", 1),
    ("Acuario Parque Explora Antioquia", "Antioquia", "unknow", 3),
    ("Parque Zoologico Santa Fe Medellin", "Medellin", "unknow", 3),
    ("Fundacion Zoologico Santacruz", "San Antonio del Tequendama", "unknow", 3),
    ("Zoologico De Cali", "Cali", "unknow", 5),
    ("Parque Recreativo Zoologico Piscilago", "Giraardd", "unknow", 5),
    ("Bioparque Ukumari Pereira", "Pereira", "unknow", 5);

/*            Animals           */
CREATE TABLE IF NOT EXISTS  animal(
    id int not null primary key auto_increment,
    nombre varchar(150) not null,
    nombre_cientifico varchar(150) not null,
    familia varchar(100),
    ingreso Date not null,
    nivel_peligro varchar(25),
    born_date Date not null,
    genero varchar(10),
    pais varchar(50),
    continente varchar(25),
    locacion int not null,
    constraint zoo FOREIGN key(locacion) REFERENCES zoo(id)
);


/*         Description         */

SHOW COLUMNS FROM zonas;
SHOW COLUMNS FROM zoo;
SHOW COLUMNS FROM animal;