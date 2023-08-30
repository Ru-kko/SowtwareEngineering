SELECT DISTINCT nombre FROM tripulacion ORDER BY nombre;

SELECT nombre FROM tripulacion WHERE nombre <> 'Diana';

SELECT nombre, fechaNacimiento FROM tripulacion WHERE fechaNacimiento BETWEEN '2023/08/01' AND '2023/08/31';

SELECT nombre FROM tripulacion WHERE codigo IN(15,50,70); -- codigo = 15 OR codigo = ...

--__________________________________________________________________________________________________________--

SELECT COUNT(*) AS cantidad FROM precio WHERE idProducto = 123;

SELECT SUM(precio) AS total FROM precio WHERE idProducto = 1;
