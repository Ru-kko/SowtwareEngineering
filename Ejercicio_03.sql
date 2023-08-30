CREATE DATABASE ejercicio_03;
USE ejercicio_03;

CREATE TABLE IF NOT EXISTS role (
  IDRole INT NOT NULL PRIMARY KEY,
  type VARCHAR(15) NOT NULL
);

CREATE TABLE IF NOT EXISTS profile (
  profileID INT NOT NULL PRIMARY KEY,
  roleID INT NOT NULL,
  FOREIGN KEY(roleID) REFERENCES role(IDRole)
);

CREATE TABLE IF NOT EXISTS user (
  IDuser INT NOT NULL PRIMARY KEY,
  IDprofile INT NOT NULL UNIQUE,
  firstName VARCHAR(50),
  lastName VARCHAR(50),
  password VARCHAR(255),
  age INT,
  FOREIGN KEY(profileID) REFERENCES profile(profileID)
);

CREATE TABLE IF NOT EXISTS sede (
  IDSede INT NOT NULL PRIMARY KEY,
  name VARCHAR(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS sede_user (
  sedeID INT NOT NULL,
  userID INT NOT NULL,
  FOREIGN KEY(sedeID) REFERENCES sede(IDSede),
  FOREIGN KEY(userID) REFERENCES user(IDuser),
  PRIMARY KEY(sedeID, userID)
);

CREATE TABLE IF NOT EXISTS transaction (
  transactionID INT NOT NULL PRIMARY KEY,
  userID INT NOT NULL,
  sedeID INT NOT NULL,
  date DATETIME NOT NULL,
  detail TEXT,
  FOREIGN KEY(userID) REFERENCES user(IDuser),
  FOREIGN KEY(sedeID) REFERENCES sede(IDSede)
);

CREATE VIEW seller_july AS
  SELECT * FROM transaction
    INNER JOIN user ON transaction.userID = user.IDuser
    INNER JOIN profile ON profile.profileID = user.IDprofile
      WHERE profile.roleID = 3 AND
        (transaction.date BETWEEN "2023-07-01" AND "2023-07-31");
