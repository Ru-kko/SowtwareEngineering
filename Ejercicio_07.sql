CREATE TABLE Airport (
  airportId INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  airportName VARCHAR(255) NOT NULL
);

CREATE TABLE StoreType (
  storetypeId INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  typeName VARCHAR(127) NOT NULL
);

CREATE TABLE Store (
  storeId INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  airportId INT NOT NULL,
  storeName VARCHAR(255) NOT NULL,
  typeID INT NOT NULL,
  FOREIGN KEY(typeID) REFERENCES StoreType(storetypeId),
  FOREIGN KEY(airportId) REFERENCES Airport(airportId)
);

CREATE TABLE Brand (
  brandId INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  brandName VARCHAR(255) NOT NULL
);

CREATE TABLE Product (
  productId INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  productName VARCHAR(255) NOT NULL,
  brandId INT NOT NULL,
  FOREIGN KEY(brandId) REFERENCES Brand(brandId)
);

CREATE TABLE Client (
  clientId INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  fristName VARCHAR(127) NOT NULL,
  lastName VARCHAR(127) NOT NULL
);

CREATE TABLE Bill (
  billId INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  clientId INT NOT NULL,
  storeId INT NOT NULL,
  soldDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  FOREIGN KEY(clientId) REFERENCES Client(clientId),
  FOREIGN KEY(storeId) REFERENCES Store(storeId)
);

CREATE TABLE Bill_Prod (
  billId INT NOT NULL,
  productId INT NOT NULL,
  count INT,
  FOREIGN KEY(billId) REFERENCES Bill(billId),
  FOREIGN KEY(productId) REFERENCES Product(productId),
  PRIMARY KEY(billId, productId)
);

-- View Of Espesific Brand
CREATE VIEW AdiddasProducts AS 
  SELECT productName FROM Product AS p INNER JOIN Brand as b ON b.brandId = p.brandId WHERE b.brandName = 'Adidas';

-- Procedure to add brand
DELIMITER//
CREATE PROCEDURE _add_brand( IN _brandName VARCHAR(255) )
BEGIN
  INSERT INTO Brand (
    brandName
  ) VALUES ( _brandName );
END//

-- Procedure to delete an airport with it's Id
DELIMITER//
CREATE PROCEDURE _delete_airport( IN _id_airport INT )
BEGIN
  DELETE FROM Airport
    WHERE Airport.airportId = _id_airport;
END//

-- Find stores in 'Aereopuerto El Dorado'
SELECT storeName FROM Store AS s INNER JOIN Airport AS a ON a.airportName = 'Aereopuerto El Dorado';
