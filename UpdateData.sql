UPDATE country
SET 
    Code = "COL",
    Name = "Colombia",
    Continent = "South America",
    Region = "South America",
    SurfaceArea = 1138914,
    IndepYear = 1810,
    Population = 50880000,
    LifeExpectancy = 74,
    GNP = 726200,
    GNPOld = 102896,
    LocalName = "Colombia",
    GovernmentForm = "Republic",
    HeadOfState = "Gustabo Petro",
    Capital = 2317
WHERE Code = "COL"
    or Code2 = "CO";

UPDATE country
SET 
    Population = 19120000,
    LifeExpectancy = 77.3,
    GNP = 458500,
    GNPOld = 72949,
    HeadOfState = "Gabriel Boric"
WHERE Code = "CHL";

UPDATE country
SET 
    Name = CONCAT(Name," Post Urss Country") 
WHERE 
    Code="RUS" OR Code="ARM" OR 
    Code="AZE" OR Code="GEO" OR 
    Code="BLR" OR Code="MDA";

UPDATE country
SET 
    Population = 329500000,
    LifeExpectancy = 77.28,
    GNP = 2169000,
    GNPOld = 8510700,
    HeadOfState = "Joe Biden"
WHERE Code = "USA"
    AND (NOT Code = "COL");

UPDATE country
SET 
    Population = 28440000,
    LifeExpectancy = 72.07,
    GNP = 493600,
    GNPOld = 95023,
    HeadOfState = "Nicoláz Maduro"
WHERE countryName = "Venezuela"
    AND HeadOfState = "Hugo Chávez Frías";

UPDATE city
SET 
    Name = "Bogotá D.C"
WHERE countryCode = "COL" AND Name = "Santafé de Bogotá";

UPDATE city
SET
    Population=Population-10000 
WHERE countryCode = "VEN" AND Population > 800000;

UPDATE city
SET
    Name = Concat(Name, " +10M people")
WHERE NOT Population < 10000000;

UPDATE city
SET
    Name = "Ciudad Del Vaticano"
WHERE countryCode = "VAT" OR (Population < 500 AND Population > 450);

UPDATE cyty
SET
    Name = "Cali or city in Tolima"
WHERE Name= "Cali" XOR District= "Tolima";

UPDATE countrylanguage
    SET Language = "Español"
WHERE IsOfficial = "T" AND Language = "Spanish";

UPDATE countrylanguage
    SET Language = CONCAT(Language, "-noOfficial")
WHERE Percentage > 99 AND IsOfficial = "F";