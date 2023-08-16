CREATE DATABASE IF NOT EXIST tienda;
USE tienda;

-- Modalidad tabla
CREATE TABLE modalidad (
  IdModalidad INT PRIMARY KEY AUTOINCRMENT,
  Nombre VARCHAR(100) NOT NULL,
  Activo INT
);

--   -- Insert
INSERT INTO modalida (
  Nombre,
  Activo
) VALUES ( 'Domicilio', 1 ),
  ( 'Contra Entrega', 1 );

--   -- Update
UPDATE modalida SET Activo = 0, Nombre = 'XY' WHERE IdModalidad = 1;

-- -- Delete

DELETE FROM modalida WHERE WHERE IdModalidad = 0;
DELETE FROM modalida WHERE WHERE Nombre LIKE '%a%';

SELECT IdFactura FROM facturas WHERE fecha >= '01/07/2023-00:00' AND fecha <= '31/07/2023-23:59';

SELECT PrimerNombre, NombreEmpresa 
  FROM Empresa e
  INNER JOIN Cliente c ON c.IdEmpresa = e.IdEmpresa
  WHERE e.NombreEmpresa = 'Amazon'
  ORDER BY PrimerNombre LIMIT(50);

-- Empresa tabla
CREATE TABLE  Empresa (
  attribute(s)
);
